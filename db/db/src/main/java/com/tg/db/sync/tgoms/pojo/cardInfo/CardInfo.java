package com.tg.db.sync.tgoms.pojo.cardInfo;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;
@Table(name="tg_oms")
@Component
public class CardInfo implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Long id){
		this.id=id;
	}

	public Long getId(){
		return this.id;
	}
	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
	}
	public void setCardFrontUrl(String cardFrontUrl){
		this.cardFrontUrl=cardFrontUrl;
	}

	public String getCardFrontUrl(){
		return this.cardFrontUrl;
	}
	public void setCardBackUrl(String cardBackUrl){
		this.cardBackUrl=cardBackUrl;
	}

	public String getCardBackUrl(){
		return this.cardBackUrl;
	}
	public void setCardId(String cardId){
		this.cardId=cardId;
	}

	public String getCardId(){
		return this.cardId;
	}

	private Long id;

	private String name;

	private String cardFrontUrl;

	private String cardBackUrl;

	private String cardId;

	public  Object acqPk(){
		return id;
	}
}