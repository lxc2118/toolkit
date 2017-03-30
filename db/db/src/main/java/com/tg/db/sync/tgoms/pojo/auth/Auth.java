package com.tg.db.sync.tgoms.pojo.auth;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="tg_oms")
@Component
public class Auth implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setLastAuthTime(Date lastAuthTime){
		this.lastAuthTime=lastAuthTime;
	}

	public Date getLastAuthTime(){
		return this.lastAuthTime;
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
	public void setExpireTime(Long expireTime){
		this.expireTime=expireTime;
	}

	public Long getExpireTime(){
		return this.expireTime;
	}
	public void setSellerId(Integer sellerId){
		this.sellerId=sellerId;
	}

	public Integer getSellerId(){
		return this.sellerId;
	}
	public void setAuthTimes(Integer authTimes){
		this.authTimes=authTimes;
	}

	public Integer getAuthTimes(){
		return this.authTimes;
	}
	public void setType(String type){
		this.type=type;
	}

	public String getType(){
		return this.type;
	}
	public void setAccessToken(String accessToken){
		this.accessToken=accessToken;
	}

	public String getAccessToken(){
		return this.accessToken;
	}
	public void setTokenType(String tokenType){
		this.tokenType=tokenType;
	}

	public String getTokenType(){
		return this.tokenType;
	}
	public void setExpiresIn(Integer expiresIn){
		this.expiresIn=expiresIn;
	}

	public Integer getExpiresIn(){
		return this.expiresIn;
	}
	public void setRefreshToken(String refreshToken){
		this.refreshToken=refreshToken;
	}

	public String getRefreshToken(){
		return this.refreshToken;
	}
	public void setReExpiresIn(Integer reExpiresIn){
		this.reExpiresIn=reExpiresIn;
	}

	public Integer getReExpiresIn(){
		return this.reExpiresIn;
	}
	public void setR1expiresIn(Integer r1expiresIn){
		this.r1expiresIn=r1expiresIn;
	}

	public Integer getR1expiresIn(){
		return this.r1expiresIn;
	}
	public void setR2expiresIn(Integer r2expiresIn){
		this.r2expiresIn=r2expiresIn;
	}

	public Integer getR2expiresIn(){
		return this.r2expiresIn;
	}
	public void setW1expiresIn(Integer w1expiresIn){
		this.w1expiresIn=w1expiresIn;
	}

	public Integer getW1expiresIn(){
		return this.w1expiresIn;
	}
	public void setW2expiresIn(Integer w2expiresIn){
		this.w2expiresIn=w2expiresIn;
	}

	public Integer getW2expiresIn(){
		return this.w2expiresIn;
	}
	public void setTaobaoUserNick(String taobaoUserNick){
		this.taobaoUserNick=taobaoUserNick;
	}

	public String getTaobaoUserNick(){
		return this.taobaoUserNick;
	}
	public void setTaobaoUserId(String taobaoUserId){
		this.taobaoUserId=taobaoUserId;
	}

	public String getTaobaoUserId(){
		return this.taobaoUserId;
	}
	public void setSubTaobaoUserId(String subTaobaoUserId){
		this.subTaobaoUserId=subTaobaoUserId;
	}

	public String getSubTaobaoUserId(){
		return this.subTaobaoUserId;
	}
	public void setSubTaobaoUserNick(String subTaobaoUserNick){
		this.subTaobaoUserNick=subTaobaoUserNick;
	}

	public String getSubTaobaoUserNick(){
		return this.subTaobaoUserNick;
	}

	private Integer id;

	private Date lastAuthTime;

	private Date createTime;

	private Date updateTime;

	private Long expireTime;

	private Integer sellerId;

	private Integer authTimes;

	private String type;

	private String accessToken;

	private String tokenType;

	private Integer expiresIn;

	private String refreshToken;

	private Integer reExpiresIn;

	private Integer r1expiresIn;

	private Integer r2expiresIn;

	private Integer w1expiresIn;

	private Integer w2expiresIn;

	private String taobaoUserNick;

	private String taobaoUserId;

	private String subTaobaoUserId;

	private String subTaobaoUserNick;

	public  Object acqPk(){
		return id;
	}
}