package com.fastwebx.common.reflect.method.util.inf;

import com.fastwebx.common.reflect.method.util.processor.IGeterProcessor;

/**
 * @author mj
 */
public class TGetProcessor implements IGeterProcessor {

	@Override
	public void process(String name, Object val) {
		System.out.println("===============");
		System.out.println("name="+name);
		System.out.println("val="+val);

	}

}
