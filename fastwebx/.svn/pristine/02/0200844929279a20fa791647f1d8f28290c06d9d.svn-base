package com.fastwebx.db.keyCnt.inf.version;

import com.fastwebx.db.keyCnt.inf.INum;
import com.fastwebx.db.modifyPojo.IPojoReload;
import com.fastwebx.db.version.inf.IVersion;

/**
 * 默认实现了copy
 * @author mj
 */
public interface IVNumReload extends IPojoReload,IVersion,INum {
	default void copy(Object obj){
		if(obj==null) return;
		IVNumReload pojo = (IVNumReload)obj;
		this.setVersion(pojo.getVersion());
		this.setCnt(pojo.getCnt());
	}
}
