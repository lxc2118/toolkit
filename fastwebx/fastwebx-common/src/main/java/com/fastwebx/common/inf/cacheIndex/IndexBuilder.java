package com.fastwebx.common.inf.cacheIndex;

import java.util.Set;

import com.fastwebx.common.inf.INumBuilder;
import com.fastwebx.common.inf.IStringBuilder;

public interface IndexBuilder<T> {
	void add(T t,INumBuilder numbuilder, IStringBuilder<T> builder);
	Set<T> get(Object obj);
}
