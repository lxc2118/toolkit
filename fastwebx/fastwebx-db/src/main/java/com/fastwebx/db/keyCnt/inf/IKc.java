package com.fastwebx.db.keyCnt.inf;
/**
 * 有key 有cnt
 * 没错对iKeycnt不满意重新写的
 * @author mj
 */
public interface IKc<T> extends IKey<T> {
	Integer getCnt();
	
}
