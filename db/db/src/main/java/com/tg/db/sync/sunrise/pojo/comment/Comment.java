package com.tg.db.sync.sunrise.pojo.comment;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class Comment implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setThemeId(Integer themeId){
		this.themeId=themeId;
	}

	public Integer getThemeId(){
		return this.themeId;
	}
	public void setUserId(Integer userId){
		this.userId=userId;
	}

	public Integer getUserId(){
		return this.userId;
	}
	public void setComment(String comment){
		this.comment=comment;
	}

	public String getComment(){
		return this.comment;
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

	private Integer themeId;

	private Integer userId;

	private String comment;

	private Date createTime;

	private Date updateTime;

	public  Object acqPk(){
		return id;
	}
}