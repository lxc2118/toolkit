package com.tg.db.sync.tgoms.pojo.topOrder;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="tg_oms")
@Component
public class TopOrder implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setOid(Long oid){
		this.oid=oid;
	}

	public Long getOid(){
		return this.oid;
	}
	public void setItemMealName(String itemMealName){
		this.itemMealName=itemMealName;
	}

	public String getItemMealName(){
		return this.itemMealName;
	}
	public void setPicPath(String picPath){
		this.picPath=picPath;
	}

	public String getPicPath(){
		return this.picPath;
	}
	public void setSellerNick(String sellerNick){
		this.sellerNick=sellerNick;
	}

	public String getSellerNick(){
		return this.sellerNick;
	}
	public void setBuyerNick(String buyerNick){
		this.buyerNick=buyerNick;
	}

	public String getBuyerNick(){
		return this.buyerNick;
	}
	public void setRefundStatus(String refundStatus){
		this.refundStatus=refundStatus;
	}

	public String getRefundStatus(){
		return this.refundStatus;
	}
	public void setOuterIid(String outerIid){
		this.outerIid=outerIid;
	}

	public String getOuterIid(){
		return this.outerIid;
	}
	public void setBuyerRate(Boolean buyerRate){
		this.buyerRate=buyerRate;
	}

	public Boolean getBuyerRate(){
		return this.buyerRate;
	}
	public void setSellerRate(Boolean sellerRate){
		this.sellerRate=sellerRate;
	}

	public Boolean getSellerRate(){
		return this.sellerRate;
	}
	public void setSellerType(String sellerType){
		this.sellerType=sellerType;
	}

	public String getSellerType(){
		return this.sellerType;
	}
	public void setCid(Long cid){
		this.cid=cid;
	}

	public Long getCid(){
		return this.cid;
	}
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}
	public void setTitle(String title){
		this.title=title;
	}

	public String getTitle(){
		return this.title;
	}
	public void setPrice(String price){
		this.price=price;
	}

	public String getPrice(){
		return this.price;
	}
	public void setNumIid(Long numIid){
		this.numIid=numIid;
	}

	public Long getNumIid(){
		return this.numIid;
	}
	public void setItemMealId(Long itemMealId){
		this.itemMealId=itemMealId;
	}

	public Long getItemMealId(){
		return this.itemMealId;
	}
	public void setSkuId(String skuId){
		this.skuId=skuId;
	}

	public String getSkuId(){
		return this.skuId;
	}
	public void setNum(Long num){
		this.num=num;
	}

	public Long getNum(){
		return this.num;
	}
	public void setOuterSkuId(String outerSkuId){
		this.outerSkuId=outerSkuId;
	}

	public String getOuterSkuId(){
		return this.outerSkuId;
	}
	public void setTotalFee(String totalFee){
		this.totalFee=totalFee;
	}

	public String getTotalFee(){
		return this.totalFee;
	}
	public void setPayment(String payment){
		this.payment=payment;
	}

	public String getPayment(){
		return this.payment;
	}
	public void setDiscountFee(String discountFee){
		this.discountFee=discountFee;
	}

	public String getDiscountFee(){
		return this.discountFee;
	}
	public void setAdjustFee(String adjustFee){
		this.adjustFee=adjustFee;
	}

	public String getAdjustFee(){
		return this.adjustFee;
	}
	public void setModified(Date modified){
		this.modified=modified;
	}

	public Date getModified(){
		return this.modified;
	}
	public void setSkuPropertiesName(String skuPropertiesName){
		this.skuPropertiesName=skuPropertiesName;
	}

	public String getSkuPropertiesName(){
		return this.skuPropertiesName;
	}
	public void setRefundId(Long refundId){
		this.refundId=refundId;
	}

	public Long getRefundId(){
		return this.refundId;
	}
	public void setEndTime(Date endTime){
		this.endTime=endTime;
	}

	public Date getEndTime(){
		return this.endTime;
	}
	public void setConsignTime(String consignTime){
		this.consignTime=consignTime;
	}

	public String getConsignTime(){
		return this.consignTime;
	}
	public void setShippingType(String shippingType){
		this.shippingType=shippingType;
	}

	public String getShippingType(){
		return this.shippingType;
	}
	public void setBindOid(Long bindOid){
		this.bindOid=bindOid;
	}

	public Long getBindOid(){
		return this.bindOid;
	}
	public void setLogisticsCompany(String logisticsCompany){
		this.logisticsCompany=logisticsCompany;
	}

	public String getLogisticsCompany(){
		return this.logisticsCompany;
	}
	public void setInvoiceNo(String invoiceNo){
		this.invoiceNo=invoiceNo;
	}

	public String getInvoiceNo(){
		return this.invoiceNo;
	}
	public void setIsDaixiao(Boolean isDaixiao){
		this.isDaixiao=isDaixiao;
	}

	public Boolean getIsDaixiao(){
		return this.isDaixiao;
	}
	public void setDivideOrderFee(String divideOrderFee){
		this.divideOrderFee=divideOrderFee;
	}

	public String getDivideOrderFee(){
		return this.divideOrderFee;
	}
	public void setPartMjzDiscount(String partMjzDiscount){
		this.partMjzDiscount=partMjzDiscount;
	}

	public String getPartMjzDiscount(){
		return this.partMjzDiscount;
	}
	public void setTicketOuterId(String ticketOuterId){
		this.ticketOuterId=ticketOuterId;
	}

	public String getTicketOuterId(){
		return this.ticketOuterId;
	}
	public void setTicketExpdateKey(String ticketExpdateKey){
		this.ticketExpdateKey=ticketExpdateKey;
	}

	public String getTicketExpdateKey(){
		return this.ticketExpdateKey;
	}
	public void setStoreCode(String storeCode){
		this.storeCode=storeCode;
	}

	public String getStoreCode(){
		return this.storeCode;
	}
	public void setIsWww(Boolean isWww){
		this.isWww=isWww;
	}

	public Boolean getIsWww(){
		return this.isWww;
	}
	public void setTmserSpuCode(String tmserSpuCode){
		this.tmserSpuCode=tmserSpuCode;
	}

	public String getTmserSpuCode(){
		return this.tmserSpuCode;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime=updateTime;
	}

	public Date getUpdateTime(){
		return this.updateTime;
	}
	public void setTid(Long tid){
		this.tid=tid;
	}

	public Long getTid(){
		return this.tid;
	}
	public void setDaifa(String daifa){
		this.daifa=daifa;
	}

	public String getDaifa(){
		return this.daifa;
	}
	public void setSellerId(Integer sellerId){
		this.sellerId=sellerId;
	}

	public Integer getSellerId(){
		return this.sellerId;
	}
	public void setCityId(String cityId){
		this.cityId=cityId;
	}

	public String getCityId(){
		return this.cityId;
	}
	public void setCity(String city){
		this.city=city;
	}

	public String getCity(){
		return this.city;
	}

	private Long oid;

	private String itemMealName;

	private String picPath;

	private String sellerNick;

	private String buyerNick;

	private String refundStatus;

	private String outerIid;

	private Boolean buyerRate;

	private Boolean sellerRate;

	private String sellerType;

	private Long cid;

	private String status;

	private String title;

	private String price;

	private Long numIid;

	private Long itemMealId;

	private String skuId;

	private Long num;

	private String outerSkuId;

	private String totalFee;

	private String payment;

	private String discountFee;

	private String adjustFee;

	private Date modified;

	private String skuPropertiesName;

	private Long refundId;

	private Date endTime;

	private String consignTime;

	private String shippingType;

	private Long bindOid;

	private String logisticsCompany;

	private String invoiceNo;

	private Boolean isDaixiao;

	private String divideOrderFee;

	private String partMjzDiscount;

	private String ticketOuterId;

	private String ticketExpdateKey;

	private String storeCode;

	private Boolean isWww;

	private String tmserSpuCode;

	private Date updateTime;

	private Long tid;

	private String daifa;

	private Integer sellerId;

	private String cityId;

	private String city;

	public  Object acqPk(){
		return oid;
	}
}