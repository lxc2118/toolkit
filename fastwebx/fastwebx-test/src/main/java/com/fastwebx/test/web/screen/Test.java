package com.fastwebx.test.web.screen;

import com.alibaba.citrus.turbine.Context;
import com.alibaba.citrus.turbine.dataresolver.Param;

public class Test { 
	public void execute(@Param("i") Integer i,Context context){
		if(i==null) i=0;
		context.put("error2", "error2:"+i);
		if(i==1)
			throw new RuntimeException("出错了");
		
		System.out.println("test screen");
	}
}
