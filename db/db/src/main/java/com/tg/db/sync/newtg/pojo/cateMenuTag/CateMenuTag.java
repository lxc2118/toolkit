package com.tg.db.sync.newtg.pojo.cateMenuTag;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="newtg")
@Component
public class CateMenuTag implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setCateMenuId(Integer cateMenuId){
		this.cateMenuId=cateMenuId;
	}

	public Integer getCateMenuId(){
		return this.cateMenuId;
	}
	public void setTitle(String title){
		this.title=title;
	}

	public String getTitle(){
		return this.title;
	}
	public void setIconId(Integer iconId){
		this.iconId=iconId;
	}

	public Integer getIconId(){
		return this.iconId;
	}
	public void setUrl(String url){
		this.url=url;
	}

	public String getUrl(){
		return this.url;
	}
	public void setSortOrder(Integer sortOrder){
		this.sortOrder=sortOrder;
	}

	public Integer getSortOrder(){
		return this.sortOrder;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime=updateTime;
	}

	public Date getUpdateTime(){
		return this.updateTime;
	}

	private Integer id;

	private Integer cateMenuId;

	private String title;

	private Integer iconId;

	private String url;

	private Integer sortOrder;

	private Date updateTime;

	public  Object acqPk(){
		return id;
	}
}