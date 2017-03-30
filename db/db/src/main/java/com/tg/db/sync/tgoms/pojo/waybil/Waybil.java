package com.tg.db.sync.tgoms.pojo.waybil;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="tg_oms")
@Component
public class Waybil implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setSupplierId(Integer supplierId){
		this.supplierId=supplierId;
	}

	public Integer getSupplierId(){
		return this.supplierId;
	}
	public void setOrderId(Integer orderId){
		this.orderId=orderId;
	}

	public Integer getOrderId(){
		return this.orderId;
	}
	public void setShortAddress(String shortAddress){
		this.shortAddress=shortAddress;
	}

	public String getShortAddress(){
		return this.shortAddress;
	}
	public void setWaybillCode(String waybillCode){
		this.waybillCode=waybillCode;
	}

	public String getWaybillCode(){
		return this.waybillCode;
	}
	public void setPackageCenter(String packageCenter){
		this.packageCenter=packageCenter;
	}

	public String getPackageCenter(){
		return this.packageCenter;
	}
	public void setPackageCenterName(String packageCenterName){
		this.packageCenterName=packageCenterName;
	}

	public String getPackageCenterName(){
		return this.packageCenterName;
	}
	public void setPrintConfig(String printConfig){
		this.printConfig=printConfig;
	}

	public String getPrintConfig(){
		return this.printConfig;
	}
	public void setShippingBranchCode(String shippingBranchCode){
		this.shippingBranchCode=shippingBranchCode;
	}

	public String getShippingBranchCode(){
		return this.shippingBranchCode;
	}
	public void setConsigneeBranchName(String consigneeBranchName){
		this.consigneeBranchName=consigneeBranchName;
	}

	public String getConsigneeBranchName(){
		return this.consigneeBranchName;
	}
	public void setShippingBranchName(String shippingBranchName){
		this.shippingBranchName=shippingBranchName;
	}

	public String getShippingBranchName(){
		return this.shippingBranchName;
	}
	public void setConsigneeBranchCode(String consigneeBranchCode){
		this.consigneeBranchCode=consigneeBranchCode;
	}

	public String getConsigneeBranchCode(){
		return this.consigneeBranchCode;
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

	private Integer supplierId;

	private Integer orderId;

	private String shortAddress;

	private String waybillCode;

	private String packageCenter;

	private String packageCenterName;

	private String printConfig;

	private String shippingBranchCode;

	private String consigneeBranchName;

	private String shippingBranchName;

	private String consigneeBranchCode;

	private Date createTime;

	private Date updateTime;

	public  Object acqPk(){
		return id;
	}
}