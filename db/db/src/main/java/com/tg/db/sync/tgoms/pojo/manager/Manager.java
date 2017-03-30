package com.tg.db.sync.tgoms.pojo.manager;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="tg_oms")
@Component
public class Manager implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Long id){
		this.id=id;
	}

	public Long getId(){
		return this.id;
	}
	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
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
	public void setLastLoginTime(Date lastLoginTime){
		this.lastLoginTime=lastLoginTime;
	}

	public Date getLastLoginTime(){
		return this.lastLoginTime;
	}
	public void setLoginTimes(Integer loginTimes){
		this.loginTimes=loginTimes;
	}

	public Integer getLoginTimes(){
		return this.loginTimes;
	}
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}
	public void setIsAdmin(Boolean isAdmin){
		this.isAdmin=isAdmin;
	}

	public Boolean getIsAdmin(){
		return this.isAdmin;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime=updateTime;
	}

	public Date getUpdateTime(){
		return this.updateTime;
	}

	private Long id;

	private String name;

	private String account;

	private String password;

	private Date createTime;

	private Date lastLoginTime;

	private Integer loginTimes;

	private String status;

	private Boolean isAdmin;

	private Date updateTime;

	public  Object acqPk(){
		return id;
	}
}