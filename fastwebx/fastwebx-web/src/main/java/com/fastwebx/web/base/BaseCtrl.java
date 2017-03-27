package com.fastwebx.web.base;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.servlet.tags.Param;

import com.fastwebx.common.authority.CheckerContext;
import com.fastwebx.common.authority.IChecker;
import com.fastwebx.common.inf.IProcessor;

public abstract class BaseCtrl<Server>  {
	
	public abstract Server acqDao();
	
	public List<IChecker> getCheckers() {
		return checkers;
	}

	public void setCheckers(List<IChecker> checkers) {
		this.checkers = checkers;
	}
	
	protected String createErrorMsg(Object pojo){
		return errorMsg;
	}
	
	protected void check(Object obj){
		if(!needCheck) return;
		CheckerContext.get().check(this.getClass(), obj);
		if(checkers!=null){
			for(IChecker checker:checkers)
				checker.check(obj);
		}
	}
	
	protected void preProcessAndCheck(Object obj){
		preProcess(obj);
		check(obj);
	}
	
	/**
	 * 预处理
	 * @param obj
	 */
	protected void preProcess(Object obj){
		if(processores!=null){
			for(IProcessor processor:processores){
				processor.process(obj);
			}
		}
	}
	
	public void addProcessor(IProcessor processor){
		if(processores==null)
			processores = new ArrayList<IProcessor>();
		processores.add(processor);
	}
	
	public void setProcessor(IProcessor processor){
		addProcessor(processor);
	}
	
	public void addChecker(IChecker checker){
		if(checkers==null)
			checkers = new ArrayList<IChecker>();
		checkers.add(checker);
	}
	
	public void setChecker(IChecker checker){
		addChecker(checker);
	}
	protected void init(){
		
	}
	
	@InitBinder
	protected void initBinder(HttpServletRequest request,
		ServletRequestDataBinder binder) throws Exception {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor dateEditor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, dateEditor);
	}
	
	protected boolean needRefresh = true;
	protected String errorMsg = null;
	protected String success = "{}";
	protected boolean needCheck = true;
	protected List<IChecker> checkers;
	protected List<IProcessor> processores;
}
