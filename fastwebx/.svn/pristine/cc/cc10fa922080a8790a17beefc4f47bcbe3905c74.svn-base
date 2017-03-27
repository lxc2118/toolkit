package com.fastwebx.db.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.dao.DuplicateKeyException;










import com.fastwebx.common.context.$;
import com.fastwebx.common.context.S;
import com.fastwebx.common.context.SpringContext;
import com.fastwebx.common.dao.ICrud;
import com.fastwebx.common.dao.ISimpleCrud;
import com.fastwebx.common.dao.inf.IModifier;
import com.fastwebx.common.dao.inf.IPk;
import com.fastwebx.common.dao.inf.IQuery;
import com.fastwebx.common.dao.inf.ISave;
import com.fastwebx.common.dao.inf.cache.IClearCache;
import com.fastwebx.common.dao.inf.cache.IClearPojo;
import com.fastwebx.common.inf.pojo.IHasTime;
import com.fastwebx.common.reflect.hunter.SuperClassHunter;
import com.fastwebx.db.query.Query;
import com.fastwebx.db.rowHandle.RowHandler;

@SuppressWarnings("deprecation")
public abstract class BaseDao<Pojo> implements ICrud<Pojo>, ISave<Pojo> {

	protected volatile SqlSessionTemplate sqlSession;
	
	protected Collection<IModifier> listeners;

	public void clearCache() {
		clearCache(this.findAll());
	}

	public void clearCache(Collection<Pojo> pojos) {
		if (pojos == null)
			return;
		Collection listeners = this.getListeners();
		for (Object listner : listeners) {
			if (listner instanceof IClearPojo) {
				for (Pojo pojo : pojos) {
					((IClearPojo) listner).removeFormCache(pojo);
				}
			}
			if (listner instanceof IClearCache) {
				((IClearCache) listner).clearCache();
			}
		}

	}

	/**
	 * 返回从cache中查询的dao，仅仅做get查询
	 * 
	 * @return
	 */
	protected ISimpleCrud<Pojo> getCacheDao() {
		return null;
	}

	protected Collection<IModifier> getListeners() {
		return listeners;
	}

	/**
	 * 根据pojo读取一个实例，如果不存在，则增加一条记录
	 * 
	 * @param pojo
	 * @return
	 */
	public Pojo getOrAdd(Pojo pojo) {
		Pojo ret = this.getByIPk((IPk) pojo);
		if (ret == null) {
			ret = pojo;
			try{
				this.doAdd(pojo);
			}catch(DuplicateKeyException e){
				e.printStackTrace();
				ret = this.getByIPk((IPk) pojo);
			}
		}
		return ret;
	}

	public void setListeners(Collection<IModifier> listeners) {
		this.listeners = listeners;
	}

	@Override
	public Pojo getByIPk(IPk ipk) {
		return get(ipk.acqPk());
	}

	public Collection<Pojo> getByIds(Object... pks) {
		List<Pojo> ret = new ArrayList<Pojo>();
		if (pks != null) {
			HashSet<Object> set = new HashSet<Object>();
			for (Object obj : pks)
				set.add(obj);
			for (Object pk : set)
				ret.add(get(pk));
		}
		return ret;

	}

	@Override
	public Pojo get(Object pk) {
		if (pk == null)
			return null;
		ISimpleCrud<Pojo> cacheDao = getCacheDao();
		if (cacheDao == null)
			return doGet(pk);
		Pojo ret = cacheDao.get(pk);
		if (ret == null) {
			ret = doGet(pk);
			if (ret != null) {
				cacheDao.add(ret);
			}
		}
		return ret;
	}

	protected Pojo doGet(Object pk) {
		/*
		return (Pojo) this.getSqlSession().queryForObject(
				this.getStatementName("get"), pk);*/
		
		return this.acqSqlSession().selectOne(this.getStatementName("get"), pk);
	}

	protected SqlSessionTemplate acqSqlSession() {
	
		if (sqlSession == null) {
			sqlSession = S.get(SqlSessionTemplate.class);
		}
		
		return sqlSession;
	}

	

	public List<Pojo> findAll() {
		return find(new Query());
	}

	@Override
	public List<Pojo> find(IQuery query) {
		return doFind(query);
	}
	
	public <Value> List<Value> findValue(IQuery query,Function<Pojo,Value> fun) {
		List list = new ArrayList();
		this.find(query)
			.forEach((pojo)->{
				if(fun==null) list.add(pojo);
				Object obj = fun.apply(pojo);
				if(obj!=null)
					list.add(obj);
			});
		return list;
	}

	protected List<Pojo> doFind(IQuery query) {
		return this.acqSqlSession().selectList (this.getStatementName("find"),
				query);
	}

	public List<Pojo> find(String colName, Object value) {
		Query query = new Query();
		query.eq(colName, value);
		return find(query);
	}

	public Pojo findOne(Query query) {
		query.setRp(1);
		List<Pojo> list = this.find(query);
	
		if (list != null && list.size() > 0)
			return list.get(0);
		return null;
	}

