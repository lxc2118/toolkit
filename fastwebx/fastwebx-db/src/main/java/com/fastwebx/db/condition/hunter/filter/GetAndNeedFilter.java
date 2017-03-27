package com.fastwebx.db.condition.hunter.filter;

import java.lang.reflect.Method;

import com.fastwebx.common.reflect.method.GetMethodFilter;
import com.fastwebx.common.reflect.method.MethodFilter;
import com.fastwebx.db.condition.annotation.NoCdt;


public class GetAndNeedFilter implements MethodFilter {
	@Override
	public boolean filte(Method method, String methodName) {
		return filter.filte(method, methodName)
				&& method.getAnnotation(NoCdt.class)==null;
	}

	private GetMethodFilter filter = new GetMethodFilter();
}
