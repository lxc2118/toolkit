package com.tg.db.sync.newtg.pojo.integralItemOrder;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="newtg")
@Component
public class IntegralItemOrder implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setUserId(Integer userId){
		this.userId=userId;
	}

	public Integer getUserId(){
		return this.userId;
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
	public void setIntegralItemId(Integer integralItemId){
		this.integralItemId=integralItemId;
	}

	public Integer getIntegralItemId(){
		return this.integralItemId;
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
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}
	public void setIntegral(Integer integral){
		this.integral=integral;
	}

	public Integer getIntegral(){
		return this.integral;
	}
	public void setExpressInfo(String expressInfo){
		this.expressInfo=expressInfo;
	}

	public String getExpressInfo(){
		return this.expressInfo;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}

	public String getPhone(){
		return this.phone;
	}

	private Integer id;

	private Integer userId;

	private String address;

	private String provinceId;

	private String cityId;

	private String districtId;

	private Integer integralItemId;

	private Date createTime;

	private Date updateTime;

	private String status;

	private Integer integral;

	private String expressInfo;

	private String phone;

	public  Object acqPk(){
		return id;
	}
}