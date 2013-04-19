package net.sf.ictalive.service.template.ui;

import java.util.Collection;
import java.util.concurrent.Callable;

public interface MultipleObjectSource<Type> extends Callable<Collection<Type>> {
}
