package com.hcy.ssm.common;

import java.io.Serializable;

public class Query implements Serializable {
	/**
	 * 版本号
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 页数
	 */
	private int page;

	/**
	 * 每页数量
	 */
	private int pageSize;

	public Query() {
	}


}