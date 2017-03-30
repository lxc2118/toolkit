package com.tg.db.sync.newtg.pojo.proxy;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="newtg")
@Component
public class Proxy implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Long id){
		this.id=id;
	}

	public Long getId(){
		return this.id;
	}
	public void setIp(String ip){
		this.ip=ip;
	}

	public String getIp(){
		return this.ip;
	}
	public void setPort(Integer port){
		this.port=port;
	}

	public Integer getPort(){
		return this.port;
	}
	public void setAnonymity(String anonymity){
		this.anonymity=anonymity;
	}

	public String getAnonymity(){
		return this.anonymity;
	}
	public void setType(String type){
		this.type=type;
	}

	public String getType(){
		return this.type;
	}
	public void setCountry(String country){
		this.country=country;
	}

	public String getCountry(){
		return this.country;
	}
	public void setAddress(String address){
		this.address=address;
	}

	public String getAddress(){
		return this.address;
	}
	public void setSpeed(Double speed){
		this.speed=speed;
	}

	public Double getSpeed(){
		return this.speed;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime=updateTime;
	}

	public Date getUpdateTime(){
		return this.updateTime;
	}

	private Long id;

	private String ip;

	private Integer port;

	private String anonymity;

	private String type;

	private String country;

	private String address;

	private Double speed;

	private Date updateTime;

	public  Object acqPk(){
		return id;
	}
}