package com.fastwebx.codeAuto.pojo;

import java.util.ArrayList;
import java.util.List;

import com.fastwebx.codeAuto.dao.ColumnDao;
import com.fastwebx.common.context.$;

public class Table {
	private String name;
	private List<Column> columns;
	private List<Column> pks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Table(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Table [name=" + name + "]";
	}

	public List<Column> getColumns() {
		if (columns == null) {
			columns = $.get(ColumnDao.class).getByTable(name);
			for (Column col : columns)
				col.setTable(this);
		}
		return columns;
	}

	public List<Column> getPks() {
		if (pks == null) {
			pks = new ArrayList<Column>();
			List<String> pkNames = $.get(ColumnDao.class).getPk(name);
			for (String pkName : pkNames) {
				for (Column column : this.getColumns()) {
					if (pkName.equals(column.getName())) {
						pks.add(column);
					}
				}
			}
		}
		return pks;
	}

	public boolean getAutoIncrease() {
		if (this.getPks().size() != 1)
			return false;
		Column pk = this.getPks().get(0);
		return pk.getAutoIncrease();
	}

	public Column getFirstPk() {
		if (this.getPks().size() < 1)
			return null;
		return this.getPks().get(0);
	}

	public boolean getSinglePk() {
		return this.getPks().size() == 1;
	}

	public boolean getAllPk() {
		return this.getPks().size() == this.getColumns().size();
	}

	public List<Column> getOtherColumns() {
		List<Column> ret = new ArrayList<Column>();
		for (Column column : columns) {
			if (!column.getPk())
				ret.add(column);
		}
		return ret;
	}

	public boolean getHasDate() {
		if (getColumns() == null)
			return false;
		for (Column column : getColumns()) {
			if ("Date".equals(column.getJavaType().getName()))
				return true;
		}
		return false;
	}
}
