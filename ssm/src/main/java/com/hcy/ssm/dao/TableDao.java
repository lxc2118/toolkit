package com.hcy.ssm.dao;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hcy.ssm.context.Context;
import com.hcy.ssm.pojo.Table;

@Repository
public class TableDao {
	private static List<Table> tables;

	public List<Table> getTables() {
		if (tables == null) {
			Connection conn = Context.getConn();
			List<Table> ret = new ArrayList<Table>();
			try {
				DatabaseMetaData dm = conn.getMetaData();
				ResultSet rs = dm.getTables(null, null, "%", new String[] { "table" });

				while (rs.next()) {
					ret.add(new Table(rs.getString(3)));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			tables = ret;
		}
		return tables;
	}

	public Table get(String name) {
		if (name == null)
			return null;
		for (Table table : this.getTables()) {
			if (name.equalsIgnoreCase(table.getName()))
				return table;
		}
		return null;
	}
}
