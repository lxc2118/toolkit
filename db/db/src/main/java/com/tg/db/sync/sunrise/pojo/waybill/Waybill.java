package com.tg.db.sync.sunrise.pojo.waybill;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class Waybill implements IPk,Serializable{
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
	public void setCpCode(String cpCode){
		this.cpCode=cpCode;
	}

	public String getCpCode(){
		return this.cpCode;
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
	public void setType(String type){
		this.type=type;
	}

	public String getType(){
		return this.type;
	}
	public void setRealUserId(Long realUserId){
		this.realUserId=realUserId;
	}

	public Long getRealUserId(){
		return this.realUserId;
	}
	public void setConsigneeName(String consigneeName){
		this.consigneeName=consigneeName;
	}

	public String getConsigneeName(){
		return this.consigneeName;
	}
	public void setConsigneeProvince(String consigneeProvince){
		this.consigneeProvince=consigneeProvince;
	}

	public String getConsigneeProvince(){
		return this.consigneeProvince;
	}
	public void setConsigneeAddress(String consigneeAddress){
		this.consigneeAddress=consigneeAddress;
	}

	public String getConsigneeAddress(){
		return this.consigneeAddress;
	}
	public void setConsigneePhone(String consigneePhone){
		this.consigneePhone=consigneePhone;
	}

	public String getConsigneePhone(){
		return this.consigneePhone;
	}
	public void setShippingProvince(String shippingProvince){
		this.shippingProvince=shippingProvince;
	}

	public String getShippingProvince(){
		return this.shippingProvince;
	}
	public void setShippingAddress(String shippingAddress){
		this.shippingAddress=shippingAddress;
	}

	public String getShippingAddress(){
		return this.shippingAddress;
	}
	public void setShippingArea(String shippingArea){
		this.shippingArea=shippingArea;
	}

	public String getShippingArea(){
		return this.shippingArea;
	}
	public void setShippingCity(String shippingCity){
		this.shippingCity=shippingCity;
	}

	public String getShippingCity(){
		return this.shippingCity;
	}
	public void setConsigneeArea(String consigneeArea){
		this.consigneeArea=consigneeArea;
	}

	public String getConsigneeArea(){
		return this.consigneeArea;
	}
	public void setConsigneeCity(String consigneeCity){
		this.consigneeCity=consigneeCity;
	}

	public String getConsigneeCity(){
		return this.consigneeCity;
	}

	private Integer id;

	private Integer supplierId;

	private Integer orderId;

	private String shortAddress;

	private String waybillCode;

	private String cpCode;

	private String packageCenter;

	private String packageCenterName;

	private String printConfig;

	private String shippingBranchCode;

	private String consigneeBranchName;

	private String shippingBranchName;

	private String consigneeBranchCode;

	private Date createTime;

	private Date updateTime;

	private String type;

	private Long realUserId;

	private String consigneeName;

	private String consigneeProvince;

	private String consigneeAddress;

	private String consigneePhone;

	private String shippingProvince;

	private String shippingAddress;

	private String shippingArea;

	private String shippingCity;

	private String consigneeArea;

	private String consigneeCity;

	public  Object acqPk(){
		return id;
	}
}