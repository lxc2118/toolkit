package com.fastwebx.common.bus.event;

public class Event<T> implements IEvent<T> {
	protected String eventId;
	protected T param;
	@Override
	public String acqEventId() {
		return eventId;
	}
	@Override
	public T acqParam() {
		return param;
	}
	
	public Event(){
		
	}
	public Event(String eventId, T param) {
		super();
		this.eventId = eventId;
		this.param = param;
	}
	
}
