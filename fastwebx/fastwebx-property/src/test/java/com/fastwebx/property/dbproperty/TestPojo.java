package com.fastwebx.property.dbproperty;
import java.util.Date;

import com.fastwebx.property.dbproperty.annotation.GetFromDb;
import com.fastwebx.property.dbproperty.annotation.SaveToDb;
import com.fastwebx.property.dbproperty.annotation.SetToDb;
import com.fastwebx.property.dbproperty.annotation.TableName;


@TableName()
public class TestPojo {
	private String context;
	private String htmlPath;
	private String uploadPath;
	private String testValue="abc";
	private Date createDate; 
	
	private int test1;
	private long test2;
	
	@GetFromDb(defaultValue="3")
	public int getTest1() {
		return test1;
	}
	@SetToDb
	public void setTest1(int test1) {
		this.test1 = test1;
	}
	@GetFromDb(defaultValue="2")
	public long getTest2() {
		return test2;
	}
	@SetToDb
	public void setTest2(long test2) {
		this.test2 = test2;
	}
	@GetFromDb
	public Date getCreateDate() {
		return createDate;
	}
	@SetToDb
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@SaveToDb
	public void save(){
		
	}
	
	public String getTestValue() {
		return testValue;
	}
	public void setTestValue(String testValue) {
		this.testValue = testValue;
	}
	@GetFromDb
	public String getContext() {
		return context;
	}
	@SetToDb
	public void setContext(String context) {
		this.context = context;
	}
	@GetFromDb
	public String getHtmlPath() {
		return htmlPath;
	}
	@SetToDb
	public void setHtmlPath(String htmlPath) {
		this.htmlPath = htmlPath;
	}
	@GetFromDb
	public String getUploadPath() {
		return uploadPath;
	}
	@SetToDb
	public void setUploadPath(String uploadPath) {
		this.uploadPath = uploadPath;
	}
	
	
}
