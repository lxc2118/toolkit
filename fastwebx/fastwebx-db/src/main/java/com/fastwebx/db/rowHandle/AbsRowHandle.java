package com.fastwebx.db.rowHandle;


/**
 * @author mj
 */
public abstract class AbsRowHandle<T> implements RowHandler {

	@Override
	public void handleRow(Object obj) {
		
		if(obj!=null)
			process((T)obj);
	}
	/**
	 * 真正处理
	 * @param t
	 */
	abstract protected void process(T t);

}
