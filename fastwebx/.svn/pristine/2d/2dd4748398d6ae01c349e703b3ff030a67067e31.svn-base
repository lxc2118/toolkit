package com.fastwebx.web.postProcess;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fastwebx.common.inf.IProcessor;
import com.fastwebx.web.base.inf.IProcessJSON;

public class PostProcessorContext implements IProcessJSON {
	private static PostProcessorContext instance = new PostProcessorContext();
	private List<IProcessJSON> list;
	
	
	
	public List<IProcessJSON> getList() {
		return list;
	}



	public void setList(List<IProcessJSON> list) {
		this.list = list;
	}



	public static PostProcessorContext get(){
		return instance;
	}
	
	
	
	@Override
	public JSON process(JSON pojo) {
		if(list!=null){
			for(IProcessJSON p:list){
				pojo = p.process(pojo);
			}
		}
		return pojo;
	}



	private PostProcessorContext(){
		
	}
}
