package com.tg.db.sync.sunrise.pojo.alibabaAuth;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class AlibabaAuth implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setAliId(Integer aliId){
		this.aliId=aliId;
	}

	public Integer getAliId(){
		return this.aliId;
	}
	public void setResourceOwner(String resourceOwner){
		this.resourceOwner=resourceOwner;
	}

	public String getResourceOwner(){
		return this.resourceOwner;
	}
	public void setMemberId(Integer memberId){
		this.memberId=memberId;
	}

	public Integer getMemberId(){
		return this.memberId;
	}
	public void setExpiresIn(Integer expiresIn){
		this.expiresIn=expiresIn;
	}

	public Integer getExpiresIn(){
		return this.expiresIn;
	}
	public void setRefreshToken(String refreshToken){
		this.refreshToken=refreshToken;
	}

	public String getRefreshToken(){
		return this.refreshToken;
	}
	public void setAccessToken(String accessToken){
		this.accessToken=accessToken;
	}

	public String getAccessToken(){
		return this.accessToken;
	}
	public void setRefreshTokenTimeout(Date refreshTokenTimeout){
		this.refreshTokenTimeout=refreshTokenTimeout;
	}

	public Date getRefreshTokenTimeout(){
		return this.refreshTokenTimeout;
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

	private Integer aliId;

	private String resourceOwner;

	private Integer memberId;

	private Integer expiresIn;

	private String refreshToken;

	private String accessToken;

	private Date refreshTokenTimeout;

	private Date createTime;

	private Date updateTime;

	public  Object acqPk(){
		return id;
	}
}