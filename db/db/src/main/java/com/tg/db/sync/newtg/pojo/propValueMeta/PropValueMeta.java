package com.tg.db.sync.newtg.pojo.propValueMeta;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;
@Table(name="newtg")
@Component
public class PropValueMeta implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setVid(Integer vid){
		this.vid=vid;
	}

	public Integer getVid(){
		return this.vid;
	}
	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
	}

	private Integer vid;

	private String name;

	public  Object acqPk(){
		return vid;
	}
}