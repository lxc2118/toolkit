package com.tg.db.sync.tgoms.pojo.tip;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;
@Table(name="tg_oms")
@Component
public class Tip implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setTip(String tip){
		this.tip=tip;
	}

	public String getTip(){
		return this.tip;
	}

	private Integer id;

	private String tip;

	public  Object acqPk(){
		return id;
	}
}