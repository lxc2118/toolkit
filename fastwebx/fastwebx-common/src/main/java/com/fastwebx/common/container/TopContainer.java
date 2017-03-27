package com.fastwebx.common.container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * 非线程安全
 * 保存固定值的容器类
 * @author mj
 */
public class TopContainer<E> implements Iterable<E> {
	private List<E> list = new ArrayList<E>();
	private int size;
	private Comparator<E> comparator;
	private E min;
	
	public TopContainer(){
		this.size=10;
	}
	public TopContainer(int size){
		this.size=size;
	}
	
	public TopContainer(int size, Comparator<E> comparator) {
		super();
		this.size = size;
		this.comparator = comparator;
	}
	public void setComparator(Comparator<E> comparator) {
		this.comparator = comparator;
	}
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public Iterator<E> iterator() {
		return list.iterator();
	}
	
	public void add(E e){
		if(e==null) return;
		if(couldAdd(e)){
			list.add(e);
			sort();
			min = list.get(list.size()-1);
		}
		if(list.size()>size){
			list.remove(list.size()-1);
		}
	}

	private void sort() {
		Collections.sort(list, buildComparator());
	}

	protected Comparator<E> buildComparator() {
		if(this.comparator==null)
			return new ICom2();
		return new ICom1();
	}
	private boolean couldAdd(E e) {
		if(list.size()<size){
			return true;
		}
		
		
		return bigThanMin(e);
	}

	private boolean bigThanMin(E e) {
		if(min==null) return true;
		if(this.comparator!=null)
			return this.comparator.compare(this.min,e)<0;
		if(min instanceof Comparable){
			return ((Comparable) min).compareTo(e)<0;
		}
		return true;
	}
	
	
	
	class ICom1 implements Comparator<E>{
		
		@Override
		public int compare(E o1, E o2) {
			
			return -1*comparator.compare(o1, o2);
		}
		
	}
	
	class ICom2 implements Comparator<E>{
		
		@Override
		public int compare(E o1, E o2) {
			if(o2 instanceof Comparable)
				return ((Comparable) o2).compareTo(o1);
			return 0;
		}
		
	}
}
