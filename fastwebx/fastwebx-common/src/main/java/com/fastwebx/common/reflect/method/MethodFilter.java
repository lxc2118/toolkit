package com.fastwebx.common.reflect.method;

import java.lang.reflect.Method;

public interface MethodFilter {
	boolean filte(Method method,String methodName);
}
