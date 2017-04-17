package hcy.util.kit.http;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicNameValuePair;

public class HttpUriReqFac {

	public static HttpUriRequest get(HttpReq req) {
		HttpUriRequest httpUriReq = null;
		switch (req.getMethod()) {
		
		case "get":
			httpUriReq = new HttpGet(req.getUrlWithParam());
			httpUriReq.setHeaders(req.getAllHeaders());
			break;
		case "post":
			httpUriReq = new HttpPost(req.getUrl());
			if (req.params != null) {
				List<NameValuePair> paramList = new ArrayList<>();
				for (String key : req.params.keySet())
					paramList.add(new BasicNameValuePair(key, req.params.get(key)));
				try {
					// 构造一个form表单式的实体
					UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(paramList);
					// 将请求实体设置到httpPost对象中
					((HttpPost) httpUriReq).setEntity(formEntity);
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			}
			break;
		}
		return httpUriReq;
	}

}
