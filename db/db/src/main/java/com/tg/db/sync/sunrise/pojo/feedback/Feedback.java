package com.tg.db.sync.sunrise.pojo.feedback;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;
@Table(name="sunrise")
@Component
public class Feedback implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}

	public String getPhone(){
		return this.phone;
	}
	public void setSuggestion(String suggestion){
		this.suggestion=suggestion;
	}

	public String getSuggestion(){
		return this.suggestion;
	}

	private Integer id;

	private String phone;

	private String suggestion;

	public  Object acqPk(){
		return id;
	}
}