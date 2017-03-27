package com.fastwebx.common.inf;

public interface ICommit<Pojo> extends IRollBack<Pojo> {
	void commit(Pojo pojo);
}
