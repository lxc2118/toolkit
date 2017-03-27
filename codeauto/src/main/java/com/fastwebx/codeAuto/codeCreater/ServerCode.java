package com.fastwebx.codeAuto.codeCreater;

import org.apache.velocity.VelocityContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fastwebx.codeAuto.codeCreater.base.ContextCode;
import com.fastwebx.codeAuto.context.Context;
@Service
public class ServerCode extends ContextCode{
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String buildPath() {
		return "src/main/resources/server.properties";
	}
	@Override
	protected VelocityContext buildContext() {
		
		VelocityContext ret = super.buildContext();
		ret.put("url", url);
		ret.put("username", username);
		ret.put("password", password);
		ret.put("dbGroupKey", dbGroupKey);
		ret.put("appname", appname);
		ret.put("useTddl", Context.getUseTddl());
		
		return ret;
	}
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
	
	private String appname;
	

	private String dbGroupKey;
	
	@Value("${jdbc.password}")
	private String password;
}
