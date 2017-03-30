package com.tg.db.sync.tgoms.pojo.userBills;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="tg_oms")
@Component
public class UserBills implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(String id){
		this.id=id;
	}

	public String getId(){
		return this.id;
	}
	public void setUserId(Integer userId){
		this.userId=userId;
	}

	public Integer getUserId(){
		return this.userId;
	}
	public void setType(String type){
		this.type=type;
	}

	public String getType(){
		return this.type;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}
	public void setTitle(String title){
		this.title=title;
	}

	public String getTitle(){
		return this.title;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}

	public String getRemark(){
		return this.remark;
	}
	public void setMoney(Float money){
		this.money=money;
	}

	public Float getMoney(){
		return this.money;
	}
	public void setRemainMoney(Float remainMoney){
		this.remainMoney=remainMoney;
	}

	public Float getRemainMoney(){
		return this.remainMoney;
	}
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}
	public void setOrderIds(String orderIds){
		this.orderIds=orderIds;
	}

	public String getOrderIds(){
		return this.orderIds;
	}
	public void setPayRemark(String payRemark){
		this.payRemark=payRemark;
	}

	public String getPayRemark(){
		return this.payRemark;
	}

	private String id;

	private Integer userId;

	private String type;

	private Date createTime;

	private String title;

	private String remark;

	private Float money;

	private Float remainMoney;

	private String status;

	private String orderIds;

	private String payRemark;

	public  Object acqPk(){
		return id;
	}
}