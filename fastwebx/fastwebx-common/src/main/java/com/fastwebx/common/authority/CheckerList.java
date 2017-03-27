package com.fastwebx.common.authority;

import java.util.ArrayList;
import java.util.List;

public class CheckerList implements IChecker{
	@Override
	public void check(Object pojo) {
		if(list!=null){
			for(IChecker checker:list)
				checker.check(pojo);
		}
		
	}
	public void add(IChecker checker){
		if(list!=null)
			list.add(checker);
	}
	

	public List<IChecker> getList() {
		return list;
	}

	public void setList(List<IChecker> list) {
		this.list = list;
	}

	private List<IChecker> list=new ArrayList<IChecker>();
	
}
