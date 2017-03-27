package com.fastwebx.common.bus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.fastwebx.common.bus.event.IEvent;
import com.fastwebx.common.bus.event.IEventProcessor;

public class MapBus extends AbsBus{
	private HashMap<String, List<IEventProcessor>> map = null;
	
	public MapBus(){
		
	}

	
	
	@Override
	public List<IEventProcessor> acqDefult() {
		return list;
	}


	private List<IEventProcessor> list = new ArrayList<IEventProcessor>();
	 
	public void add(IEventProcessor defaultEventProcessor) {
		list.add(defaultEventProcessor);
	}
	@Override
	protected synchronized List<IEventProcessor> acqListByEvent(IEvent event){
		List<IEventProcessor> list = null;
		if(map!=null){
			list = map.get(event.acqEventId());
		}
		return list;
	}
	
	
	
	@Override
	protected synchronized void doBind(String id,IEventProcessor processor){
		if(map==null) map = new HashMap<String, List<IEventProcessor>>();
		List<IEventProcessor> list = map.get(id);
		if(list==null){
			list = new ArrayList<IEventProcessor>();
			map.put(id, list);
		}
		list.add(processor);
	}
	
	
}
