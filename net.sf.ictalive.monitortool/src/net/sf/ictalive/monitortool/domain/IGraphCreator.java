package net.sf.ictalive.monitortool.domain;

import net.sf.ictalive.monitortool.views.StandaloneGraphView;
import net.sf.ictalive.runtime.event.Event;


public interface IGraphCreator
{

	void update(StandaloneGraphView standaloneGraphView, Event event);

	void generate(StandaloneGraphView sgv);

}
