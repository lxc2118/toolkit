package com.fastwebx.common.perk.imp;

import java.util.ArrayList;
import java.util.Collection;

import com.fastwebx.common.perk.IPerk;

public abstract class  MaxPerk<T> implements IPerk<T>{
	abstract protected int compare(T t1,T t2);
	
	public T perk(T ...ts ){
		ArrayList<T> array = new ArrayList<T>();
		for(T t:ts){
			array.add(t);
		}
		return perk(array);
	}
	
	@Override
	public T perk(Collection<T> collection) {
		if(collection==null || collection.size()==0)
			return null;
		T ret = null;
		for(T n:collection){
			if(ret ==null || compare(ret,n)<0){
				ret = n;
			}
		};
		return ret;
	}
	
}
