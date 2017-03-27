package com.fastwebx.common.pojoCache;

import java.io.Serializable;

import com.fastwebx.common.dao.inf.IGeter;

/**
 * 用于缓存一个对象（Pojo）,通过dao来进行geter
 * @author mj
 *
 */
public abstract class DaoPojoCache<Pojo> extends AbsPojoCache<Pojo> implements Serializable {

	/**
	 * 
	 */
	protected static final long serialVersionUID = 1L;
	
	
	abstract protected IGeter<Pojo> acqGeter();


	@Override
	protected Pojo doGet(Object pk) {
		return acqGeter().get(pk);
	}
	
	
}
