package com.tg.db.sync.sunrise.pojo.userRole;
import com.tg.db.common.IPk;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.tg.db.common.Table;
@Table(name="sunrise")
@Component
public class UserRole implements IPk,Serializable{
	private static final long serialVersionUID = -871092257120622327L;
	public void setScope(String scope){
		this.scope=scope;
	}

	public String getScope(){
		return this.scope;
	}
	public void setId(Long id){
		this.id=id;
	}

	public Long getId(){
		return this.id;
	}
	public void setUserId(String userId){
		this.userId=userId;
	}

	public String getUserId(){
		return this.userId;
	}
	public void setRoleId(Long roleId){
		this.roleId=roleId;
	}

	public Long getRoleId(){
		return this.roleId;
	}

	private String scope;

	private Long id;

	private String userId;

	private Long roleId;

	public  Object acqPk(){
		return id;
	}
}