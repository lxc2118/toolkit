package com.tg.db.sync.sunrise.pojo.notification;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class Notification implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setNotification(String notification){
		this.notification=notification;
	}

	public String getNotification(){
		return this.notification;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}
	public void setSupplierId(Long supplierId){
		this.supplierId=supplierId;
	}

	public Long getSupplierId(){
		return this.supplierId;
	}

	private Integer id;

	private String notification;

	private Date createTime;

	private Long supplierId;

	public  Object acqPk(){
		return id;
	}
}