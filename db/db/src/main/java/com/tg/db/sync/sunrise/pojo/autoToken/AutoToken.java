package com.tg.db.sync.sunrise.pojo.autoToken;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class AutoToken implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setAccessKey(String accessKey){
		this.accessKey=accessKey;
	}

	public String getAccessKey(){
		return this.accessKey;
	}
	public void setAccessToken(String accessToken){
		this.accessToken=accessToken;
	}

	public String getAccessToken(){
		return this.accessToken;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}
	public void setExpiredTime(Date expiredTime){
		this.expiredTime=expiredTime;
	}

	public Date getExpiredTime(){
		return this.expiredTime;
	}

	private Integer id;

	private String accessKey;

	private String accessToken;

	private Date createTime;

	private Date expiredTime;

	public  Object acqPk(){
		return id;
	}
}