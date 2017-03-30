package com.tg.db.sync.sunrise.pojo.staff;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class Staff implements IPk,Serializable{
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
	public void setPhone(String phone){
		this.phone=phone;
	}

	public String getPhone(){
		return this.phone;
	}
	public void setUsername(String username){
		this.username=username;
	}

	public String getUsername(){
		return this.username;
	}
	public void setPassword(String password){
		this.password=password;
	}

	public String getPassword(){
		return this.password;
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
	public void setSiteId(Integer siteId){
		this.siteId=siteId;
	}

	public Integer getSiteId(){
		return this.siteId;
	}
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}

	private Integer id;

	private String name;

	private String phone;

	private String username;

	private String password;

	private Date createTime;

	private Date updateTime;

	private Integer siteId;

	private String status;

	public  Object acqPk(){
		return id;
	}
}