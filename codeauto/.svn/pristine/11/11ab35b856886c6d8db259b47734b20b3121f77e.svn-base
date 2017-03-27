package com.fastwebx.codeAuto;

import java.io.StringWriter;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.ResourceNotFoundException;

public class VelocityTest {
	public static void main(String[] args){
		Properties p = new Properties(); 
		p.setProperty(Velocity.INPUT_ENCODING, "UTF-8");  
         
		p.setProperty("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
		Velocity.init(p);

		VelocityContext context = new VelocityContext();

		context.put( "name", new String("ddddddddddd") );
		context.put( "obj", new TestObj() );
		Template template = null;

		try
		{
		   template = Velocity.getTemplate("templet/mytemplate.vm");
		   
		}
		catch( Exception e ){
			e.printStackTrace();
		}

		StringWriter sw = new StringWriter();

		template.merge( context, sw );
		System.out.println(sw.toString());
	}
}
