package com.tg.db.sync.tgoms.pojo.user;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="tg_oms")
@Component
public class User implements IPk,Serializable{
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
	public void setLoginTimes(Integer loginTimes){
		this.loginTimes=loginTimes;
	}

	public Integer getLoginTimes(){
		return this.loginTimes;
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
	public void setLastLoginTime(Date lastLoginTime){
		this.lastLoginTime=lastLoginTime;
	}

	public Date getLastLoginTime(){
		return this.lastLoginTime;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}

	public String getPhone(){
		return this.phone;
	}
	public void setQq(String qq){
		this.qq=qq;
	}

	public String getQq(){
		return this.qq;
	}
	public void setWw(String ww){
		this.ww=ww;
	}

	public String getWw(){
		return this.ww;
	}
	public void setAddress(String address){
		this.address=address;
	}

	public String getAddress(){
		return this.address;
	}
	public void setProvinceId(String provinceId){
		this.provinceId=provinceId;
	}

	public String getProvinceId(){
		return this.provinceId;
	}
	public void setCityId(String cityId){
		this.cityId=cityId;
	}

	public String getCityId(){
		return this.cityId;
	}
	public void setDistrictId(String districtId){
		this.districtId=districtId;
	}

	public String getDistrictId(){
		return this.districtId;
	}
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}
	public void setServiceFee(Float serviceFee){
		this.serviceFee=serviceFee;
	}

	public Float getServiceFee(){
		return this.serviceFee;
	}
	public void setInnerServiceFee(Float innerServiceFee){
		this.innerServiceFee=innerServiceFee;
	}

	public Float getInnerServiceFee(){
		return this.innerServiceFee;
	}
	public void setAccount(String account){
		this.account=account;
	}

	public String getAccount(){
		return this.account;
	}
	public void setType(String type){
		this.type=type;
	}

	public String getType(){
		return this.type;
	}
	public void setPassword(String password){
		this.password=password;
	}

	public String getPassword(){
		return this.password;
	}
	public void setSenderName(String senderName){
		this.senderName=senderName;
	}

	public String getSenderName(){
		return this.senderName;
	}
	public void setSenderPhone(String senderPhone){
		this.senderPhone=senderPhone;
	}

	public String getSenderPhone(){
		return this.senderPhone;
	}
	public void setSenderAddress(String senderAddress){
		this.senderAddress=senderAddress;
	}

	public String getSenderAddress(){
		return this.senderAddress;
	}
	public void setWxOpenId(String wxOpenId){
		this.wxOpenId=wxOpenId;
	}

	public String getWxOpenId(){
		return this.wxOpenId;
	}
	public void setAlipayAccount(String alipayAccount){
		this.alipayAccount=alipayAccount;
	}

	public String getAlipayAccount(){
		return this.alipayAccount;
	}
	public void setIdNo(String idNo){
		this.idNo=idNo;
	}

	public String getIdNo(){
		return this.idNo;
	}
	public void setSellerEmail(String sellerEmail){
		this.sellerEmail=sellerEmail;
	}

	public String getSellerEmail(){
		return this.sellerEmail;
	}
	public void setWebUserId(Integer webUserId){
		this.webUserId=webUserId;
	}

	public Integer getWebUserId(){
		return this.webUserId;
	}
	public void setCainiaoShipAddress(String cainiaoShipAddress){
		this.cainiaoShipAddress=cainiaoShipAddress;
	}

	public String getCainiaoShipAddress(){
		return this.cainiaoShipAddress;
	}
	public void setWaybillShipAddress(String waybillShipAddress){
		this.waybillShipAddress=waybillShipAddress;
	}

	public String getWaybillShipAddress(){
		return this.waybillShipAddress;
	}
	public void setPowerPassword(String powerPassword){
		this.powerPassword=powerPassword;
	}

	public String getPowerPassword(){
		return this.powerPassword;
	}
	public void setOpenThx(Boolean openThx){
		this.openThx=openThx;
	}

	public Boolean getOpenThx(){
		return this.openThx;
	}
	public void setThxFee(Float thxFee){
		this.thxFee=thxFee;
	}

	public Float getThxFee(){
		return this.thxFee;
	}

	private Integer id;

	private String name;

	private Integer loginTimes;

	private Date createTime;

	private Date updateTime;

	private Date lastLoginTime;

	private String phone;

	private String qq;

	private String ww;

	private String address;

	private String provinceId;

	private String cityId;

	private String districtId;

	private String status;

	private Float serviceFee;

	private Float innerServiceFee;

	private String account;

	private String type;

	private String password;

	private String senderName;

	private String senderPhone;

	private String senderAddress;

	private String wxOpenId;

	private String alipayAccount;

	private String idNo;

	private String sellerEmail;

	private Integer webUserId;

	private String cainiaoShipAddress;

	private String waybillShipAddress;

	private String powerPassword;

	private Boolean openThx;

	private Float thxFee;

	public  Object acqPk(){
		return id;
	}
}