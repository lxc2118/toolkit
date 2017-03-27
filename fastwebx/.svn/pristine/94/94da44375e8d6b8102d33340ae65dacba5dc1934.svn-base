package com.fastwebx.db.modifyPojo;

import com.fastwebx.common.dao.inf.IPk;
import com.fastwebx.db.dao.help.DaoHelp;

/**
 * @author mj
 */
public interface IPojoReload extends IPk{
	default void reload(){
		Object obj =  DaoHelp.get(this.getClass(), this.acqPk());
		copy(obj);
	}
	void copy(Object obj);
}