	public Pojo findOne(String colName, Object obj) {
		Query query = new Query();
		query.eq(colName, obj);
		return findOne(query);
	}

	@Override
	public int findCnt(IQuery query) {
		return (Integer) acqSqlSession().selectOne (
				this.getStatementName("findCnt"), query);
	}

	@Override
	public void add(Pojo pojo) {
		doAdd(pojo);
		Collection<IModifier> ls = this.getListeners();
		if (ls != null) {
			for (IModifier l : ls) {
				l.add(pojo);
			}
		}
	}

	protected void doAdd(Pojo pojo) {
		acqSqlSession().insert(this.getStatementName("insert"), pojo);
	}

	@Override
	public int update(Pojo pojo) {
		int ret = doUpdate(pojo);
		if (ret > 0) {
			Collection<IModifier> ls = this.getListeners();
			if (ls != null) {
				for (IModifier l : ls) {
					l.update(pojo);
				}
			}
		}
		return ret;
	}

	protected int doUpdate(Pojo pojo) {
		return acqSqlSession().update(this.getStatementName("update"), pojo);
	}

	@Override
	public int del(Pojo pojo) {
		int ret = doDel(pojo);
		if (ret > 0) {
			Collection<IModifier> ls = this.getListeners();
			if (ls != null) {
				for (IModifier l : ls) {
					l.del(pojo);
				}
			}
		}
		return ret;
	}

	protected int doDel(Pojo pojo) {
		return acqSqlSession().delete(this.getStatementName("delete"), pojo);
	}

	public void delAll(Collection<Pojo> pojos) {
		if (pojos != null) {
			for (Pojo pojo : pojos)
				del(pojo);
		}
	}

	protected String getStatementName(String name) {
		StringBuffer sb = new StringBuffer();
		if (classT != null) {
			sb.append(classT.getName()).append('.');
		}
		sb.append(name);
		return sb.toString();
	}

	public BaseDao() {
		this.initClass();
	}

	protected void initClass() {
		if (needGetClass)
			this.classT = SuperClassHunter.get().acqClass(this);
	}

	public Class getClassT() {
		return classT;
	}

	public void setClassT(Class classT) {
		this.classT = classT;
	}

	public BaseDao(Class t) {

		this.classT = t;
	}

	public void queryForHandle(Query query, ResultHandler resultHandler) {
		/*this.getSqlSession().queryWithRowHandler(this.getStatementName("find"),
				query, rowHandler);*/
		this.acqSqlSession().select(this.getStatementName("find"), query, resultHandler);
	}
	
	public void handleAll( ResultHandler resultHandler) {
		Query query = new Query();
		this.acqSqlSession().select(this.getStatementName("find"),
				query, resultHandler);
	}
	
	public void handle(Consumer<Pojo> consumer) {
		
		Query query = new Query();
		this.handle(query,consumer);
	}

	public void handle(Query query,final Consumer<Pojo> consumer) {
		if(consumer==null || query ==null) return;
		ResultHandler rh = new ResultHandler(){

			@Override
			public void handleResult(ResultContext rc) {
				consumer.accept((Pojo)rc.getResultObject());
				
			}
			
		};
		this.acqSqlSession().select(this.getStatementName("find"),
				query
				,rh 
		);
	}

	public Pojo saveOrUpdate(Pojo pojo) {
		if (pojo == null)
			return null;
		int cnt = update(pojo);
		if (cnt == 0)
			add(pojo);
		return pojo;
	}

	public void delByQuery(Query query) {
		if (query == null)
			return;
		
		this.queryForHandle(query, new RowHandler() {

			@Override
			public void handleRow(Object arg0) {
				
					del((Pojo)arg0);
				
				
			}
			
		});
	}

	public String getClassName() {
		if (classT != null)
			return classT.getSimpleName();
		return null;
	}

	public String getClassNameWithSuffix(String suffix) {
		String className = this.getClassName();
		if (className == null || suffix == null)
			return null;
		StringBuilder sb = new StringBuilder();
		sb.append(className).append(suffix);
		return sb.toString();
	}

	@Override
	public Pojo save(Pojo pojo) {
		Object pk = null;
		if (pojo instanceof IPk) {
			pk = ((IPk) pojo).acqPk();
			if (pk == null) {
				this.add(pojo);
				return pojo;
			}
		}
		int cnt = this.update(pojo);
		if (cnt == 0) {
			this.add(pojo);
		}
		return pojo;
	}

	public boolean isExist(Query query) {
		if (query == null)
			return false;
		Integer rp = query.getRp();
		query.setRp(1);
		boolean ret = findOne(query) != null;
		query.setRp(rp);
		return ret;
	}

	public Map findMap(Query query){
		
		return this.acqSqlSession().selectOne(this.getStatementName("findMap"),
				query);
	}
	
	public Integer findMapCnt(Query query){
		Map map = this.findMap(query);
		if(map==null) return 0;
		Number val = (Number)map.values().iterator().next();
		return val.intValue();
	}
	
	protected boolean needGetClass = true;
	protected Class classT;
	
}
