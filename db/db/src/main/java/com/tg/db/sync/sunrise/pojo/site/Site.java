package com.tg.db.sync.sunrise.pojo.site;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class Site implements IPk,Serializable{
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
	public void setCityId(String cityId){
		this.cityId=cityId;
	}

	public String getCityId(){
		return this.cityId;
	}
	public void setProvinceId(String provinceId){
		this.provinceId=provinceId;
	}

	public String getProvinceId(){
		return this.provinceId;
	}
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
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
	public void setDistrictId(String districtId){
		this.districtId=districtId;
	}

	public String getDistrictId(){
		return this.districtId;
	}
	public void setShown(Boolean shown){
		this.shown=shown;
	}

	public Boolean getShown(){
		return this.shown;
	}

	private Integer id;

	private String name;

	private String cityId;

	private String provinceId;

	private String status;

	private Date createTime;

	private Date updateTime;

	private String districtId;

	private Boolean shown;

	public  Object acqPk(){
		return id;
	}
}