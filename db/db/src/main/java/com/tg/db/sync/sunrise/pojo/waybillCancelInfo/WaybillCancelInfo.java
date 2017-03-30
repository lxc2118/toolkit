package com.tg.db.sync.sunrise.pojo.waybillCancelInfo;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class WaybillCancelInfo implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setCpCode(String cpCode){
		this.cpCode=cpCode;
	}

	public String getCpCode(){
		return this.cpCode;
	}
	public void setWaybillCode(String waybillCode){
		this.waybillCode=waybillCode;
	}

	public String getWaybillCode(){
		return this.waybillCode;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}
	public void setSupplierId(Integer supplierId){
		this.supplierId=supplierId;
	}

	public Integer getSupplierId(){
		return this.supplierId;
	}
	public void setType(String type){
		this.type=type;
	}

	public String getType(){
		return this.type;
	}
	public void setSuccess(Boolean success){
		this.success=success;
	}

	public Boolean getSuccess(){
		return this.success;
	}
	public void setMsg(String msg){
		this.msg=msg;
	}

	public String getMsg(){
		return this.msg;
	}
	public void setOrderId(Integer orderId){
		this.orderId=orderId;
	}

	public Integer getOrderId(){
		return this.orderId;
	}

	private Integer id;

	private String cpCode;

	private String waybillCode;

	private Date createTime;

	private Integer supplierId;

	private String type;

	private Boolean success;

	private String msg;

	private Integer orderId;

	public  Object acqPk(){
		return id;
	}
}