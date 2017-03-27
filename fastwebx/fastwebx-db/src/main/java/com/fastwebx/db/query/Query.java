package com.fastwebx.db.query;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import com.fastwebx.common.dao.inf.IQuery;
import com.fastwebx.db.condition.Condition;
import com.fastwebx.db.condition.InTableCdt;
import com.fastwebx.db.condition.tableJoin.TableJoin;
import com.fastwebx.db.condition.util.CdtUtil;



public class Query implements Serializable,IQuery{

	public Query(){
		
	}
	
	public Query(String col,Object value){
		this.eq(col, value);
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public List<Condition> getList() {
		if(!onlyOneTable)
			return list;
		List<Condition> ret = new ArrayList<Condition>();
		if(list!=null){
			for(Condition c:list){
				if(c.getSimple())
					ret.add(c);
			}
		}
		return ret;
	}
	public String getOrderCol() {
		if(orderBy==null || orderBy.equals("")) return null;
		StringBuffer sb = new StringBuffer();
		sb.append(this.orderBy);
		if(desc)
			sb.append(" desc");
		return sb.toString();
	}
	
	
	public int getRp() {
		return rp;
	}
	public void setRp(int rp) {
		this.rp = rp;
	}
	public int getFirstResult() {
		return firstResult;
	}
	public void setFirstResult(int first) {
		this.firstResult = first;
	}
	public String getColumns() {
		return columns;
	}
	public void setColumns(String columns) {
		this.columns = columns;
	}
	public void add(Condition cdt){
		if(cdt!=null)
			cdt.process(this);
	}
	public void add2List(Condition cdt){
		list.add(cdt);
	}
	public void addAll(java.util.Collection<Condition> conditions){
		for(Condition c:conditions){
			add(c);
		}
	}
	public void addTable(TableJoin table){
		tables.add(table);
	}
	
	
	public Query eq(String column,Object value){
		this.add(CdtUtil.eq(column, value));
		return this;		
	}
	
	
	public Query  big(String column,Object value ){
		this.add(CdtUtil.big(column, value));
		return this;
	}
	
	public Query  less(String column,Object value ){
		this.add(CdtUtil.less(column,value));
		return this;
	}
	
	public Query  bigAndEqual(String column,Object value ){
		this.add(CdtUtil.bigAndEqual(column,value));
		return this;
	}
	
	public Query  lessAndEqual(String column,Object value ){
		this.add(CdtUtil.lessAndEqual(column,value));
		return this;
	}
	
	public Query  like(String column,Object value ){
		this.add(CdtUtil.like(column,value));
		return this;
	}
	
	
	public Query  in(String column,Object[] value ){
		this.add(CdtUtil.in(column,value));
		return this;
	}
	
	public Query  in(String column,List value ){
		this.add(CdtUtil.in(column,value));
		
		return this;
	}
	
	public Query in(String column,List objs,String proName){
		this.add(CdtUtil.in(column, objs, proName));
		return this;
	}
	
	public Query  notIn(String column,Object[] value ){
		this.add(CdtUtil.notIn(column,value));
		return this;
	}
	
	public Query  notIn(String column,List value ){
		this.add(CdtUtil.notIn(column,value));
		return this;
	}
	public Query noEq(String column,Object value){
		this.add(CdtUtil.noEq(column,value));
		return this;
	}
	
	public InTableCdt inTable(String tableName){
		InTableCdt ret =CdtUtil.inTable(tableName);
		this.add(ret);
		return ret;
	}
	public Query sql(String sql){
		if(sql!=null)
			this.add(CdtUtil.sql(sql));
		return this;
	}
	
	public Query isNull(String col,boolean bnull){
		this.add(CdtUtil.isNull(col,bnull));
		return this;
	}
	public Query isNull(String col){
		this.add(CdtUtil.isNull(col));
		return this;
	}
	
	public Query isEmpty(String col){
		StringBuffer sb = new StringBuffer();
		sb.append("(")
			.append(col)
			.append(" is null")
			.append(" or ")
			.append(col)
			.append(" = '')");
		this.sql(sb.toString());
		return this;
	}
	public Query notEmpty(String col){
		StringBuffer sb = new StringBuffer();
		sb.append("(")
			.append(col)
			.append(" is not null")
			.append(" and ")
			.append(col)
			.append(" <> '')");
		this.sql(sb.toString());
		return this;
	}
	
	public Query notNull(String col){
		return isNull(col,false);
	}
	
	public Query orderBy(String col){
		this.orderBy = col;
		return this;
	}
	
	public Query desc(boolean val){
		desc = val;
		return this;
	}
	
	public Query desc(String col){
		this.orderBy(col);
		this.desc();
		return this;
	}
	
	public Query asc(){
		desc = false;
		return this;
	}
	
	public Query desc(){
		desc = true;
		return this;
		
	}
	
	public List<TableJoin> getTables() {
		List<TableJoin> ret = new ArrayList<TableJoin>();
		if(!onlyOneTable)
			ret.addAll(tables);
		return ret;
	}

	public Query oneTable(){
		onlyOneTable = true;
		return this;
	}
	
	private boolean onlyOneTable = false;
	private String orderBy;
	private boolean desc;
	private int rp;
	private int firstResult;
	private String columns;
	private List<Condition> list = new ArrayList<Condition>();
	private HashSet<TableJoin> tables = new HashSet<TableJoin>();
	
}
