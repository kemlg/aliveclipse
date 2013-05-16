package edu.bath.matchmaker.util;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.tools.Diagnostic;
import javax.tools.DiagnosticListener;
import javax.tools.FileObject;
import javax.tools.ForwardingJavaFileManager;
import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileManager.Location;
import javax.tools.JavaFileObject;
import javax.tools.JavaFileObject.Kind;
import javax.tools.SimpleJavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;

/**
 * Utility that can at runtime create hierarchies of java classes.
 * 
 * <p>Not to be confused with hot-spot. :)
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class JustInTimeCompiler {
    private final JavaCompiler compiler = javax.tools.ToolProvider.getSystemJavaCompiler();
    private final ResettableDiagnostics diagnostics = new ResettableDiagnostics();
    private final MemoryFileManager fileManager = new MemoryFileManager(compiler.getStandardFileManager(diagnostics, Locale.ENGLISH, /*Charset*/null));

    public JustInTimeCompiler() { }

    /**
     * Compiles a single type (class, interface), given its name and its full source code.
     *
     * @param typeName the name of the type to be compiled
     * @param source the source code of the type
     * @return a {@link Class} object representing the result of the compilation
     */
    public Class<?> compileSingle(String typeName, String source) {
        compile(Arrays.asList(createClass(typeName, source)));

        try {
            return Class.forName(typeName, true, fileManager.classLoader);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Returns a class loader that has access to the classes compiled by this compiler.
     *
     * @return a class loader that has access to the classes compiled by this compiler
     */
    public ClassLoader getClassLoader() {
        return fileManager.classLoader;
    }

    /**
     * Creates a java class hierarchy, rooted at the given {@code rootClass}. The hierarchy relation is defined by a {@link Function}
     * from parents to collections of respective kids. The result of this method is a {@code Map} from the name of every generated
     * class, to the actual generated {@link Class} object, plus an entry with the name of the root class and its
     * respective {@code Class}, for completeness.
     *
     * @param rootClass the root class of all generated classes (may be {@code Object.class})
     * @param parentsToKids a function that when given a class of the hierarchy, it returns the subclasses of it that should be generated (or
     * an empty collection or {@code null} if the class is a leaf). If the function does not return subclasses for the root class, no class will
     * be generated at all
     * @return a {@code Map<String, Class<?>>} from the names of the generated classes (plus the root class), to their respective
     * {@code Class} objects
     */
    public Map<String, Class<?>> createHierarchy(Class<?> rootClass, Multimap<String, String> parentsToKids) {
        //it's easier for clients to describe trees top-to-bottom (without necessarily having to create the hierarchy tree first at all), but
        //I here need the inverse relation, i.e. a set of kid --> parent relationships
        Map<String, String> kidsToParents = Maps.newHashMap();
        LinkedList<String> queue = Lists.newLinkedList(Arrays.asList(rootClass.getName()));
        while (!queue.isEmpty()) {
            String parent = queue.remove();
            Collection<String> kids = parentsToKids.get(parent);
            if (kids != null) {
                for (String kid : kids) {
                    queue.add(kid);
                    kidsToParents.put(kid, parent);
                }
            }
        }

        //don't worry about the "correct" compilation order; let the compiler figure it out
        List<JavaFileObject> filesToBeCompiled = Lists.newArrayList();
        for (Entry<String, String> entry : kidsToParents.entrySet()) {
            String kid = entry.getKey();
            String parent = entry.getValue();
            filesToBeCompiled.add(createEmptySubclass(kid, parent));
        }

        compile(filesToBeCompiled);
        
        Map<String, Class<?>> classes = Maps.newHashMap();

        try {
            for (String generatedClass : kidsToParents.keySet()) {
                Class<?> clazz = Class.forName(generatedClass, true, fileManager.classLoader);
                classes.put(generatedClass, clazz);
            }
            classes.put(rootClass.getName(), rootClass);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return classes;
    }

    private void compile(Iterable<? extends JavaFileObject> filesToBeCompiled) {
        diagnostics.clear();
        CompilationTask task = compiler.getTask(
                null, fileManager, diagnostics, null, null,
                filesToBeCompiled);

        boolean result = task.call();

        if (!result) {
            throw new RuntimeException("Compilation failed: \n" + Joiner.on("\n").join(diagnostics.getDiagnostics()));
        }
    }

    private static JavaFileObject createEmptySubclass(String className, String superClass) {
        StringBuilder sb = new StringBuilder(128);
        String pgk = getPackageName(className);
        if (pgk.length() > 0) {
            sb.append("package ").append(pgk).append(";\n");
        }
        sb.append("public class ").append(getSimpleClassName(className)).append(" extends ").append(superClass).append("{}");

        return createClass(className, sb.toString());
    }

    private static JavaFileObject createClass(String className, final String source) {
        return new SimpleJavaFileObject(URI.create(asJavaFilePath(className)), JavaFileObject.Kind.SOURCE) {
            @Override
            public CharSequence getCharContent(boolean ignoreEncodingErrors)
                    throws IOException, IllegalStateException,
                    UnsupportedOperationException {
                return source;
            }
        };
    }

    /**
     * Returns the package name of a fully qualified class name, or an empty string if the class resides in the default package.
     *
     * @param className a fully qualified class name
     * @return the package name of the specified class
     */
    public static String getPackageName(String className) {
        int idx = className.lastIndexOf('.');
        if (idx != -1) {
            return className.substring(0, idx);
        }
        return "";
    }

    /**
     * Returns the simple name of a fully qualified class name, that is, the class name without the package part of it.
     *
     * @param className a fully qualified class name
     * @return the simple (unqualified) class name of the class
     */
    public static String getSimpleClassName(String className) {
        int idx = className.lastIndexOf('.');
        if (idx != -1) {
            return className.substring(idx + 1);
        }
        return className;
    }

    private static String asJavaFilePath(String className) {
        return className.replace('.', '/') + ".java";
    }

    private static class MemoryFileManager extends ForwardingJavaFileManager<StandardJavaFileManager> {
        private final Map<String, MemoryFile> filesByName = Maps.newHashMap();
        private final Multimap<String, MemoryFile> filesByPackage = HashMultimap.create();

        final ClassLoader classLoader = new ClassLoader(super.getClassLoader(StandardLocation.CLASS_PATH)) {
            @Override
            protected Class<?> findClass(String name) throws ClassNotFoundException {
                MemoryFile file = filesByName.get(name);
                if (file != null) {
                    byte[] bytes = file.baos.toByteArray();
                    return defineClass(name, bytes, 0, bytes.length);
                }
                return super.findClass(name);
            }
        };


        MemoryFileManager(StandardJavaFileManager fileManager) {
            super(fileManager);
        }

        @Override
        public JavaFileObject getJavaFileForOutput(Location location, String className, Kind kind, FileObject sibling) throws IOException {
            MemoryFile jfo = new MemoryFile(className, kind);
            filesByName.put(className, jfo);
            filesByPackage.put(getPackageName(className), jfo);
            return jfo;
        }
        
        @Override
        public ClassLoader getClassLoader(Location location) {
            if (location == StandardLocation.CLASS_PATH) {
                return classLoader;
            }
            return super.getClassLoader(location);
        }

        @Override
        public String inferBinaryName(Location location, JavaFileObject file) {
            if (filesByName.containsKey(file.getName())) {
                return file.getName();
            }
            return super.inferBinaryName(location, file);
        }

        @SuppressWarnings("unchecked")
        @Override
        public Iterable<JavaFileObject> list(Location location, String packageName, Set<Kind> kinds, boolean recurse) throws IOException {
            Iterable<JavaFileObject> defaultList = super.list(location, packageName, kinds, recurse);
            if (filesByPackage.containsKey(packageName)) {
                return Iterables.concat((Iterable)filesByPackage.get(packageName), defaultList);
            }
            return defaultList;
        }
    }

    private static class MemoryFile extends SimpleJavaFileObject {
        private ByteArrayOutputStream baos;

        MemoryFile(String name, Kind kind) {
            super(URI.create(name), kind);
        }

        @Override
        public InputStream openInputStream() throws IOException,
                IllegalStateException, UnsupportedOperationException {
            return new ByteArrayInputStream(baos.toByteArray());
        }

        @Override
        public OutputStream openOutputStream() throws IOException,
                IllegalStateException, UnsupportedOperationException {
            return baos = new ByteArrayOutputStream();
        }
    }

    private static class ResettableDiagnostics implements DiagnosticListener<JavaFileObject> {
        private final List<Diagnostic<? extends JavaFileObject>> diagnostics = Lists.newArrayList();

        public void report(Diagnostic<? extends JavaFileObject> diagnostic) {
            diagnostics.add(diagnostic);
        }

        public List<Diagnostic<? extends JavaFileObject>> getDiagnostics() {
            return Collections.unmodifiableList(diagnostics);
        }

        public void clear() {
            diagnostics.clear();
        }
    }
}
