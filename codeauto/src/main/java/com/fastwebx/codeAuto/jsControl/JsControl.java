package com.fastwebx.codeAuto.jsControl;

import java.util.ArrayList;
import java.util.List;

import com.fastwebx.codeAuto.jsControl.rule.CheckEmpty;
import com.fastwebx.codeAuto.jsControl.rule.Rule;
import com.fastwebx.codeAuto.pojo.Column;
import com.fastwebx.codeAuto.util.NameUtil;

public abstract class JsControl {
	public Column getColumn() {
		return column;
	}

	public void setColumn(Column column) {
		this.column = column;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("new ");
		sb.append(getName());
		sb.append("({field:'");
		sb.append(NameUtil.get().pasical(this.column.getName()));
		sb.append("',name:'");
		sb.append(NameUtil.get().pasical(this.column.getName()));
		sb.append("'");
		String ruleStr = this.getRuleStr();
		if(ruleStr!=null){
			sb.append(",rules:[");
			sb.append(ruleStr);
			sb.append("]");
		}
		sb.append("})");
		return sb.toString();
	}

	public String getName(){
		return this.getClass().getSimpleName();
	}
	
	public String getRuleStr(){
		StringBuffer sb = new StringBuffer();
		List<Rule> list = this.getRules();
		if(list!=null){
			for(int i=0;i<list.size();i++){
				if(i!=0)
					sb.append(",");
				sb.append(list.get(i).toString());
			}
		}else{
			return null;
		}
		return sb.toString();
	}
	
	protected List<Rule> getRules(){
		List<Rule> ret = new ArrayList<Rule>();
		if(column!=null && column.getNotNull()){
			ret.add(new CheckEmpty());
		}
		return ret;
	}
	
	protected Column column;
	
}
