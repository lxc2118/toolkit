package com.fastwebx.property.dbproperty;

import java.sql.Connection;
import java.sql.DriverManager;

import com.fastwebx.property.dbproperty.inf.IConnGeter;


public class JdbcConnGeter implements IConnGeter {
	
	
	private String userName;
	private String url;
	private String password;
	private String className;
	private boolean inited = false;
	
	public JdbcConnGeter(){
		
	}
	
	public JdbcConnGeter(String userName, String password, String url,
			String className) {
		super();
		this.userName = userName;
		this.url = url;
		this.password = password;
		this.className = className;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getClassName() {
		return className;
	}


	public void setClassName(String className) {
		this.className = className;
	}


	@Override
	public Connection getConn() {
		if(!inited){
			try {
				Class.forName(className);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		Connection cn = null;
		try{
			
			cn = DriverManager.getConnection(getUrl(),getUserName(),getPassword());
		}catch(Exception e){
			e.printStackTrace();
		}
		return cn;
	}
	
}
