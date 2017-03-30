package com.tg.db.sync.newtg.pojo.userWallet;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="newtg")
@Component
public class UserWallet implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setUserId(Integer userId){
		this.userId=userId;
	}

	public Integer getUserId(){
		return this.userId;
	}
	public void setInpourMoney(Float inpourMoney){
		this.inpourMoney=inpourMoney;
	}

	public Float getInpourMoney(){
		return this.inpourMoney;
	}
	public void setMoney(Float money){
		this.money=money;
	}

	public Float getMoney(){
		return this.money;
	}
	public void setOutpourMoney(Float outpourMoney){
		this.outpourMoney=outpourMoney;
	}

	public Float getOutpourMoney(){
		return this.outpourMoney;
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
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setVersion(Integer version){
		this.version=version;
	}

	public Integer getVersion(){
		return this.version;
	}
	public void setTotalMoney(Float totalMoney){
		this.totalMoney=totalMoney;
	}

	public Float getTotalMoney(){
		return this.totalMoney;
	}
	public void setIntegral(Integer integral){
		this.integral=integral;
	}

	public Integer getIntegral(){
		return this.integral;
	}
	public void setTotalIntegral(Integer totalIntegral){
		this.totalIntegral=totalIntegral;
	}

	public Integer getTotalIntegral(){
		return this.totalIntegral;
	}

	private Integer userId;

	private Float inpourMoney;

	private Float money;

	private Float outpourMoney;

	private Date createTime;

	private Date updateTime;

	private Integer id;

	private Integer version;

	private Float totalMoney;

	private Integer integral;

	private Integer totalIntegral;

	public  Object acqPk(){
		return id;
	}
}