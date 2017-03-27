package com.fastwebx.property.dbproperty;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;











import org.springframework.jdbc.core.PreparedStatementCallback;

import com.fastwebx.property.dbproperty.annotation.GetFromDb;
import com.fastwebx.property.dbproperty.annotation.SaveToDb;
import com.fastwebx.property.dbproperty.annotation.SetToDb;
import com.fastwebx.property.dbproperty.annotation.TableName;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class DbProxy implements MethodInterceptor{
	private Class clazz;
	private Map<String, Object> datas = new HashMap<String,Object>();
	public DbProxy(Class clazz){
		this.clazz = clazz;
	}
	public Object intercept(Object object, Method method, Object[] params,
			MethodProxy proxy) throws Throwable {
		GetFromDb pro = method.getAnnotation(GetFromDb.class);
		TableName tableAnno = (TableName)clazz.getAnnotation(TableName.class);
		String tableName = getTableName(tableAnno);
	System.out.println("tableName="+tableName);
		SaveToDb saveToDb = method.getAnnotation(SaveToDb.class);
		if(saveToDb!=null){
			saveToDb(tableName,tableAnno);
			return null; 
		}
		
		if(pro!=null){
			String columnName = getGetColumnName(method,pro);
			String value = doGetFromDb(tableName,columnName,tableAnno);
			return parse(value,method.getReturnType(),pro);
		}
		
		SetToDb setToDb = method.getAnnotation(SetToDb.class);
		if(setToDb!=null){
			if(params.length>0)
				datas.put(this.getSaveColumnName(method, setToDb), getSetValue(params[0],setToDb));
			return null;
		}
		
		
		return proxy.invokeSuper(object, params);
	}
	
	protected String getSetValue(Object obj,SetToDb setToDb){
		if(obj instanceof Date){
			SimpleDateFormat format = new SimpleDateFormat(setToDb.dateFormat());
			return format.format((Date)obj);
		}
		return obj.toString();
	}
	
	protected void saveToDb(String tableName ,TableName tableAnno){
		for(String key:datas.keySet()){
			doSaveToDb(tableName,key,datas.get(key).toString(),tableAnno);
		}
	}
	
	protected String doGetFromDb(String tableName,String columnName,TableName tableAnno){
		JdbcTemplate templet = ConnFactory.getTemplet();
		String ret=null;
		String keyColumn="sysKey";
		String valueColumn="sysValue";
		if(tableAnno!=null){
			keyColumn = tableAnno.keyColumn();
			valueColumn = tableAnno.valueColumn();
		}
		if(templet!=null){
			StringBuffer sb = new StringBuffer();
			sb.append("select ")
				.append(valueColumn)
				.append(" from ")
				.append(tableName)
				.append(" where ")
				.append(keyColumn)
				.append(" = '")
				.append(columnName)
				.append("'");
			
			List list =templet.queryForList(sb.toString());
			if(list.size()>0)
				ret = ((Map)list.get(0)).get(valueColumn).toString();
				
		}
		return ret;
	}
	
	
	protected void doSaveToDb(String tableName,final String key,final String value,TableName tableAnno){
		JdbcTemplate templet = ConnFactory.getTemplet();
		String keyColumn="sysKey";
		String valueColumn="sysValue";
		if(tableAnno!=null){
			keyColumn = tableAnno.keyColumn();
			valueColumn = tableAnno.valueColumn();
		}
		if(templet!=null){
			StringBuffer updateSql = new StringBuffer();
			updateSql.append("update ");
			updateSql.append(tableName);
			updateSql.append(" set ");
			updateSql.append(valueColumn);
			updateSql.append(" = ? where ");
			updateSql.append(keyColumn);
			updateSql.append(" = ?");
			int cnt=templet.execute(updateSql.toString(),new PreparedStatementCallback<Integer>() {
				public Integer doInPreparedStatement(PreparedStatement ps) throws java.sql.SQLException, org.springframework.dao.DataAccessException{
					ps.setString(1, value);
					ps.setString(2, key);
					return ps.executeUpdate();
				}
			});
			if(cnt==0){
				StringBuffer sb = new StringBuffer();
				sb.append("insert into  ")
					.append(tableName)
					.append("(")
					.append(keyColumn)
					.append(",")
					.append(valueColumn)
					.append(")values")
					.append("(?,?)");
					
				
				templet.execute(sb.toString(),new PreparedStatementCallback<Integer>(){
					public Integer doInPreparedStatement(PreparedStatement ps) throws java.sql.SQLException, org.springframework.dao.DataAccessException{
						ps.setString(2, value);
						ps.setString(1, key);
						return ps.executeUpdate();
					}
				});
				
			}
		}
	}
	
	
	protected String getGetColumnName(Method method,GetFromDb pro){
		String columnName = pro.column();
		if(columnName.equals("")){
			String methodName = method.getName();
			if(methodName.startsWith("get")){
				columnName = methodName.substring(3);
			}
		}
		return columnName;
		
	}
	protected String getSaveColumnName(Method method,SetToDb pro){
		String columnName = pro.column();
		if(columnName.equals("")){
			String methodName = method.getName();
			if(methodName.startsWith("set")){
				columnName = methodName.substring(3);
			}
		}
		return columnName;
		
	}
	
	
	protected String getTableName(TableName tableName){
	
		if(tableName!=null && !tableName.tableName().equals("")){
			return tableName.tableName();
		}
		return clazz.getSimpleName();
	}
	
	protected Object parse(String value,Class clazz,GetFromDb pro){
		if(value==null)  
			value = pro.defaultValue();
		if(clazz != null){
			if(clazz.equals(Integer.class)){ 
				return Integer.parseInt(value);
			}
			if(clazz.equals(Double.class)){
				return Double.parseDouble(value);
			}
			if(clazz.equals(Float.class)){
				return Float.parseFloat(value);
			}
			if(clazz.equals(Long.class)){
				return Long.parseLong(value);
			}
			
			if(clazz.equals(int.class)){
				return Integer.parseInt(value);
			}
			if(clazz.equals(double.class)){
				return Double.parseDouble(value);
			}
			if(clazz.equals(float.class)){
				return Float.parseFloat(value);
			}
			if(clazz.equals(long.class)){
				return Long.parseLong(value);
			}
			
			if(clazz.equals(Date.class)){
				String str = "yyyy-MM-dd";
				if(pro!=null && !pro.dateFormat().equals("")){
					str = pro.dateFormat();
				}
				SimpleDateFormat format = new SimpleDateFormat(str); 
				Date ret = null;
				try {
					if(value==null || value.equals("")) 
						ret = null;
					else
						ret = format.parse(value);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				return ret;
			}
		}
		return value;
	}
}
