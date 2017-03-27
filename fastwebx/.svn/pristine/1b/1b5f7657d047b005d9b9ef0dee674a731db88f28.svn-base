package com.fastwebx.db.rowHandle;

import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;

/**
 * @author mj
 */
public interface RowHandler<T> extends ResultHandler {
	
	public void handleRow(T obj) ;
	
	
	public default void handleResult(ResultContext arg){
		handleRow((T)arg.getResultObject());
	}
}
