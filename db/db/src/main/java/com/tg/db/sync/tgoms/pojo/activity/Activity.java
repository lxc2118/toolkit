package com.tg.db.sync.tgoms.pojo.activity;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="tg_oms")
@Component
public class Activity implements IPk,Serializable{
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
	public void setRemark(String remark){
		this.remark=remark;
	}

	public String getRemark(){
		return this.remark;
	}
	public void setStartTime(Date startTime){
		this.startTime=startTime;
	}

	public Date getStartTime(){
		return this.startTime;
	}
	public void setEndTime(Date endTime){
		this.endTime=endTime;
	}

	public Date getEndTime(){
		return this.endTime;
	}
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}
	public void setSupplierId(String supplierId){
		this.supplierId=supplierId;
	}

	public String getSupplierId(){
		return this.supplierId;
	}
	public void setType(String type){
		this.type=type;
	}

	public String getType(){
		return this.type;
	}

	private Integer id;

	private String name;

	private String remark;

	private Date startTime;

	private Date endTime;

	private String status;

	private String supplierId;

	private String type;

	public  Object acqPk(){
		return id;
	}
}