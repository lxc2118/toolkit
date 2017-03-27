package com.fastwebx.common.reflect.method;

import java.lang.reflect.Method;

public class SetMethodFilter implements MethodFilter {

	@Override
	public boolean filte(Method method, String methodName) {
		
		return methodName.startsWith("set") 
				&& method.getParameterTypes().length==1;
	}

}
