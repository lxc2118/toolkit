package com.tg.db.sync.sunrise.pojo.signInInfo;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class SignInInfo implements IPk,Serializable{
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
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}
	public void setContinuousDays(Integer continuousDays){
		this.continuousDays=continuousDays;
	}

	public Integer getContinuousDays(){
		return this.continuousDays;
	}
	public void setIntegral(Integer integral){
		this.integral=integral;
	}

	public Integer getIntegral(){
		return this.integral;
	}

	private Integer id;

	private Integer userId;

	private Date createTime;

	private Integer continuousDays;

	private Integer integral;

	public  Object acqPk(){
		return id;
	}
}