package com.fastwebx.web.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.Map;
import java.util.Set;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import com.fastwebx.common.exp.imp.FastExp;
import com.fastwebx.common.util.InputStreamUtil;

/**
 * httpUtil
 * @author mj
 */
public class HttpUtil {

	public static String upload(String strUrl
			
			,String key
			,File f
			,Map<String,String> map){
		int blockSize = 1024;
		URL url = null;
		OutputStream os;
		try {
			url = new URL(strUrl);
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setDoOutput(true);  
			conn.setDoInput(true);  
			conn.setRequestMethod("POST");  
			String BOUNDARY = "---------------------------41184676334";  
			 
			conn.setRequestProperty("connection", "Keep-Alive");  
			conn.setRequestProperty("Charsert", "UTF-8");  
			conn.setRequestProperty("Content-Type",  
			                    "multipart/form-data; boundary=" + BOUNDARY);  
			
			              
			conn.setAllowUserInteraction(false);    //无需用户交互，即弹出https等的对话框。  
			conn.setChunkedStreamingMode(blockSize);   //告诉HttpUrlConnection,我们需要采用流方式上传数据，无需本地缓存数据。HttpUrlConnection默认是将所有数据读到本地缓存，然后再发送给服务器，这样上传大文件时就会导致内存溢出。  
			  
			byte[] end_data = ("\r\n--" + BOUNDARY + "--\r\n").getBytes();  
			StringBuffer sb = new StringBuffer();  
			
			
			if(map!=null){
				for(String mapKey:map.keySet()){
					sb.append("\r\n--").append(BOUNDARY).append("\r\n");
					sb.append("Content-Disposition: form-data; name=\""+mapKey+"\"\r\n\r\n");  
					sb.append(map.get(mapKey));  
					
				}
			}
			
			sb.append("--").append(BOUNDARY).append("\r\n");  
			
			
			sb.append("Content-Disposition: form-data; name=\""+key+"\"; filename=\""+f.getName()+"\"\r\n");  
			sb.append("Content-Type: application/octet-stream\r\n\r\n");  
			  
			byte[] data = sb.toString().getBytes();  
			long fLen = f.length();  
			long contentLen = data.length + fLen + end_data.length;  

			conn.setRequestProperty("Content-Length",  
					String.valueOf(contentLen));


			os = conn.getOutputStream();
			os.write(data);  //发送非文件数据  
            
			FileInputStream fis = new FileInputStream(f);  //读取文件内容，发送数据，数据要一点点发送，不能一下全部读取发送，否则会内存溢出。  
			int rn;  
			byte[] buf = new byte[blockSize];    
			while ((rn = fis.read(buf, 0, blockSize)) > 0) {  
			    os.write(buf, 0, rn);  
			}  
			os.write(end_data);  
			os.flush();  
			os.close();  
			fis.close();
			conn.connect();
			InputStream is = conn.getInputStream();
	        String result = InputStreamUtil.stream2String( is );
	       
  
	        return result;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		



	}

	public static String post(String strUrl,Map<String, String> map) {
		URL url = null;;
		try {
			url = new URL( strUrl );
		
			if(url==null) return null;
	        HttpURLConnection conn = null;
		
			conn = (HttpURLConnection) url.openConnection();
		
		
			conn.setReadTimeout(5000);
	        conn.setConnectTimeout(5000);
	        
			conn.setRequestMethod("POST");
			 
	        conn.setDoInput(true);
	        conn.setDoOutput(true);
	        if(map!=null){
		        OutputStream os = conn.getOutputStream();
	        
		        BufferedWriter writer = new BufferedWriter( new OutputStreamWriter(os, "UTF-8") );
	        
		        writer.write(toParam(map) );
		        writer.flush();
		        writer.close();
		        os.close();
	        }
	        conn.connect();
		
	        InputStream is = conn.getInputStream();
	        String result = InputStreamUtil.stream2String( is );
	        return result;
		} catch (Exception e) {
			e.printStackTrace();
			throw new FastExp(e);
		}
		
       
	}
	/**
	 * 将map转化成string
	 * @param map
	 * @return
	 */
	private static String toParam(Map<String, String> map) {
		StringBuffer sb = new StringBuffer();
		boolean first = true;
		if(map!=null){
			Set<String> keys = map.keySet();
			for(String key:keys){
				if(!first)
					sb.append("&");
				else
					first=false;
				try {
					sb.append(key)
						.append("=")
						.append(URLEncoder.encode(map.get(key),"utf-8"));
				} catch (UnsupportedEncodingException e) {
				
					e.printStackTrace();
				}
			}
		}
		return sb.toString();
	}
}
