package com.hcy.ssm.jsControl;

import java.util.List;

import com.hcy.ssm.jsControl.rule.CheckMaxLength;
import com.hcy.ssm.jsControl.rule.Rule;

public class SFInput extends JsControl{

	@Override
	protected List<Rule> getRules() {
		
		List<Rule> ret= super.getRules();
		ret.add(new CheckMaxLength(this.column.getLength()));
		return ret;
	}

}
