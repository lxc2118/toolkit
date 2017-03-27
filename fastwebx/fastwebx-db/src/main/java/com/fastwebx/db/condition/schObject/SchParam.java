package com.fastwebx.db.condition.schObject;

import com.fastwebx.common.util.StrUtil;
import com.fastwebx.db.condition.hunter.CdtHunter;
import com.fastwebx.db.query.Query;


public class SchParam {
	private final static char[] cs = {';','(',')','/','\'','*',','};
	public void setSortorder(String sortorder) {
		this.sortorder = sortorder;
	}
	public void setSortname(String sortname) {
		this.sortname = sortname;
	}
	public void setNeedCloth(boolean needCloth) {
		this.needCloth = needCloth;
	}
	public boolean isNeedCloth() {
		return needCloth;
	}
	public void needCloth(boolean needCloth) {
		this.needCloth = needCloth;
	}
	public void setPageth(int pageth) {
		this.pageth = pageth;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public Query buildQuery(){
		Query ret= new Query();
		ret.addAll(CdtHunter.get().parse(this));
		ret.setFirstResult(calcFirstResult());
		ret.setRp(pageSize);
		if(sortname!=null && !sortname.equals("")){
			if(sortname.length()>20)
				sortname = sortname.substring(0,20);
			for(char c:cs){
				sortname = StrUtil.removeAll(sortname, c);
			}
			
			ret.orderBy(sortname);
		}
		if(sortorder!=null && !sortorder.equals("")){
			if(sortorder.equals("desc"))
				ret.desc();
			else
				ret.asc();
		}
		return ret;
	}
	public int calcFirstResult(){
		return (pageth-1)*pageSize;
	}
	
	public int acqPageth() {
		return pageth;
	}
	public int acqPageSize() {
		return pageSize;
	}
	public void setRp(int rp){
		this.pageSize=rp;
	}
	
	public void setPage(int page){
		this.pageth = page;
	}
	private int pageth = 1;
	private int pageSize = 0;
	protected boolean needCloth = false;
	protected boolean needCnt = true;
	protected String sortname;
	protected String sortorder;
	
	protected boolean needSch = true;
	
	
	public boolean isNeedCnt() {
		return needCnt;
	}
	public void setNeedCnt(boolean needCnt) {
		this.needCnt = needCnt;
	}
	public boolean isNeedSch() {
		return needSch;
	}
	public void setNeedSch(boolean needSch) {
		this.needSch = needSch;
	}
	
}
