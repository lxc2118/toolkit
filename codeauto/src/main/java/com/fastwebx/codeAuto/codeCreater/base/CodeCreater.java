package com.fastwebx.codeAuto.codeCreater.base;

import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import com.fastwebx.codeAuto.util.NameUtil;

public abstract class CodeCreater {
	
	static {
		Properties p = new Properties();
		p.setProperty(Velocity.INPUT_ENCODING, "UTF-8");
		p.setProperty(Velocity.OUTPUT_ENCODING, "UTF-8");
		p.setProperty("file.resource.loader.class",
				"org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
		Velocity.init(p);
	}
	
	private String templetPath;
	
	private Template template;

	public String getTempletPath() {
		if (templetPath == null)
			return "templet/" + this.getClass().getSimpleName() + ".vm";
		return templetPath;
	}

	public void setTempletPath(String templetPath) {
		this.templetPath = templetPath;
	}

	protected Template getTemplate() {
		if (this.template == null) {
			try {
				template = Velocity.getTemplate(this.getTempletPath());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return template;

	}

	protected VelocityContext getVelocityContext() {
		VelocityContext context = new VelocityContext();
		context.put("nameUtil", NameUtil.get());
		return context;
	}

	abstract public void process();
}
