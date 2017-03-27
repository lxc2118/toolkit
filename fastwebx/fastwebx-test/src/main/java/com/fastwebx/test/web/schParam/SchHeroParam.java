package com.fastwebx.test.web.schParam;

import com.fastwebx.db.condition.annotation.CdtInit;
import com.fastwebx.db.condition.schObject.SchParam;

public class SchHeroParam extends SchParam {
	private Integer hid;
	private String hname;
	private String mname;
	public SchHeroParam(){
		this.needCloth(true);
	}
	public Integer getHid() {
		return hid;
	}
	public void setHid(Integer hid) {
		this.hid = hid;
	}
	@CdtInit(op="like")
	public String getHname() {
		if(hname!=null && !hname.equals(""))
			hname=hname+"%";
		return hname;
	}
	
	public void setHname(String hname) {
		this.hname = hname;
	}
	@CdtInit(joinTableName="menpai",joinColName="mid")
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	
	
}
