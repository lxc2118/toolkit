package com.fastwebx.common.inf.pojo.imp;

import com.fastwebx.common.inf.pojo.IKeyCnt;
import com.fastwebx.db.keyCnt.inf.IKc;
/**
 * 具有key和cnt的值
 * @author ytrgmj
 *
 */
public class KeyCnt implements IKeyCnt,IKc<Integer>  {
	
	
	protected Integer key; 
	protected Integer cnt; 
	public KeyCnt(){
		
	}
	
	
	public KeyCnt(Integer key, Integer cnt) {
		super();
		this.key = key;
		this.cnt = cnt;
	}


	@Override
	public Integer acqKey() {
		return key;
	}
	public Integer getKey() {
		return key;
	}
	public void setKey(Integer key) {
		this.key = key;
	}
	public Integer getCnt() {
		return cnt;
	}
	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}
	
}
