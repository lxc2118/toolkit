package com.fastwebx.db.modifyPojo;

import org.springframework.beans.BeanUtils;

/**
 * @author mj
 */
public interface ICopyReload extends IPojoReload{
	default void copy(Object obj){
		BeanUtils.copyProperties(obj, this);
	}
}
