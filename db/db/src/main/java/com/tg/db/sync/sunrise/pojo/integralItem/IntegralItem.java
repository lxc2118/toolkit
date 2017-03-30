package com.tg.db.sync.sunrise.pojo.integralItem;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class IntegralItem implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setTitle(String title){
		this.title=title;
	}

	public String getTitle(){
		return this.title;
	}
	public void setIntegral(Integer integral){
		this.integral=integral;
	}

	public Integer getIntegral(){
		return this.integral;
	}
	public void setDescription(String description){
		this.description=description;
	}

	public String getDescription(){
		return this.description;
	}
	public void setExchangeNum(Integer exchangeNum){
		this.exchangeNum=exchangeNum;
	}

	public Integer getExchangeNum(){
		return this.exchangeNum;
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
	public void setImgId(Integer imgId){
		this.imgId=imgId;
	}

	public Integer getImgId(){
		return this.imgId;
	}

	private Integer id;

	private String title;

	private Integer integral;

	private String description;

	private Integer exchangeNum;

	private Date createTime;

	private Date updateTime;

	private String status;

	private Integer imgId;

	public  Object acqPk(){
		return id;
	}
}