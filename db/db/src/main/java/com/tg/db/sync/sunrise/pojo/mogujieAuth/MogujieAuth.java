package com.tg.db.sync.sunrise.pojo.mogujieAuth;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class MogujieAuth implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Long id){
		this.id=id;
	}

	public Long getId(){
		return this.id;
	}
	public void setLastAuthTime(Date lastAuthTime){
		this.lastAuthTime=lastAuthTime;
	}

	public Date getLastAuthTime(){
		return this.lastAuthTime;
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
	public void setUserId(Integer userId){
		this.userId=userId;
	}

	public Integer getUserId(){
		return this.userId;
	}
	public void setAuthTimes(Integer authTimes){
		this.authTimes=authTimes;
	}

	public Integer getAuthTimes(){
		return this.authTimes;
	}
	public void setAccessToken(String accessToken){
		this.accessToken=accessToken;
	}

	public String getAccessToken(){
		return this.accessToken;
	}
	public void setAccessExpiresIn(String accessExpiresIn){
		this.accessExpiresIn=accessExpiresIn;
	}

	public String getAccessExpiresIn(){
		return this.accessExpiresIn;
	}
	public void setRefreshToken(String refreshToken){
		this.refreshToken=refreshToken;
	}

	public String getRefreshToken(){
		return this.refreshToken;
	}
	public void setRefreshExpiresIn(String refreshExpiresIn){
		this.refreshExpiresIn=refreshExpiresIn;
	}

	public String getRefreshExpiresIn(){
		return this.refreshExpiresIn;
	}
	public void setMgjUserId(String mgjUserId){
		this.mgjUserId=mgjUserId;
	}

	public String getMgjUserId(){
		return this.mgjUserId;
	}

	private Long id;

	private Date lastAuthTime;

	private Date createTime;

	private Date updateTime;

	private Integer userId;

	private Integer authTimes;

	private String accessToken;

	private String accessExpiresIn;

	private String refreshToken;

	private String refreshExpiresIn;

	private String mgjUserId;

	public  Object acqPk(){
		return id;
	}
}