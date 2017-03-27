package com.fastwebx.codeAuto.jsControl;

import java.util.List;

import com.fastwebx.codeAuto.jsControl.rule.CheckMaxLength;
import com.fastwebx.codeAuto.jsControl.rule.Rule;

public class SFInput extends JsControl{

	@Override
	protected List<Rule> getRules() {
		
		List<Rule> ret= super.getRules();
		ret.add(new CheckMaxLength(this.column.getLength()));
		return ret;
	}

}
