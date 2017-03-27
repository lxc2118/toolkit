package com.fastwebx.web.result;

import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

public final class SchResult<Pojo> {
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
	public int getPageth() {
		return pageth;
	}
	public void setPageth(int pageth) {
		this.pageth = pageth;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public void add(JSON json){
		this.getList().add(json);
	}
	
	public JSONArray getList() {
		if(list ==null) list = new JSONArray();
		return list;
	}
	public void setList(JSONArray list) {
		this.list = list;
	}
 
	
	public String getGridMsg() {
		return gridMsg;
	}
	public void setGridMsg(String gridMsg) {
		this.gridMsg = gridMsg;
	}


	private String gridMsg;
	
	private int total;
	private JSONArray list = null;
	private int pageth;
	private int pageSize;
	
}
