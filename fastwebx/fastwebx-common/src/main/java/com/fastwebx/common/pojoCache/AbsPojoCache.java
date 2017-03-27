package com.fastwebx.common.pojoCache;

import java.io.Serializable;

/**
 * 用于缓存一个对象（Pojo）
 * @author mj
 *
 */
public abstract class AbsPojoCache<Pojo> implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	volatile transient protected Pojo pojo;
	
	abstract protected Pojo doGet(Object pk);
	
	/**
	 * 根据主键查询 并将查询的结果缓存
	 * @param pk
	 * @return
	 */
	public Pojo get(Object pk){
		if(pojo==null){
			pojo = doGet(pk);
		}
		return pojo;
	}
	/**
	 * 将值直接设置进去
	 * @param pojo
	 */
	public void set(Pojo pojo){
		this.pojo = pojo;
	}
}
