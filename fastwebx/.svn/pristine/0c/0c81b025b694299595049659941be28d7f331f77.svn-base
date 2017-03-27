package com.fastwebx.web.http.server;

import com.alibaba.fastjson.JSON;
import com.fastwebx.common.exp.WrongSign;
import com.fastwebx.common.util.Md5Util;
import com.fastwebx.common.util.StrUtil;
import com.fastwebx.web.SmplCtrl;
import com.fastwebx.web.http.result.HttpResult;
import com.fastwebx.web.http.result.imp.ClazzHttpResult;
import com.fastwebx.web.http.result.imp.DefClazzHttpResult;
import com.fastwebx.web.http.result.imp.DefHttpResult;
import com.fastwebx.web.http.server.param.HttpServerParam;
import com.fastwebx.web.json.IJsonBuilder;

/**
 * 用于内部之间项目交互
 * @author mj
 */
public abstract class HttpServerCtrl<Param,ResultData> extends SmplCtrl<HttpServerParam> {
	
	protected String signKey;

	protected IJsonBuilder<Param> jsonBuilder;
	
	
	
	public IJsonBuilder<Param> getJsonBuilder() {
		return jsonBuilder;
	}

	public void setJsonBuilder(IJsonBuilder<Param> jsonBuilder) {
		this.jsonBuilder = jsonBuilder;
	}

	public String getSignKey() {
		if(signKey==null){
			return "sjAdmin1";
		}
		return signKey;
	}

	public void setSignKey(String signKey) {
		this.signKey = signKey;
	}

	@Override
	protected final Object doExecute(HttpServerParam httpParam) {
		HttpResult result = this.createResult$(httpParam);
		try{
			checkSign(httpParam);
			ResultData rd = this.process(this.buildParam(httpParam));
			if(rd!=null)
				result.setData(rd);
			result.setSucc(true);
		}catch(Exception e){
			e.printStackTrace();
			result.setSucc(false);
			result.setErrorCode(e.getClass().getSimpleName());
			result.setMsg(e.getMessage());
		}
		return result.toJson();
	}
	/**
	 * 将httpparam 转化成类的param
	 * @param httpParam
	 * @return
	 */
	protected Param buildParam(HttpServerParam httpParam){
		String json = httpParam.getJson();
		if(StrUtil.isEmpty(json)) return null;
		IJsonBuilder<Param> jsonBuilder = this.getJsonBuilder();
		if(jsonBuilder==null) return null;
		return jsonBuilder.build(JSON.parseObject(json));
	}

	/**
	 * 检查签名是否正确
	 * @param param
	 */
	protected void checkSign(HttpServerParam param) {
		String sign = Md5Util.encode(StrUtil.link(param.getJson(),param.getTime(),getSignKey()));
		if(!sign.equals(param.getSign()))
			throw new WrongSign();
	}

	/**
	 * 真正处理
	 * @param param
	 * @return
	 */
	protected abstract ResultData process(Param param) ;

	protected HttpResult createResult$(HttpServerParam param) {
		
		return new DefClazzHttpResult();
	}
	
	
}
