package com.tg.db.sync.sunrise.pojo.smartTask;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="sunrise")
@Component
public class SmartTask implements IPk,Serializable{
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
	public void setLastRunTime(Date lastRunTime){
		this.lastRunTime=lastRunTime;
	}

	public Date getLastRunTime(){
		return this.lastRunTime;
	}
	public void setLastFinishTime(Date lastFinishTime){
		this.lastFinishTime=lastFinishTime;
	}

	public Date getLastFinishTime(){
		return this.lastFinishTime;
	}
	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return this.status;
	}
	public void setLastRunResult(String lastRunResult){
		this.lastRunResult=lastRunResult;
	}

	public String getLastRunResult(){
		return this.lastRunResult;
	}
	public void setRunning(Boolean running){
		this.running=running;
	}

	public Boolean getRunning(){
		return this.running;
	}
	public void setLastRunMsg(String lastRunMsg){
		this.lastRunMsg=lastRunMsg;
	}

	public String getLastRunMsg(){
		return this.lastRunMsg;
	}
	public void setCron(String cron){
		this.cron=cron;
	}

	public String getCron(){
		return this.cron;
	}
	public void setJobClass(String jobClass){
		this.jobClass=jobClass;
	}

	public String getJobClass(){
		return this.jobClass;
	}
	public void setConfigJson(String configJson){
		this.configJson=configJson;
	}

	public String getConfigJson(){
		return this.configJson;
	}

	private Integer id;

	private String name;

	private Date createTime;

	private Date updateTime;

	private Date lastRunTime;

	private Date lastFinishTime;

	private String status;

	private String lastRunResult;

	private Boolean running;

	private String lastRunMsg;

	private String cron;

	private String jobClass;

	private String configJson;

	public  Object acqPk(){
		return id;
	}
}