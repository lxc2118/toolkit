package com.tg.db.sync.sunrise.pojo.stock;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class Stock implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Long id){
		this.id=id;
	}

	public Long getId(){
		return this.id;
	}
	public void setOrderId(Long orderId){
		this.orderId=orderId;
	}

	public Long getOrderId(){
		return this.orderId;
	}
	public void setMatchedId(Long matchedId){
		this.matchedId=matchedId;
	}

	public Long getMatchedId(){
		return this.matchedId;
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
	public void setPrice(Float price){
		this.price=price;
	}

	public Float getPrice(){
		return this.price;
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
	public void setLogisticsId(String logisticsId){
		this.logisticsId=logisticsId;
	}

	public String getLogisticsId(){
		return this.logisticsId;
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
	public void setItemPic(String itemPic){
		this.itemPic=itemPic;
	}

	public String getItemPic(){
		return this.itemPic;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}

	public String getUserName(){
		return this.userName;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}

	public String getPhone(){
		return this.phone;
	}
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}
	public void setDoorNo(String doorNo){
		this.doorNo=doorNo;
	}

	public String getDoorNo(){
		return this.doorNo;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}

	public String getRemark(){
		return this.remark;
	}
	public void setAreaId(Integer areaId){
		this.areaId=areaId;
	}

	public Integer getAreaId(){
		return this.areaId;
	}
	public void setOrderItemId(Integer orderItemId){
		this.orderItemId=orderItemId;
	}

	public Integer getOrderItemId(){
		return this.orderItemId;
	}

	private Long id;

	private Long orderId;

	private Long matchedId;

	private String itemName;

	private Integer num;

	private Float price;

	private String companyName;

	private String companyPhone;

	private String companyAddress;

	private String logisticsId;

	private String skuNames;

	private Date createTime;

	private Date updateTime;

	private String itemPic;

	private String userName;

	private String phone;

	private String status;

	private String doorNo;

	private String remark;

	private Integer areaId;

	private Integer orderItemId;

	public  Object acqPk(){
		return id;
	}
}