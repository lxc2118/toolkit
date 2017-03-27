package com.fastwebx.server.hasFinish.inf;

import java.util.Date;

import com.fastwebx.common.util.DateUtil;
import com.fastwebx.server.hasFinish.exp.NotFinish;

/**
 * @author mj
 */
public interface IHasFinish {
	Date getFinishTime();
	void setFinishTime(Date date);
	
	default boolean isFinish(){
		Date date = this.getFinishTime();
		return !(date!=null && !DateUtil.isPast(date));
	}
	
	default void checkFinish(){
		Date date = this.getFinishTime();
		if(date!=null && !DateUtil.isPast(date)){
			throw new NotFinish();
		}
	}
	
	default void  fitFinishTime(long time){
		Date d = new Date();
		d.setTime(d.getTime()+time);
		this.setFinishTime(d);
	}
}
