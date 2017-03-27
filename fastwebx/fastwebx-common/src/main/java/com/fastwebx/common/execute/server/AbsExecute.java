package com.fastwebx.common.execute.server;

import com.fastwebx.common.execute.inf.IExecute;

/**
 * 只是实现了 doExecute方法
 * @author mj
 */
public abstract class AbsExecute<Pojo> implements IExecute<Pojo> {
	abstract protected Pojo doExecute(Pojo pojo);
}
