package com.fastwebx.db.version.exp;

import java.util.ArrayList;
import java.util.List;

import com.fastwebx.common.exp.base.ErrorCode;
import com.fastwebx.db.modifyPojo.IPojoReload;

/**
 * @author mj
 */
public class VersionExp  extends ErrorCode {

	private List<IPojoReload> list ;
	
	public VersionExp(){
		
	}
	
	public VersionExp(IPojoReload ... prs){
		if(prs!=null){
			list = new ArrayList<>();
			for(IPojoReload pr:prs){
				list.add(pr);
			}
		}
	}
	
	public void reload(){
		if(list!=null){
			list.forEach(pr->pr.reload());
		}
	}
	
	@Override
	public String getMessage() {
		
		return "错误的数据版本";
	}
	
}
