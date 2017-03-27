package com.fastwebx.db.version.inf;

import com.fastwebx.common.dao.inf.IPk;

/**
 * 具有乐观锁的对象
 * @author mj
 */
public interface IVersion extends IPk {
	Integer getVersion();
	void setVersion(Integer value);
}
