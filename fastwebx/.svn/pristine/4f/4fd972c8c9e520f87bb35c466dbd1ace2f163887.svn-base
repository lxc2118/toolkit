package com.fastwebx.test.valve;

import com.alibaba.citrus.service.pipeline.PipelineContext;
import com.alibaba.citrus.service.pipeline.Valve;

public class MyValve1 implements Valve{

	@Override
	public void invoke(PipelineContext pipelineContext) throws Exception {
		System.out.println("MyValve1 started.");
		pipelineContext.invokeNext();
		System.out.println("MyValve1 end.");
		
	}

}
