package com.fastwebx.common.bus.event;

public class SplEvent<T> extends Event<T> {
	
	public SplEvent(String eventId, T param) {
		super(eventId, param);
		
	}
	public SplEvent(){
		
	}
	public SplEvent( T param) {
		super();
		this.param=param;
	}
	@Override
	public String acqEventId() {
		if(this.eventId==null)
			this.eventId = this.getClass().getSimpleName();
		return this.eventId;
	}
	
}
