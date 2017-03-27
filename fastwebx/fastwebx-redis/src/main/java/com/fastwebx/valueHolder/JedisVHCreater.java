package com.fastwebx.valueHolder;

import com.fastwebx.common.valueHolder.IVHCreater;
import com.fastwebx.common.valueHolder.IValueHolder;

/**
 * 作为session 创建value用
 * @author mj
 *
 */
public class JedisVHCreater implements IVHCreater {

	@Override
	public IValueHolder create() {
		
		return new JedisValueHolder(JedisSessionContext.get());
	}
	
}
