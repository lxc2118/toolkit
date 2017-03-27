package com.fastwebx.web.http.result;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fastwebx.web.inf.IToJSON;

/**
 * 提供http解析结果
 * {
 * 	succ:true|false,	//是否成功
 *  errorCode:'NotEnghouMeny', //错误代码
 *  msg:'金钱不足',	//错误信息
 *  data:{	//客户端用参数，需要解析
 *  
 *  } 
 * }
 * @author mj
 * 
 */
public abstract class HttpResult<D> implements IToJSON{
	protected boolean succ;
	protected String errorCode;
	protected String msg;
	
	protected D data;
	
	public D getData() {
		return data;
	}

	public void setData(D data) {
		this.data = data;
	}

	public boolean isSucc() {
		return succ;
	}

	public void setSucc(boolean succ) {
		this.succ = succ;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	/**
	 * 将json化的result解析一下
	 * @param result
	 */
	public void parse(String result) {
		try{
			JSONObject json = JSON.parseObject(result);
			this.succ = json.getBooleanValue("succ");
			this.errorCode = json.getString("errorCode");
			this.msg = json.getString("msg");
			parseData$(json.getJSONObject("data"));
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
		
	}
	/**
	 * 解析数字
	 * @param jsonObject
	 */
	protected void parseData$(JSONObject jsonObject){
		
	}
	
	public JSON toJson(){
		JSONObject obj = new JSONObject();
		obj.put("succ", this.succ);
		if(errorCode!=null)
			obj.put("errorCode", errorCode);
		if(msg!=null)
			obj.put("msg", msg);
		if(data!=null)
			setData2Json$(obj,data);
		return obj;
	}
	/**
	 * 将data放到json中
	 * toJson用
	 * @param obj
	 * @param data2
	 */
	protected void setData2Json$(JSONObject obj, D data) {
		
	}

}
