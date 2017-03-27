package com.fastwebx.codeAuto.dao;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fastwebx.codeAuto.context.Context;
import com.fastwebx.codeAuto.pojo.Column;
@Repository
public class ColumnDao {
	public List<String> getPk(String tableName){
		List<String> list = new ArrayList<String>();
		try{
			Connection conn = Context.getConn();
			DatabaseMetaData dbMetaData = conn.getMetaData();
			
			ResultSet pkRSet = dbMetaData.getPrimaryKeys(null, null,tableName);
			while( pkRSet.next() ) {
				list.add(pkRSet.getString(4));
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	
	public List<Column> getByTable(String table){
		List<Column> list=null;
		try {
			list = new ArrayList<Column>();
			Connection conn = Context.getConn();
			
			DatabaseMetaData dbMetaData = conn.getMetaData();
			ResultSet rs = dbMetaData.getColumns(null, null, table, null);
			while(rs.next()){
				Column column = new Column();
				column.setLength(rs.getInt(7));
				column.setName(rs.getString(4));
				column.setType(rs.getString(6));
				column.setAutoIncrease(rs.getString(23).equalsIgnoreCase("yes"));
				column.setNotNull(!rs.getString(18).equalsIgnoreCase("yes"));
				list.add(column);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
