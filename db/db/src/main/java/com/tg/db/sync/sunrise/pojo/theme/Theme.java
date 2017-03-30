package com.tg.db.sync.sunrise.pojo.theme;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class Theme implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setUserId(Integer userId){
		this.userId=userId;
	}

	public Integer getUserId(){
		return this.userId;
	}
	public void setTitle(String title){
		this.title=title;
	}

	public String getTitle(){
		return this.title;
	}
	public void setBody(String body){
		this.body=body;
	}

	public String getBody(){
		return this.body;
	}
	public void setPicture(String picture){
		this.picture=picture;
	}

	public String getPicture(){
		return this.picture;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime=updateTime;
	}

	public Date getUpdateTime(){
		return this.updateTime;
	}

	private Integer id;

	private Integer userId;

	private String title;

	private String body;

	private String picture;

	private Date createTime;

	private Date updateTime;

	public  Object acqPk(){
		return id;
	}
}