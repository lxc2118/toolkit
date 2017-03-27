package com.fastwebx.db.keyCnt.inf;

import com.fastwebx.common.exp.WrongOper;
import com.fastwebx.db.modifyPojo.IPojoDel;
import com.fastwebx.db.modifyPojo.IPojoUpdate;

/**
 * @author mj
 */
public interface IAcqCnt extends IPojoUpdate,IPojoDel,INum{
	
	
	
	default void check(int cnt){
		if(this.acqCnt()<cnt || cnt<0){
			throw createNotEnghouCnt();
		}
	}
	
	default int add(int cnt){
		if(cnt<=0) throw new WrongOper();
		this.fitCnt(cnt+this.acqCnt());
		return this.update();
	}
	
	default int sub(int cnt){
		if(cnt<=0) throw new WrongOper();
		int val = this.acqCnt()-cnt;
		if(val>0){
			this.fitCnt(val);
			return this.update();
		}else{
			if(this.needDel()){
				return this.del();
			}else{
				this.fitCnt(val);
				return this.update();
			}
		}
	}
	
	default void checkAndSub(int cnt){
		check(cnt);
		sub(cnt);
	}
	
	default RuntimeException createNotEnghouCnt(){
		return new WrongOper();
	}
	
	default boolean needDel(){
		return true;
	}
}
