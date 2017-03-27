package com.fastwebx.common.state.fac;

import java.util.HashMap;

import com.fastwebx.common.state.domain.AbsState;
import com.fastwebx.common.state.inf.IStatePojo;

/**
 * 状态工厂类的父类
 * @author mj
 */
public abstract class AbsStateFac<Pojo extends IStatePojo,State extends AbsState<Pojo>> {
	private HashMap<Integer, State> map = new HashMap<Integer, State>();
	
	/**
	 * 将状态码和状态类对应
	 * @param id
	 * @param state
	 */
	protected void put(Integer id,State state){
		map.put(id, state);
	}
	/**
	 * 根据状态码取状态类
	 * @param id
	 * @return
	 */
	protected State getById(Integer id){
		return map.get(id);
	}
	
	/**
	 * 根据状态对象返回状态类
	 * @param pojo
	 * @return
	 */
	public State get(Pojo pojo){
		State ret = this.getById(pojo.getState());
		Integer newState = null;
		while((newState=ret.change(pojo))!=null){
			ret = getById(newState);
			pojo.setState(newState);
		}
		return ret;
	}
	
}
