package com.hcy.ssm.codeCreater.base;

import java.io.StringWriter;
import java.util.Properties;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;

import com.hcy.ssm.common.S;
import com.hcy.ssm.dao.TableDao;
import com.hcy.ssm.pojo.Table;
import com.hcy.ssm.util.FileUtil;
import com.hcy.ssm.util.NameUtil;

public abstract class TableCode extends CodeCreater {
	
	protected static Properties props;
	protected static VelocityEngine engine;
	{
		props = new Properties();
		props.setProperty(Velocity.INPUT_ENCODING, "UTF-8");
		engine = new VelocityEngine(props);
	}
	private String fileName;

	abstract protected String buildPath(Table table);

	@Override
	public void process() {
		for (Table table : S.get(TableDao.class).getTables()) {
			processTable(table);
		}
	}

	protected void processTable(Table table) {
		FileUtil.write(buildPath(table), buildContent(table));
	}

	protected String buildContent(Table table) {
		StringWriter sw = new StringWriter();
		this.getTemplate().merge(this.buildTableContext(table), sw);
		return sw.toString();
	}

	protected VelocityContext buildTableContext(Table table) {
		VelocityContext context = new VelocityContext();
		context.put("nameUtil", NameUtil.get());
		context.put("table", table);
		return context;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFullFileName(Table table) {
		VelocityContext context = new VelocityContext();
		context.put("table", getTableNameHolder(table));
		StringWriter writer = new StringWriter();
		engine.evaluate(context, writer, "", fileName);
		return writer.toString();
	}

	protected String getTableNameHolder(Table table) {
		return table.getName();
	}

}
