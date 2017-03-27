package com.fastwebx.codeAuto.context;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;


public class Context {
	private static DataSource dataSource;
	private static Connection conn;
	private static String outPath="d:/"; 
	private static String pkgName = "com.alipay";
	private static boolean useTddl = false;
	
	public static boolean getUseTddl() {
		return useTddl;
	}
	public void setUseTddl(boolean useTddl) {
		Context.useTddl = useTddl;
	}
	public static String getPkgName() {
		return pkgName;
	}
	public void setPkgName(String pkgName) {
		Context.pkgName = pkgName;
	}
	public static String getOutPath() {
		return outPath;
	}
	public void setOutPath(String outPath) {
		Context.outPath = outPath;
	}
	public static Connection getConn() {
		if(conn==null)
			try {
				conn = dataSource.getConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return conn;
	}
	
	public void setDataSource(DataSource dataSource) {
		Context.dataSource = dataSource;
	}
	
	
}
