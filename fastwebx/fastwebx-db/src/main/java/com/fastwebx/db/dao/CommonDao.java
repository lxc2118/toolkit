package com.fastwebx.db.dao;

import java.util.Collection;

import org.mybatis.spring.SqlSessionTemplate;

import com.fastwebx.common.dao.inf.IModifier;

/**
 * 一个通用的dao
 * @author mj
 */
public class CommonDao {
	
	protected SqlSessionTemplate sqlSessionTemplate;
	
	
	
	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}



	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	public void add(Object obj) {
		sqlSessionTemplate.delete(this.getStatementName(obj,"insert"), obj);
	}

	public int update(Object obj) {
		return sqlSessionTemplate.delete(this.getStatementName(obj,"update"), obj);
	}
	
	public int del(Object obj) {
		return sqlSessionTemplate.delete(this.getStatementName(obj,"delete"), obj);
	}

	public <T> T get(Class<T> clazz,Object pk) {
		return sqlSessionTemplate.selectOne(this.getStatement(clazz,"get"),pk);
	}


	protected String getStatementName(Object obj, String name) {
		return getStatement(obj.getClass(),name);
	}
	protected String getStatement(Class classT, String name) {
		
		StringBuffer sb = new StringBuffer();
		if (classT != null) {
			sb.append(classT.getName()).append('.');
		}
		sb.append(name);
		return sb.toString();
	}
}
