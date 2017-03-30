package com.tg.db.common;

public class Limit {

	private Long limitStart;
	
	private Long limitEnd;

	public Limit(Long start , Long end) {
		this.limitStart = start;
		this.limitEnd = end;
	}
	
	public Long getLimitStart() {
		return limitStart;
	}

	public void setLimitStart(Long limitStart) {
		this.limitStart = limitStart;
	}

	public Long getLimitEnd() {
		return limitEnd;
	}

	public void setLimitEnd(Long limitEnd) {
		this.limitEnd = limitEnd;
	}
	
}
