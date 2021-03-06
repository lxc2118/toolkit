package com.tg.db.sync.newtg.pojo.cateMenu;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="newtg")
@Component
public class CateMenu implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
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
	public void setShown(Boolean shown){
		this.shown=shown;
	}

	public Boolean getShown(){
		return this.shown;
	}
	public void setParentId(Integer parentId){
		this.parentId=parentId;
	}

	public Integer getParentId(){
		return this.parentId;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime=updateTime;
	}

	public Date getUpdateTime(){
		return this.updateTime;
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
	public void setSiteId(Integer siteId){
		this.siteId=siteId;
	}

	public Integer getSiteId(){
		return this.siteId;
	}

	private Integer id;

	private String title;

	private Integer iconId;

	private Boolean shown;

	private Integer parentId;

	private Date updateTime;

	private String url;

	private Integer sortOrder;

	private Integer siteId;

	public  Object acqPk(){
		return id;
	}
}