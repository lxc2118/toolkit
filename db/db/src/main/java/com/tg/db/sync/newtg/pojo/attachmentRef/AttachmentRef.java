package com.tg.db.sync.newtg.pojo.attachmentRef;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;
@Table(name="newtg")
@Component
public class AttachmentRef implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}
	public void setAttachmentId(Integer attachmentId){
		this.attachmentId=attachmentId;
	}

	public Integer getAttachmentId(){
		return this.attachmentId;
	}

	private Integer id;

	private Integer attachmentId;

	public  Object acqPk(){
		return id;
	}
}