package com.fastwebx.codeAuto.codeCreater;

import org.springframework.stereotype.Service;

import com.fastwebx.codeAuto.codeCreater.base.TableCode;
import com.fastwebx.codeAuto.pojo.Table;
import com.fastwebx.codeAuto.util.NameUtil;
@Service
public class JspCode  extends TableCode{

	@Override
	protected String buildPath(Table table) {
		return "src/main/webapp/"
				+NameUtil.get().pasical(table.getName())
				+"/"+NameUtil.get().pasical(table.getName())
				+".jsp";
	}
}
