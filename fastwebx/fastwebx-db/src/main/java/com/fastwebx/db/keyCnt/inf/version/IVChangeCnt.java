package com.fastwebx.db.keyCnt.inf.version;

import com.fastwebx.db.keyCnt.inf.IChangeCnt;
import com.fastwebx.db.modifyPojo.IPojoReload;
import com.fastwebx.db.version.processor.VProcessor;

/**
 * @author mj
 */
public interface IVChangeCnt extends IChangeCnt,IVNumReload{
	default int change(int from,int to){
		return VProcessor.process(() -> {return IChangeCnt.super.change(from,to);}
			, this::reload);
	}
}
