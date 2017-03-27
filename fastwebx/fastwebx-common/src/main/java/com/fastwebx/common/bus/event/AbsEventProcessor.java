package com.fastwebx.common.bus.event;


public abstract class AbsEventProcessor<T> implements IEventProcessor{

	@Override
	public void process(IEvent pojo) {
		doProcess((T)pojo.acqParam());
		
	}
	
	protected abstract void doProcess(T t);
	
}
