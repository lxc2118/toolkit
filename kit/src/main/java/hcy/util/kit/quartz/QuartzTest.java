package hcy.util.kit.quartz;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import hcy.util.kit.quartz.job.MyJob;

public class QuartzTest {

	public static void main(String[] args) {

		SchedulerFactory schedulerfactory = new StdSchedulerFactory();
		Scheduler scheduler = null;
		try {
			scheduler = schedulerfactory.getScheduler();

			JobDetail job = JobBuilder.newJob(MyJob.class).withIdentity("job1", "jgroup1").build();

			// Trigger
			// trigger=TriggerBuilder.newTrigger().withIdentity("simpleTrigger",
			// "triggerGroup")
			// .withSchedule(SimpleScheduleBuilder.repeatSecondlyForever(1).withRepeatCount(8))
			// .startNow().build();
			Trigger trigger = TriggerBuilder.newTrigger().withIdentity("simpleTrigger", "triggerGroup")
					.withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ?")).startNow().build();
			scheduler.scheduleJob(job, trigger);

			scheduler.start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
