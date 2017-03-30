package com.tg.db.sync.sunrise.pojo.supplier;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class Supplier implements IPk,Serializable{
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
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
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
	public void setSiteId(Integer siteId){
		this.siteId=siteId;
	}

	public Integer getSiteId(){
		return this.siteId;
	}
	public void setAddress(String address){
		this.address=address;
	}

	public String getAddress(){
		return this.address;
	}
	public void setAccount(String account){
		this.account=account;
	}

	public String getAccount(){
		return this.account;
	}
	public void setPassword(String password){
		this.password=password;
	}

	public String getPassword(){
		return this.password;
	}
	public void setIdNo(String idNo){
		this.idNo=idNo;
	}

	public String getIdNo(){
		return this.idNo;
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
	public void setPhone(String phone){
		this.phone=phone;
	}

	public String getPhone(){
		return this.phone;
	}

	private Integer id;

	private String name;

	private Date createTime;

	private Date updateTime;

	private Float serviceFee;

	private Float innerServiceFee;

	private String status;

	private Boolean openThx;

	private Float thxFee;

	private String cainiaoShipAddress;

	private String waybillShipAddress;

	private Integer siteId;

	private String address;

	private String account;

	private String password;

	private String idNo;

	private String provinceId;

	private String cityId;

	private String districtId;

	private String phone;

	public  Object acqPk(){
		return id;
	}
}