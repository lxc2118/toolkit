package com.fastwebx.common.bus;

import java.util.List;

import com.fastwebx.common.bus.event.IEvent;
import com.fastwebx.common.bus.event.IEventProcessor;
import java.util.Collection;
/**
 * 
 * @author ytrgmj
 *
 */
public abstract class AbsBus {
	
	public AbsBus(){
		
	}
	
	public abstract List<IEventProcessor> acqDefult();
	
	public void binds(String id,IEventProcessor... processores){
		if(id==null) return;
		for(IEventProcessor processor:processores){
			bind(id,processor);
		}
	}
	 
	public void bind(Class  clazz,IEventProcessor processor){
		if(clazz!=null)
			bind(clazz.getSimpleName(),processor);
	}
	
	public void bind(IEvent event,IEventProcessor processor){
		if(event!=null)
			bind(event.acqEventId(),processor);
	}
	
	public void fire(final String id){
		IEvent event = new IEvent(){
			public String acqEventId(){
				return id;
			}
			public Object acqParam(){
				return null;
			}
		};
		this.fire(event);
	}
	
	public  void bind(String id,IEventProcessor processor){
		if(id==null || processor==null) return;
		doBind(id,processor);
	}
	
	protected abstract void doBind(String id,IEventProcessor processor);
	
	
	public  void fire(IEvent event){
		
		
		List<IEventProcessor> defaults = this.acqDefult();
		if(defaults!=null){
			for(IEventProcessor defaultEventProcessor:defaults){
				defaultEventProcessor.process(event);
			}
		}
		
		Collection <IEventProcessor> list = acqListByEvent(event); 
		if(list!=null){ 
			doFire(event,list);
		}
		
	}
	
	protected void doFire(IEvent event,Collection<IEventProcessor> list){
		synchronized(this){
			for(IEventProcessor processor:list){
				processor.process(event);
			}
		}
	}
	
	abstract protected List<IEventProcessor> acqListByEvent(IEvent event);
}
