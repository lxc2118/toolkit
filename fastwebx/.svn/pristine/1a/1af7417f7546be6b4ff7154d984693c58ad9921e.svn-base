package com.fastwebx.db.info;

import com.fastwebx.db.dao.BaseDao;

/**
 * 系统信息
 * @author ytrgmj
 *
 * @param <T>
 * @param <P>
 */
public interface ISysInfo<T extends IPlayerState,P> {

	BaseDao<T> acqPlayerInfoDao();
	
	default T acqInfo(P player){
		BaseDao dao = this.acqPlayerInfoDao();
		T t = findPlayerInfo(player);
		if(t==null){
			t=createPlayerInfo(player);
			dao.add(t);
		}
		t.fitSysInfo(this);
		return t;
	}
	
	
	
	T createPlayerInfo(P p); 
	T findPlayerInfo(P p); 
	
}
