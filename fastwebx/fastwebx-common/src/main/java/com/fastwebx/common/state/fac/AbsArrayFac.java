package com.fastwebx.common.state.fac;
/**
 * 放在数组的工厂类
 * @author mj
 */
public abstract class AbsArrayFac<State> {
	
	volatile protected State[] array  = null;
	
	protected State def = null;
	
	
	
	public void setDef(State def) {
		this.def = def;
	}


	public State getDef() {
		return def;
	}

	
	/**
	 * 根据类型返回
	 * @param type
	 * @return
	 */
	public State get(int type){
		State[] array = this.getArray();
		if(type<0 || type>array.length-1){
			return this.getDef();
		}
		
		State ret = array[type];
		if(ret==null)
			return this.getDef();
		return ret;
	}

	protected State[] getArray() {
		if(array==null) array = doGetArray$();
		return array;
	}

	protected State[] doGetArray$() {
		
		return null;
	}
}
