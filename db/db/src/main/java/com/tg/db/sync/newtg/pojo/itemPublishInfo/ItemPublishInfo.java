package com.tg.db.sync.newtg.pojo.itemPublishInfo;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="newtg")
@Component
public class ItemPublishInfo implements IPk,Serializable{
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
	public void setItemId(Integer itemId){
		this.itemId=itemId;
	}

	public Integer getItemId(){
		return this.itemId;
	}
	public void setTitle(String title){
		this.title=title;
	}

	public String getTitle(){
		return this.title;
	}
	public void setPlatform(String platform){
		this.platform=platform;
	}

	public String getPlatform(){
		return this.platform;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}
	public void setStartTime(Date startTime){
		this.startTime=startTime;
	}

	public Date getStartTime(){
		return this.startTime;
	}
	public void setFinishTime(Date finishTime){
		this.finishTime=finishTime;
	}

	public Date getFinishTime(){
		return this.finishTime;
	}
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}
	public void setSellerNick(String sellerNick){
		this.sellerNick=sellerNick;
	}

	public String getSellerNick(){
		return this.sellerNick;
	}
	public void setTraceInfo(String traceInfo){
		this.traceInfo=traceInfo;
	}

	public String getTraceInfo(){
		return this.traceInfo;
	}
	public void setPublishDetailJson(String publishDetailJson){
		this.publishDetailJson=publishDetailJson;
	}

	public String getPublishDetailJson(){
		return this.publishDetailJson;
	}
	public void setUsedTimeMillis(Integer usedTimeMillis){
		this.usedTimeMillis=usedTimeMillis;
	}

	public Integer getUsedTimeMillis(){
		return this.usedTimeMillis;
	}
	public void setNumIid(Long numIid){
		this.numIid=numIid;
	}

	public Long getNumIid(){
		return this.numIid;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime=updateTime;
	}

	public Date getUpdateTime(){
		return this.updateTime;
	}
	public void setErrorMsg(String errorMsg){
		this.errorMsg=errorMsg;
	}

	public String getErrorMsg(){
		return this.errorMsg;
	}
	public void setPlatformOnsale(Boolean platformOnsale){
		this.platformOnsale=platformOnsale;
	}

	public Boolean getPlatformOnsale(){
		return this.platformOnsale;
	}
	public void setPrice(Float price){
		this.price=price;
	}

	public Float getPrice(){
		return this.price;
	}
	public void setShopName(String shopName){
		this.shopName=shopName;
	}

	public String getShopName(){
		return this.shopName;
	}
	public void setWdItemId(Integer wdItemId){
		this.wdItemId=wdItemId;
	}

	public Integer getWdItemId(){
		return this.wdItemId;
	}
	public void setAccessToken(String accessToken){
		this.accessToken=accessToken;
	}

	public String getAccessToken(){
		return this.accessToken;
	}
	public void setOfferId(Long offerId){
		this.offerId=offerId;
	}

	public Long getOfferId(){
		return this.offerId;
	}
	public void setMemberId(String memberId){
		this.memberId=memberId;
	}

	public String getMemberId(){
		return this.memberId;
	}

	private Integer id;

	private Integer userId;

	private Integer itemId;

	private String title;

	private String platform;

	private Date createTime;

	private Date startTime;

	private Date finishTime;

	private String status;

	private String sellerNick;

	private String traceInfo;

	private String publishDetailJson;

	private Integer usedTimeMillis;

	private Long numIid;

	private Date updateTime;

	private String errorMsg;

	private Boolean platformOnsale;

	private Float price;

	private String shopName;

	private Integer wdItemId;

	private String accessToken;

	private Long offerId;

	private String memberId;

	public  Object acqPk(){
		return id;
	}
}