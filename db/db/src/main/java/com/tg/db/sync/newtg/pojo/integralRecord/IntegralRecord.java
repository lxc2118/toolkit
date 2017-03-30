package com.tg.db.sync.newtg.pojo.integralRecord;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="newtg")
@Component
public class IntegralRecord implements IPk,Serializable{
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
	public void setType(String type){
		this.type=type;
	}

	public String getType(){
		return this.type;
	}
	public void setFromIntegral(Integer fromIntegral){
		this.fromIntegral=fromIntegral;
	}

	public Integer getFromIntegral(){
		return this.fromIntegral;
	}
	public void setRemainIntegral(Integer remainIntegral){
		this.remainIntegral=remainIntegral;
	}

	public Integer getRemainIntegral(){
		return this.remainIntegral;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}

	public String getRemark(){
		return this.remark;
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

	private String type;

	private Integer fromIntegral;

	private Integer remainIntegral;

	private String remark;

	private Integer integral;

	public  Object acqPk(){
		return id;
	}
}