package com.tg.db.sync.tgoms.pojo.settings;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="tg_oms")
@Component
public class Settings implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(String id){
		this.id=id;
	}

	public String getId(){
		return this.id;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}
	public void setJson(String json){
		this.json=json;
	}

	public String getJson(){
		return this.json;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime=updateTime;
	}

	public Date getUpdateTime(){
		return this.updateTime;
	}

	private String id;

	private Date createTime;

	private String json;

	private Date updateTime;

	public  Object acqPk(){
		return id;
	}
}