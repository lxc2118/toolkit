package com.tg.db.sync.sunrise.pojo.user;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
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
	public void setAvatarId(Long avatarId){
		this.avatarId=avatarId;
	}

	public Long getAvatarId(){
		return this.avatarId;
	}

	private Integer id;

	private String name;

	private Date createTime;

	private Date updateTime;

	private String phone;

	private String qq;

	private String ww;

	private String address;

	private String provinceId;

	private String cityId;

	private String districtId;

	private String status;

	private String wxOpenId;

	private String alipayAccount;

	private String senderName;

	private String senderPhone;

	private String senderAddress;

	private Long avatarId;

	public  Object acqPk(){
		return id;
	}
}