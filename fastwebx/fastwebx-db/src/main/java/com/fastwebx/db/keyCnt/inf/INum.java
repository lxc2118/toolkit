package com.fastwebx.db.keyCnt.inf;
/**
 * @author mj
 */
public interface INum {
	void setCnt(Integer val);
	Integer getCnt();
	
	/**
	 * 程序用
	 * @param val
	 */
	default void fitCnt(Integer val){
		setCnt(val);
	}
	
	default Integer acqCnt(){
		return getCnt();
	}
}
