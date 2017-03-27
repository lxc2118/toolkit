package com.fastwebx.common.execute.inf;
/**
 * 可执行，返回同样的类型
 * @author mj
 */
public interface IExecute<Pojo> {
	public Pojo execute(Pojo pojo);
}
