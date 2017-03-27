package com.fastwebx.db.version.exp;

import java.util.ArrayList;
import java.util.List;

import com.fastwebx.db.modifyPojo.IPojoReload;

/**
 * 必须处理
 * @author mj
 */
public class VExp extends Exception{
	private List<IPojoReload> list ;
	
	public VExp(){
		
	}
	
	public VExp(IPojoReload ... prs){
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
