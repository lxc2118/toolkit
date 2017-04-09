package com.hcy.ssm.codeCreater;

import java.util.ArrayList;
import java.util.List;

import org.apache.velocity.VelocityContext;

import com.hcy.ssm.codeCreater.base.TableCode;
import com.hcy.ssm.context.Context;
import com.hcy.ssm.pojo.Table;
import com.hcy.ssm.util.NameUtil;

public class JavaCode extends TableCode {

	private String pkgName;
	private List<String> imps;

	public List<String> getImps() {
		return imps;
	}

	public void setImps(List<String> imps) {
		this.imps = imps;
	}

	public void addImp(String imp) {
		if (imps == null)
			imps = new ArrayList<String>();
		if (imp != null)
			imps.add(imp);
	}

	public String getPkgName() {
		return pkgName;
	}

	public void setPkgName(String pkgName) {
		this.pkgName = pkgName;
	}

	@Override
	protected String buildPath(Table table) {

		StringBuffer sb = new StringBuffer();
		sb.append("src/main/java/");
		sb.append(getFullPkgPath(table));
		sb.append("/");
		sb.append(this.getFullFileName(table));
		return sb.toString();
	}

	protected String getFullPkg(Table table) {
		StringBuffer sb = new StringBuffer();
		sb.append(Context.getPkgName());
		sb.append(".tgoms.pojo.");
		sb.append(NameUtil.get().pasical(table.getName()));
		// sb.append(".pojo");
		// sb.append(pkgName);
		return sb.toString();
	}

	public String getFullPkgPath(Table table) {
		String ret = this.getFullPkg(table);
		while (ret.indexOf(".") != -1)
			ret = ret.replace(".", "/");
		return ret;
	}

	@Override
	protected String getTableNameHolder(Table table) {
		return NameUtil.get().firstUpperPasical(super.getTableNameHolder(table));
	}

	@Override
	public String getFullFileName(Table table) {
		String ret = super.getFullFileName(table);
		if (!ret.endsWith(".java"))
			ret = ret + ".java";
		return ret;
	}

	@Override
	protected VelocityContext buildTableContext(Table table) {
		VelocityContext ret = super.buildTableContext(table);
		ret.put("pkg", this.getFullPkg(table));
		ret.put("basePkg", Context.getPkgName());
		return ret;
	}

}
