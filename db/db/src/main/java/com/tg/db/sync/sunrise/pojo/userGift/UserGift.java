package com.tg.db.sync.sunrise.pojo.userGift;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class UserGift implements IPk,Serializable{
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
	public void setGiftId(Integer giftId){
		this.giftId=giftId;
	}

	public Integer getGiftId(){
		return this.giftId;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}
	public void setSelected(Boolean selected){
		this.selected=selected;
	}

	public Boolean getSelected(){
		return this.selected;
	}

	private Integer id;

	private Integer userId;

	private Integer giftId;

	private Date createTime;

	private Boolean selected;

	public  Object acqPk(){
		return id;
	}
}