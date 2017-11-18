package hcy.util.kit.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import hcy.util.kit.http.HttpReq;

public class MyJob implements Job{

	public void execute(JobExecutionContext context) throws JobExecutionException {
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String date = format.format(new Date());
//		System.out.println(date);
		
		String url = "http://www.xicidaili.com/nn/1";
		String html = new HttpReq(url).execute();
		System.out.println(html);
	}


}
