package com.fastwebx.db.cache.domain;

import java.util.function.Supplier;

/**
 * @author mj
 */
public class SupplierCache<T> extends FWCache<T> {
	private Supplier<T> supplier;
	public SupplierCache(Supplier<T> supplier ){
		this.supplier = supplier;
	}
	@Override
	protected T doGeted() {
		if(supplier==null)
			return null;
		return supplier.get();
	}
	
}
