package com.tg.db.sync.tgoms.pojo.playEvolutions;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;

import java.util.Date;

@Table(name="tg_oms")
@Component
public class PlayEvolutions implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setHash(String hash){
		this.hash=hash;
	}

	public String getHash(){
		return this.hash;
	}
	public void setAppliedAt(Date appliedAt){
		this.appliedAt=appliedAt;
	}

	public Date getAppliedAt(){
		return this.appliedAt;
	}
	public void setApplyScript(String applyScript){
		this.applyScript=applyScript;
	}

	public String getApplyScript(){
		return this.applyScript;
	}
	public void setRevertScript(String revertScript){
		this.revertScript=revertScript;
	}

	public String getRevertScript(){
		return this.revertScript;
	}
	public void setState(String state){
		this.state=state;
	}

	public String getState(){
		return this.state;
	}
	public void setLastProblem(String lastProblem){
		this.lastProblem=lastProblem;
	}

	public String getLastProblem(){
		return this.lastProblem;
	}

	private Integer id;

	private String hash;

	private Date appliedAt;

	private String applyScript;

	private String revertScript;

	private String state;

	private String lastProblem;

	public  Object acqPk(){
		return id;
	}
}