package net.sf.ictalive.svcrepo.tests;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses( { ClasspathLoading.class, FileLoading.class,
		TestRepositoryLoading.class })
public class AllTests {

}
