package com.tg.db.sync.sunrise.pojo.shop;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class Shop implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
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
	public void setAddress(String address){
		this.address=address;
	}

	public String getAddress(){
		return this.address;
	}
	public void setSiteAddress(String siteAddress){
		this.siteAddress=siteAddress;
	}

	public String getSiteAddress(){
		return this.siteAddress;
	}
	public void setQq(String qq){
		this.qq=qq;
	}

	public String getQq(){
		return this.qq;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}

	public String getPhone(){
		return this.phone;
	}
	public void setSiteId(Integer siteId){
		this.siteId=siteId;
	}

	public Integer getSiteId(){
		return this.siteId;
	}
	public void setAreaId(Integer areaId){
		this.areaId=areaId;
	}

	public Integer getAreaId(){
		return this.areaId;
	}
	public void setAvatorId(Integer avatorId){
		this.avatorId=avatorId;
	}

	public Integer getAvatorId(){
		return this.avatorId;
	}
	public void setDescription(String description){
		this.description=description;
	}

	public String getDescription(){
		return this.description;
	}
	public void setDomain(String domain){
		this.domain=domain;
	}

	public String getDomain(){
		return this.domain;
	}
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}
	public void setType(String type){
		this.type=type;
	}

	public String getType(){
		return this.type;
	}
	public void setUserId(Integer userId){
		this.userId=userId;
	}

	public Integer getUserId(){
		return this.userId;
	}
	public void setAvatarId(Integer avatarId){
		this.avatarId=avatarId;
	}

	public Integer getAvatarId(){
		return this.avatarId;
	}
	public void setTags(String tags){
		this.tags=tags;
	}

	public String getTags(){
		return this.tags;
	}
	public void setFollowTimes(Integer followTimes){
		this.followTimes=followTimes;
	}

	public Integer getFollowTimes(){
		return this.followTimes;
	}
	public void setContactName(String contactName){
		this.contactName=contactName;
	}

	public String getContactName(){
		return this.contactName;
	}
	public void setEmail(String email){
		this.email=email;
	}

	public String getEmail(){
		return this.email;
	}
	public void setPicId(Integer picId){
		this.picId=picId;
	}

	public Integer getPicId(){
		return this.picId;
	}
	public void setFetchAreaId(Integer fetchAreaId){
		this.fetchAreaId=fetchAreaId;
	}

	public Integer getFetchAreaId(){
		return this.fetchAreaId;
	}
	public void setDoorNo(String doorNo){
		this.doorNo=doorNo;
	}

	public String getDoorNo(){
		return this.doorNo;
	}

	private Integer id;

	private String name;

	private Date createTime;

	private Date updateTime;

	private String address;

	private String siteAddress;

	private String qq;

	private String phone;

	private Integer siteId;

	private Integer areaId;

	private Integer avatorId;

	private String description;

	private String domain;

	private String status;

	private String type;

	private Integer userId;

	private Integer avatarId;

	private String tags;

	private Integer followTimes;

	private String contactName;

	private String email;

	private Integer picId;

	private Integer fetchAreaId;

	private String doorNo;

	public  Object acqPk(){
		return id;
	}
}