package com.fastwebx.common.dao.inf;

import java.util.List;


public interface IScher<Pojo> {
	public List<Pojo> find(IQuery query);
	public int findCnt(IQuery query);
}
