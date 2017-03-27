package com.fastwebx.db.keyCnt.inf;

import com.fastwebx.common.dao.inf.IUpdater;
import com.fastwebx.common.exp.WrongOper;
import com.fastwebx.db.modifyPojo.IPojoUpdate;

/**
 * 变化
 * @author mj
 */
public interface IChangeCnt extends IPojoUpdate,INum{
	default int change(int from,int to){
		int cnt = this.acqCnt();
		if(cnt!=from) throw new WrongOper();
		this.fitCnt(to);
		return this.update();
	}
}
