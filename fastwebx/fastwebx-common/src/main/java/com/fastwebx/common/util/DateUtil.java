package com.fastwebx.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	public static final long hourMill = 3600l * 1000l;
	public static final long dayMill = 86400l * 1000l;
	public static long monthMill = 30l*3600l*24l*1000l;
	
	public static final String fullTimeFmt = "yyyy-MM-dd HH:mm:ss";
	/**
	 * 返回星期几
	 * @param date
	 * @return
	 */
	public static int getWeek(Date date){
		Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int ret = cal.get(Calendar.DAY_OF_WEEK) ;
        return ret-1;
	}
	
	/**
	 * 返回星期几
	 * @param date
	 * @return
	 */
	public static int getChinaWeek(Date date){
		int week = getWeek(date);
		if(week==0)
			week = 7;
		return week;
	}
	
	public static Date getMonday(){
		Date date = getToday();
		int week = getChinaWeek(date)-1;
		if(week>0)
			date.setTime(date.getTime()-week*DateUtil.dayMill);
		return date;
	}
	
	public static boolean isSameWeek(Date d1,Date d2){
		return getMonday(d1).equals(getMonday(d2));
	}
	
	public static Date getMonday(Date date){
		date = DateUtil.onlyDay(date);
		int week = getChinaWeek(date)-1;
		if(week>0)
			date.setTime(date.getTime()-week*DateUtil.dayMill);
		return date;
	}
	/**
	 * 返回星期几
	 * @param date
	 * @return
	 */
	public static int getWeek(){
		return getWeek(new Date());
	}

	private static SimpleDateFormat createFormat(String str) {
		SimpleDateFormat sdf = new SimpleDateFormat(str);
		return sdf;
	}

	private static SimpleDateFormat createFormat() {
		return createFormat("yyyy-MM-dd");
	}

	/**
	 * 判断时间是否过去<br>
	 * 如果为null 返回true
	 * 
	 * @param date
	 * @return
	 */
	public static boolean isPast(Date date) {
		if (date == null)
			return true;
		return System.currentTimeMillis() > date.getTime();
	}

	/**
	 * 判断日期是否是当天日期
	 * 
	 * @param date
	 * @return
	 */
	public static boolean isToday(Date date) {
		if (date == null)
			return false;
		return isSameDay(new Date(), date);
	}

	/**
	 * 仅仅取date的日期部分，略掉时间部分
	 * 
	 * @param date
	 * @return
	 */
	public static Date onlyDay(Date date) {
		if (date == null)
			return null;
		return parse(format(date));
	}

	/**
	 * 字符串转成日期
	 * 
	 * @param day
	 * @return
	 */
	public static Date parse(String day) {
		try {
			return createFormat().parse(day);
		} catch (ParseException e) {
			return null;
		}
	}

	/**
	 * 字符串转成日期
	 * 
	 * @param day
	 * @return
	 */
	public static Date parse(String day, String fmt) {
		if(day==null || fmt==null) return null;
		try {
			
			return createFormat(fmt).parse(day);
		} catch (ParseException e) {
			return null;
		}
	}

	/**
	 * 日期转成字符串
	 * 
	 * @param date
	 * @return
	 */
	public static String format(Date date, String fmt) {
		return createFormat(fmt).format(date);
	}

	/**
	 * 日期转成字符串
	 * 
	 * @param date
	 * @return
	 */
	public static String format(Date date) {
		return createFormat().format(date);
	}

	/**
	 * 是否同一天
	 * 
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static boolean isSameDay(Date d1, Date d2) {
		if (d1 == null || d2 == null)
			return false;
		SimpleDateFormat sdf = createFormat();
		return sdf.format(d1).equals(sdf.format(d2));
	}

	/**
	 * 如果同一天，返回cnt，否则，返回notCnt
	 * 
	 * @param date
	 * @param cnt
	 * @param notCnt
	 * @return
	 */
	public static int isTodayCnt(Date date, int cnt, int notCnt) {
		if (isToday(date)) {
			return cnt;
		}
		return notCnt;
	}

	/**
	 * 如果同一天，返回cnt，否则，返回notCnt
	 * 
	 * @param date
	 * @param cnt
	 * @param notCnt
	 * @return
	 */
	public static int isTodayCnt(Date date, int cnt) {
		return isTodayCnt(date, cnt, 0);
	}

	/**
	 * 如果同一天，则返回cnt ，否则返回0
	 * 
	 * @param cnt
	 * @param date
	 * @return
	 */
	@Deprecated
	public static int getDayCnt(int cnt, Date date) {
		Date now = new Date();
		if (DateUtil.isSameDay(now, date))
			return cnt;
		return 0;
	}

	/**
	 * 得到 毫秒数后的时间
	 * 
	 * @param time
	 * @return
	 */
	public static Date afterTime(long time) {
		Date d = new Date(System.currentTimeMillis() + time);
		return d;
	}

	public static boolean before(Date d1, Date d2) {
		if (d1 == null || d2 == null)
			return false;
		return d1.getTime() < d2.getTime();
	}

	public static boolean after(Date d1, Date d2) {
		if (d1 == null || d2 == null)
			return false;
		return d1.getTime() > d2.getTime();
	}

	/**
	 * 计算小时差
	 * 
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static long calHour(Date d1, Date d2) {
		if (d1 == null || d2 == null)
			return 0;
		long time = d2.getTime() - d1.getTime();
		long hour = time / hourMill;
		if (hour * hourMill < time) {
			hour++;
		}
		return hour;
	}

	/**
	 * 计算小时差
	 * 
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static long calHour(Date d) {
		return calHour(new Date(), d);
	}

	/**
	 * 返回小时
	 * 
	 * @param d
	 * @return
	 */
	public static long getTime(Date d) {
		if (d == null)
			return 0;
		return d.getTime();
	}

	/**
	 * 计算时间差(天)
	 * 
	 * @param d
	 * @return
	 */
	public static Integer getIntervalDay(Date d) {
		if (d == null)
			return 0;
		Long diff = new Date().getTime() - d.getTime();
		Long diffDay = diff / (dayMill) * -1;
		return diffDay.intValue() * -1;
	}

	/**
	 * 计算时间差
	 * 
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static Integer getIntervalDay(Date d1, Date d2) {
		if (d1 == null || d2 == null)
			return null;
		return (int) ((d2.getTime() - d1.getTime()) / dayMill);
	}

	/**
	 * 计算日期(往前或往后 ) eg : calcDay(-1) 取昨天的日期 eg : calcDay(1) 取明天的日期
	 * 
	 * @param day
	 * @return
	 */
	public static Date calcDay(Integer day) {
		Date d = new Date();
		Long dt = d.getTime() + day.longValue() * 86400L * 1000L;
		d.setTime(dt);
		return DateUtil.onlyDay(d);
	}

	/**
	 * 返回今天
	 * 
	 * @return
	 */
	public static Date today() {
		return onlyDay(new Date());
	}

	/**
	 * 计算时间差（和当前时间计算）
	 * 
	 * @param d
	 * @return
	 */
	public static Long diffMill(Date d) {
		if (d == null)
			return null;
		Date nowDate = new Date();
		Long diffMill = nowDate.getTime() - d.getTime();
		return diffMill;
	}

	/**
	 * 判断一个日期是否在2个日期之间
	 * 
	 * @param date
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static boolean inDate(Date date, Date startDate, Date endDate) {
		boolean isBefore = true;
		boolean isAfter = true;
		if (startDate != null)
			isBefore = startDate.before(date);
		if (endDate != null)
			isAfter = endDate.after(date);
		return isBefore && isAfter;
	}
	/**
	 * 返回今天
	 * @return
	 */
	public static Date getToday() {
		Date date = new Date();
		return parse(format(date));
	}
	/**
	 * 返回昨天
	 * @return
	 */
	public static Date getYestoday() {
		Date d = getToday();
		return new Date(d.getTime()-dayMill);
	}

	/**
	 * 几天以前
	 * @return
	 */
	public static Date beforeDay(int n){
		Date d = getToday();
		return new Date(d.getTime()-n*dayMill);
	}
	
	/**
	 * 几天以前
	 * @return
	 */
	public static Date afterDay(int n){
		Date d = getToday();
		return new Date(d.getTime()+n*dayMill);
	}
	
	
}
