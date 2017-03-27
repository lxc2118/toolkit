package com.fastwebx.db.keyCnt.inf.version;

import com.fastwebx.common.dao.inf.IPk;
import com.fastwebx.common.exp.WrongOper;
import com.fastwebx.db.dao.help.DaoHelp;
import com.fastwebx.db.keyCnt.inf.IAcqCnt;
import com.fastwebx.db.modifyPojo.IPojoReload;
import com.fastwebx.db.version.inf.IVersion;
import com.fastwebx.db.version.processor.VProcessor;

/**
 * 有版本的kcnt
 * @author mj
 */
public interface IVAcqCnt extends IAcqCnt,IVNumReload {
	default int add(int cnt){
		return VProcessor.process(() -> {return IAcqCnt.super.add(cnt);}
			, this::reload);
	}
	
	default int sub(int cnt){
		return VProcessor.process(() -> {return IAcqCnt.super.sub(cnt);}
			, this::reload);
	}
	
	
	
	
	
	
}
