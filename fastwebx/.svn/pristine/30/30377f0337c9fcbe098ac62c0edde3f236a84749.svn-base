package com.fastwebx.upload;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class SFUploadCtrl extends SaveFileCtrl {
	@Override
	protected void fail(Exception e, HttpServletRequest request,
			HttpServletResponse response) {
		try {
			String objId = request.getParameter("objectId");
			if(objId==null)
				objId = request.getParameter("objectID");	//兼容不同版本的SFUPLoad
			PrintWriter out = response.getWriter();
			out.println("<script type='text/javascript'>");
			out.println("alert('"+e.getMessage()+"');");
			out.println("</script>");
			out.close(); 
		} catch (Exception ex) {
			e.printStackTrace();
		}
		
	}

	@Override
	protected void succ(String url,
			HttpServletRequest request ,
			HttpServletResponse response) {
		
		
		try {
			String objId = request.getParameter("objectId");
			if(objId==null)
				objId = request.getParameter("objectID");	//兼容不同版本的SFUPLoad
			PrintWriter out = response.getWriter();
			out.println("<script type='text/javascript'>");
			out.println("var parentObj = parent.SFControlContext.map['"+objId+"'];"); 
			out.println("if(parentObj){");
			out.println("alert('上传成功');");
			out.println("parentObj.setValue('"+url+"');");
			out.println("if (parentObj.success) ");
			out.println("parentObj.success.call(parentObj);");
			out.println("}");
			out.println("</script>");
			out.close(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
