package com.fastwebx.common.authority;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

public class CheckerContext {
	
	public HashSet<String> getNeedntChecks() {
		return needntChecks;
	}
	
	public void setNeedntChecks(HashSet<String> needntChecks) {
		this.needntChecks = needntChecks;
	}
	
	public void setNeedntChecksList(List<String> needntChecks) {
		this.needntChecks = new HashSet<String>();
		this.needntChecks.addAll(needntChecks);
	}
	
	public Hashtable<String, IChecker> getClazzCheckers() {
		return clazzCheckers;
	}
	public void setClazzCheckers(Hashtable<String, IChecker> clazzCheckers) {
		this.clazzCheckers = clazzCheckers;
	}
	public List<IChecker> getCheckers() {
		return checkers;
	}
	public void setCheckers(List<IChecker> checkers) {
		this.checkers = checkers;
	}
	
	public static CheckerContext get(){
		return instance;
	}
	private CheckerContext(){
		
	}
	
	public void check(Class clazz,Object obj){
		if(clazz==null) return;
		String clazzName = clazz.getSimpleName();
		if(needntCheck(clazzName)) return;
		if(checkers!=null){
			for(IChecker checker:checkers){
				checker.check(obj);
			}
		}
		if(clazzCheckers!=null){
			IChecker checker = clazzCheckers.get(clazzName);
			checker.check(obj);
		}
		
	}
	private boolean needntCheck(String clazzName){
		return (needntChecks!=null && needntChecks.contains(clazzName));
	}
	
	private List<IChecker> checkers ;
	private Hashtable<String,IChecker> clazzCheckers;
	private HashSet<String> needntChecks;
	private static CheckerContext instance = new CheckerContext();
}
