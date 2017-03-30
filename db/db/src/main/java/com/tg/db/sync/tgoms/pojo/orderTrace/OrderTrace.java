package com.tg.db.sync.tgoms.pojo.orderTrace;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="tg_oms")
@Component
public class OrderTrace implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setOrderId(Integer orderId){
		this.orderId=orderId;
	}

	public Integer getOrderId(){
		return this.orderId;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}
	public void setOperatorId(Integer operatorId){
		this.operatorId=operatorId;
	}

	public Integer getOperatorId(){
		return this.operatorId;
	}
	public void setType(String type){
		this.type=type;
	}

	public String getType(){
		return this.type;
	}
	public void setDescription(String description){
		this.description=description;
	}

	public String getDescription(){
		return this.description;
	}

	private Integer id;

	private Integer orderId;

	private Date createTime;

	private Integer operatorId;

	private String type;

	private String description;

	public  Object acqPk(){
		return id;
	}
}