package com.fastwebx.common.execute.server;
/**
 * @author mj
 */
public class TSExe extends LinkExecutor<String> {

	@Override
	protected String doExecute(String pojo) {
		
		return "========"+pojo+"=======";
	}
	
}
