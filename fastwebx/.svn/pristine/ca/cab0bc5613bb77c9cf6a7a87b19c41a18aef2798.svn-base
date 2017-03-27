package com.fastwebx.common.perk.imp;

import java.util.Collection;

import com.fastwebx.common.perk.IPerk;

public abstract class AbsPerk<T> implements IPerk<T>  {
	
	protected abstract boolean isHit(T t);
	
	@Override
	public T perk(Collection<T> collection) {
		if(collection==null)
			return null;
		for(T t:collection){
			if(isHit(t))
				return t;
		}
		return null;
	}
	
}
