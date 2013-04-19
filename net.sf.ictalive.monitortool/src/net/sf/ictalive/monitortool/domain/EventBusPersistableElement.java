package net.sf.ictalive.monitortool.domain;

import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableElement;

public class EventBusPersistableElement implements IPersistableElement
{

	@Override
	public String getFactoryId()
	{
		return "blah";
	}

	@Override
	public void saveState(IMemento arg0)
	{
		// TODO Auto-generated method stub

	}

}
