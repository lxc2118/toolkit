package com.fastwebx.common.perk;

import java.util.Collection;

public interface IPerk<T> {
	public T perk(Collection<T> collection);
}
