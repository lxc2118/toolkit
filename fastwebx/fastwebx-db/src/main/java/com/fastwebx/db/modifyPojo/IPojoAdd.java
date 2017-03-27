package com.fastwebx.db.modifyPojo;

import com.fastwebx.db.dao.help.DaoHelp;

/**
 * @author mj
 */
public interface IPojoAdd {
	default void add(){
		DaoHelp.add(this);
	}
}
