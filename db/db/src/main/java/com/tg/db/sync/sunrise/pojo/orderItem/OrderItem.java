package com.tg.db.sync.sunrise.pojo.orderItem;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class OrderItem implements IPk,Serializable{
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
	public void setNum(Integer num){
		this.num=num;
	}

	public Integer getNum(){
		return this.num;
	}
	public void setRefundNum(Integer refundNum){
		this.refundNum=refundNum;
	}

	public Integer getRefundNum(){
		return this.refundNum;
	}
	public void setItemId(Integer itemId){
		this.itemId=itemId;
	}

	public Integer getItemId(){
		return this.itemId;
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
	public void setRefundFee(Float refundFee){
		this.refundFee=refundFee;
	}

	public Float getRefundFee(){
		return this.refundFee;
	}
	public void setServiceFee(Float serviceFee){
		this.serviceFee=serviceFee;
	}

	public Float getServiceFee(){
		return this.serviceFee;
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
	public void setTakenNum(Integer takenNum){
		this.takenNum=takenNum;
	}

	public Integer getTakenNum(){
		return this.takenNum;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime=updateTime;
	}

	public Date getUpdateTime(){
		return this.updateTime;
	}
	public void setShopId(Integer shopId){
		this.shopId=shopId;
	}

	public Integer getShopId(){
		return this.shopId;
	}
	public void setOrderItemLabelId(Integer orderItemLabelId){
		this.orderItemLabelId=orderItemLabelId;
	}

	public Integer getOrderItemLabelId(){
		return this.orderItemLabelId;
	}
	public void setNumIid(String numIid){
		this.numIid=numIid;
	}

	public String getNumIid(){
		return this.numIid;
	}
	public void setOid(String oid){
		this.oid=oid;
	}

	public String getOid(){
		return this.oid;
	}
	public void setType(String type){
		this.type=type;
	}

	public String getType(){
		return this.type;
	}
	public void setRefundStatus(String refundStatus){
		this.refundStatus=refundStatus;
	}

	public String getRefundStatus(){
		return this.refundStatus;
	}
	public void setItemName(String itemName){
		this.itemName=itemName;
	}

	public String getItemName(){
		return this.itemName;
	}
	public void setRkNum(Integer rkNum){
		this.rkNum=rkNum;
	}

	public Integer getRkNum(){
		return this.rkNum;
	}
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}
	public void setRefundId(Long refundId){
		this.refundId=refundId;
	}

	public Long getRefundId(){
		return this.refundId;
	}

	private Integer id;

	private Integer orderId;

	private Integer num;

	private Integer refundNum;

	private Integer itemId;

	private Float price;

	private Float totalFee;

	private Float payment;

	private Float refundFee;

	private Float serviceFee;

	private String skuNames;

	private Date createTime;

	private Integer takenNum;

	private Date updateTime;

	private Integer shopId;

	private Integer orderItemLabelId;

	private String numIid;

	private String oid;

	private String type;

	private String refundStatus;

	private String itemName;

	private Integer rkNum;

	private String status;

	private Long refundId;

	public  Object acqPk(){
		return id;
	}
}