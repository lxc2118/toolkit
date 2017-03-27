package com.fastwebx.common.bus;

import com.fastwebx.common.bus.event.Event;
import com.fastwebx.common.bus.event.IEvent;
import com.fastwebx.common.bus.event.IEventProcessor;

import junit.framework.TestCase;

public class BusTest extends TestCase {
	public void testFire(){
		MapBus bus = new MapBus();
		bus.bind("aaa", new IEventProcessor(){

			@Override
			public void process(IEvent pojo) {
				System.out.println("pojo.obj="+pojo.acqParam());
				
			}
			
		});
		bus.bind("bbb", new TestProcessor());
		bus.bind("bbb", new TestProcessor1());
		
		bus.fire("aaa");
		System.out.println("================");
		bus.fire(new Event("bbb",123));
		System.out.println("================");
		bus.fire(new Event("ccc",456));
		System.out.println("================");
		bus.binds("ccc",new TestProcessor(),new TestProcessor1());
		bus.fire(new Event("ccc",789));
		
	}
	class TestProcessor implements IEventProcessor{

		@Override
		public void process(IEvent pojo) {
			System.out.println("pojo.evnetId:"+pojo.acqEventId()+ " pojo.obj:"+pojo.acqParam());
		}
		
	}
	
	class TestProcessor1 implements IEventProcessor{

		@Override
		public void process(IEvent pojo) {
			System.out.println("TestProcessor1:"+pojo.acqEventId()+ " TestProcessor1.obj:"+pojo.acqParam());
		}
		
	}
	
}
