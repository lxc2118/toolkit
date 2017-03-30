package com.tg.db.sync.newtg.pojo.itemCate;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="newtg")
@Component
public class ItemCate implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setParentId(Integer parentId){
		this.parentId=parentId;
	}

	public Integer getParentId(){
		return this.parentId;
	}
	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
	}
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}
	public void setParent(Boolean parent){
		this.parent=parent;
	}

	public Boolean getParent(){
		return this.parent;
	}
	public void setSortOrder(Integer sortOrder){
		this.sortOrder=sortOrder;
	}

	public Integer getSortOrder(){
		return this.sortOrder;
	}
	public void setPropsJson(String propsJson){
		this.propsJson=propsJson;
	}

	public String getPropsJson(){
		return this.propsJson;
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
	public void setPath(String path){
		this.path=path;
	}

	public String getPath(){
		return this.path;
	}
	public void setProfileId(Integer profileId){
		this.profileId=profileId;
	}

	public Integer getProfileId(){
		return this.profileId;
	}

	private Integer id;

	private Integer parentId;

	private String name;

	private String status;

	private Boolean parent;

	private Integer sortOrder;

	private String propsJson;

	private Date createTime;

	private Date updateTime;

	private String path;

	private Integer profileId;

	public  Object acqPk(){
		return id;
	}
}