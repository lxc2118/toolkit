package com.fastwebx.web;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fastwebx.common.dao.inf.IScher;
import com.fastwebx.common.util.StrUtil;
import com.fastwebx.db.condition.schObject.SchParam;
import com.fastwebx.db.query.Query;
import com.fastwebx.web.base.JsonCtrl;
import com.fastwebx.web.json.JsonParserContext;
import com.fastwebx.web.result.SchResult;

public abstract class SchCtrl<Pojo, Param extends SchParam> extends
		JsonCtrl<Param, IScher<Pojo>> {
	protected SchResult<Pojo> doExecute(Param schObject) {

		SchResult<Pojo> result = this.createResult();
		if(schObject.isNeedSch()){
			doSch(schObject, result);
			doOther(schObject, result);
		}else{
			//result.setList(new ArrayList());
			result.setTotal(0);
			result.setPageth(1);
		}
		return result;
	}

	protected SchResult<Pojo> createResult() {
		return new SchResult<Pojo>();
	}

	protected void doSch(Param schObject, SchResult<Pojo> result) {
		Query query = schObject.buildQuery();
		List list = acqDao().find(query);
		if (schObject.isNeedCloth()) {
			buildCloth(result, list, schObject);
		} else {
			
			result.setList(this.toListJson(list) );
		}
		if (schObject.acqPageSize() > 0 && schObject.isNeedCnt()) {
			result.setTotal(acqDao().findCnt(query));
			result.setPageSize(schObject.acqPageSize());
			result.setPageth(schObject.acqPageth());
		}
	}

	protected JSONObject wearCloth(JSONObject json, Pojo pojo,
			Param schObject) {
		return json;
	}

	protected final void buildCloth(SchResult<Pojo> result, List<Pojo> list,
			Param schObject) {
		JSONArray cloths = new JSONArray();
		for (Pojo obj : list) {
			JSONObject json = (JSONObject) toPojoJson(obj);

			cloths.add(wearCloth(json, (Pojo) obj, schObject));
		}
		result.setList(cloths);
	}

	

	protected void doOther(Param schObject, SchResult<Pojo> result) {

	}

	protected HashSet<String> getIgnores(Pojo pojo) {
		return ignores;
	}

	@Override
	protected Param refresh(Param param) {

		return param;
	}

	@Override
	protected JSON toJson(Object obj) {
		SchResult result = (SchResult) obj;
		JSONObject ret = new JSONObject();
		if (result.getPageSize() > 0) {
			ret.put("total", result.getTotal());
			ret.put("pageth", result.getPageth());
			ret.put("pageSize", result.getPageSize());
		}
		if(!StrUtil.isEmpty(result.getGridMsg())){
			ret.put("gridMsg", result.getGridMsg());
		}
		ret.put(listName, result.getList());
		return ret;
	}

	protected JSONArray toListJson(Collection collection){
		if(collection==null) return null;
		JSONArray array = new JSONArray();
		for(Object obj:collection){
			array.add(toPojoJson((Pojo)obj));
		}
		return array;
	}
	
	protected JSON toPojoJson(Pojo pojo){
		return JsonParserContext.get().parse(pojo);
	}
	
	private HashSet<String> ignores;
	
	protected String listName = "list";
}
