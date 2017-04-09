package com.tg.db.sync.newtg.pojo.account;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="newtg")
@Component
public class Account implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setAccount(String account){
		this.account=account;
	}

	public String getAccount(){
		return this.account;
	}
	public void setPassword(String password){
		this.password=password;
	}

	public String getPassword(){
		return this.password;
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
	public void setLoginTimes(Integer loginTimes){
		this.loginTimes=loginTimes;
	}

	public Integer getLoginTimes(){
		return this.loginTimes;
	}
	public void setLastLoginTime(Date lastLoginTime){
		this.lastLoginTime=lastLoginTime;
	}

	public Date getLastLoginTime(){
		return this.lastLoginTime;
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
	public void setOriginalAccount(String originalAccount){
		this.originalAccount=originalAccount;
	}

	public String getOriginalAccount(){
		return this.originalAccount;
	}
	public void setOriginalPassword(String originalPassword){
		this.originalPassword=originalPassword;
	}

	public String getOriginalPassword(){
		return this.originalPassword;
	}
	public void setOriginalUserId(Integer originalUserId){
		this.originalUserId=originalUserId;
	}

	public Integer getOriginalUserId(){
		return this.originalUserId;
	}
	public void setOriginalSiteCode(String originalSiteCode){
		this.originalSiteCode=originalSiteCode;
	}

	public String getOriginalSiteCode(){
		return this.originalSiteCode;
	}
	public void setOpenId(String openId){
		this.openId=openId;
	}

	public String getOpenId(){
		return this.openId;
	}

	private Integer id;

	private String account;

	private String password;

	private Date createTime;

	private Date updateTime;

	private Integer loginTimes;

	private Date lastLoginTime;

	private String status;

	private String type;

	private Integer userId;

	private String originalAccount;

	private String originalPassword;

	private Integer originalUserId;

	private String originalSiteCode;

	private String openId;

	public  Object acqPk(){
		return id;
	}
}