package com.fastwebx.web.base;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.ServletWebRequest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fastwebx.web.context.ResponseContext;
import com.fastwebx.web.inf.ICtrl;
import com.fastwebx.web.json.JsonParserContext;
import com.fastwebx.web.postProcess.PostProcessorContext;
import com.fastwebx.web.util.JsonUtil;

public  abstract class  JsonCtrl <Param,Server> extends BaseCtrl<Server> 
	implements ICtrl<Param>{
	/**
	 * 是否需要json
	 */
	protected boolean needJson = true;
	/**
	 * 日期格式化
	 */
	protected boolean needFormatDate = false;	
	/**
	 * 后续处理
	 */
	protected boolean needPostProcessor = false;
	@Override
	@RequestMapping()
	@ResponseBody()
	public  String execute(Param param) {
		init();
		preProcess(param);
		param = this.refresh(param);
		check(param);
		Object ret = doExecute(param);
		return toStr(ret);
	}
	
	protected String toStr(Object ret){
		
		
		JSON obj = toJson(ret);
		obj = postProcessor(obj);
		if(obj==null) obj=new JSONObject();
		return obj.toString();
		
		
	}
	
	abstract protected Object doExecute(Param param);
	
	
	protected JSON postProcessor(JSON obj){
		if(needPostProcessor)
			obj = PostProcessorContext.get().process(obj);
		return obj;
	}
	
	protected JSON toJson(Object obj){
		if(obj instanceof JSON) return (JSON)obj;
		if(needJson)
			return JsonParserContext.get().parse(obj);
		return new JSONObject();
	}

	abstract protected Param refresh(Param param);  
	
	

}
