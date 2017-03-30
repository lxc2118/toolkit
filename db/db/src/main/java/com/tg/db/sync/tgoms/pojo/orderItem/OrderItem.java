package com.tg.db.sync.tgoms.pojo.orderItem;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="tg_oms")
@Component
public class OrderItem implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setOrderId(Long orderId){
		this.orderId=orderId;
	}

	public Long getOrderId(){
		return this.orderId;
	}
	public void setItemName(String itemName){
		this.itemName=itemName;
	}

	public String getItemName(){
		return this.itemName;
	}
	public void setNum(Integer num){
		this.num=num;
	}

	public Integer getNum(){
		return this.num;
	}
	public void setOuterItemId(String outerItemId){
		this.outerItemId=outerItemId;
	}

	public String getOuterItemId(){
		return this.outerItemId;
	}
	public void setInnerItemId(String innerItemId){
		this.innerItemId=innerItemId;
	}

	public String getInnerItemId(){
		return this.innerItemId;
	}
	public void setInnerStatus(Boolean innerStatus){
		this.innerStatus=innerStatus;
	}

	public Boolean getInnerStatus(){
		return this.innerStatus;
	}
	public void setInnerItemCode(String innerItemCode){
		this.innerItemCode=innerItemCode;
	}

	public String getInnerItemCode(){
		return this.innerItemCode;
	}
	public void setOuterTid(String outerTid){
		this.outerTid=outerTid;
	}

	public String getOuterTid(){
		return this.outerTid;
	}
	public void setOuterOid(String outerOid){
		this.outerOid=outerOid;
	}

	public String getOuterOid(){
		return this.outerOid;
	}
	public void setOuterPayment(Float outerPayment){
		this.outerPayment=outerPayment;
	}

	public Float getOuterPayment(){
		return this.outerPayment;
	}
	public void setOuterPrice(Float outerPrice){
		this.outerPrice=outerPrice;
	}

	public Float getOuterPrice(){
		return this.outerPrice;
	}
	public void setPrice(Float price){
		this.price=price;
	}

	public Float getPrice(){
		return this.price;
	}
	public void setTotalFee(Float totalFee){
		this.totalFee=totalFee;
	}

	public Float getTotalFee(){
		return this.totalFee;
	}
	public void setPayment(Float payment){
		this.payment=payment;
	}

	public Float getPayment(){
		return this.payment;
	}
	public void setServiceFee(Float serviceFee){
		this.serviceFee=serviceFee;
	}

	public Float getServiceFee(){
		return this.serviceFee;
	}
	public void setCompanyName(String companyName){
		this.companyName=companyName;
	}

	public String getCompanyName(){
		return this.companyName;
	}
	public void setCompanyPhone(String companyPhone){
		this.companyPhone=companyPhone;
	}

	public String getCompanyPhone(){
		return this.companyPhone;
	}
	public void setCompanyAddress(String companyAddress){
		this.companyAddress=companyAddress;
	}

	public String getCompanyAddress(){
		return this.companyAddress;
	}
	public void setSkuNames(String skuNames){
		this.skuNames=skuNames;
	}

	public String getSkuNames(){
		return this.skuNames;
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
	public void setInner(Integer inner){
		this.inner=inner;
	}

	public Integer getInner(){
		return this.inner;
	}
	public void setItemPic(String itemPic){
		this.itemPic=itemPic;
	}

	public String getItemPic(){
		return this.itemPic;
	}
	public void setOuterItemCode(String outerItemCode){
		this.outerItemCode=outerItemCode;
	}

	public String getOuterItemCode(){
		return this.outerItemCode;
	}
	public void setItemCode(String itemCode){
		this.itemCode=itemCode;
	}

	public String getItemCode(){
		return this.itemCode;
	}
	public void setInnerItemUrl(String innerItemUrl){
		this.innerItemUrl=innerItemUrl;
	}

	public String getInnerItemUrl(){
		return this.innerItemUrl;
	}
	public void setInnerFrom(String innerFrom){
		this.innerFrom=innerFrom;
	}

	public String getInnerFrom(){
		return this.innerFrom;
	}
	public void setRefundId(Integer refundId){
		this.refundId=refundId;
	}

	public Integer getRefundId(){
		return this.refundId;
	}
	public void setRefundStatus(String refundStatus){
		this.refundStatus=refundStatus;
	}

	public String getRefundStatus(){
		return this.refundStatus;
	}
	public void setItemAreaId(Integer itemAreaId){
		this.itemAreaId=itemAreaId;
	}

	public Integer getItemAreaId(){
		return this.itemAreaId;
	}
	public void setThExported(Boolean thExported){
		this.thExported=thExported;
	}

	public Boolean getThExported(){
		return this.thExported;
	}
	public void setDoorNo(Integer doorNo){
		this.doorNo=doorNo;
	}

	public Integer getDoorNo(){
		return this.doorNo;
	}
	public void setOrderItemLabelId(Integer orderItemLabelId){
		this.orderItemLabelId=orderItemLabelId;
	}

	public Integer getOrderItemLabelId(){
		return this.orderItemLabelId;
	}
	public void setOrderItemcol(String orderItemcol){
		this.orderItemcol=orderItemcol;
	}

	public String getOrderItemcol(){
		return this.orderItemcol;
	}
	public void setRkNum(Integer rkNum){
		this.rkNum=rkNum;
	}

	public Integer getRkNum(){
		return this.rkNum;
	}

	private Integer id;

	private Long orderId;

	private String itemName;

	private Integer num;

	private String outerItemId;

	private String innerItemId;

	private Boolean innerStatus;

	private String innerItemCode;

	private String outerTid;

	private String outerOid;

	private Float outerPayment;

	private Float outerPrice;

	private Float price;

	private Float totalFee;

	private Float payment;

	private Float serviceFee;

	private String companyName;

	private String companyPhone;

	private String companyAddress;

	private String skuNames;

	private Date createTime;

	private Date updateTime;

	private Integer inner;

	private String itemPic;

	private String outerItemCode;

	private String itemCode;

	private String innerItemUrl;

	private String innerFrom;

	private Integer refundId;

	private String refundStatus;

	private Integer itemAreaId;

	private Boolean thExported;

	private Integer doorNo;

	private Integer orderItemLabelId;

	private String orderItemcol;

	private Integer rkNum;

	public  Object acqPk(){
		return id;
	}
}