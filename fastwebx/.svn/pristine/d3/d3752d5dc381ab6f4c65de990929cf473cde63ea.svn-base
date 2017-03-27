package com.fastwebx.web.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.TypeUtils;
import com.fastwebx.common.reflect.method.util.MethodUtil;
import com.fastwebx.common.reflect.method.util.processor.IGeterProcessor;
import com.fastwebx.common.reflect.valueTrans.MethodTrans;
import com.fastwebx.web.inf.IToJSON;
/**
 * json工具类
 * @author ytrgmj
 *
 */
public class JsonUtil {
	public static String toJson(Object object){
		if(object==null){
			return null;
		}	
		if(object instanceof JSON){
			return ((JSON)object).toJSONString();
		}
		if(object instanceof IToJSON){
			return ((IToJSON)object).toJson().toJSONString();
		}
		return JSON.toJSONStringWithDateFormat(object,"yyyy-MM-dd");
	    
	}
	
	public static JSON parse(Object obj){
		if(obj==null) 
			return null;
		if(obj instanceof JSON)
			return (JSON)obj;
		if(obj instanceof IToJSON){
			return ((IToJSON)obj).toJson();
		}
		
		return (JSON)JSON.toJSON(obj);
		
	}
	/**
	 * json化时过滤掉filters里面的数据
	 * @param obj
	 * @param filters
	 * @return
	 */
	public static JSON parseWithFilter(Object obj,String ... noJsons){
		if(obj==null) return null;
		final HashSet<String> hashSet=new HashSet<String>();
		if(noJsons!=null)
			for(String filter:noJsons)
				hashSet.add(filter);
		final JSONObject ret = new JSONObject();
		MethodUtil.processGets(obj, new IGeterProcessor() {
			@Override
			public void process(String name, Object val) {
				if(!hashSet.contains(name)){
					ret.put(name, val);
				}
				
			}
		});
		return ret;
	}
	
}
