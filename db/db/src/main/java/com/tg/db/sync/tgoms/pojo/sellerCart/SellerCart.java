package com.tg.db.sync.tgoms.pojo.sellerCart;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="tg_oms")
@Component
public class SellerCart implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setSellerId(Integer sellerId){
		this.sellerId=sellerId;
	}

	public Integer getSellerId(){
		return this.sellerId;
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
	public void setCityId(String cityId){
		this.cityId=cityId;
	}

	public String getCityId(){
		return this.cityId;
	}

	private Integer id;

	private Integer sellerId;

	private Integer num;

	private Float price;

	private String companyName;

	private String companyPhone;

	private String companyAddress;

	private String skuNames;

	private Date createTime;

	private Date updateTime;

	private String itemPic;

	private String itemCode;

	private String innerItemUrl;

	private String innerFrom;

	private String cityId;

	public  Object acqPk(){
		return id;
	}
}