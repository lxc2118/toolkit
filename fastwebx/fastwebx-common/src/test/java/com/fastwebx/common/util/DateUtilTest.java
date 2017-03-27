package com.fastwebx.common.util;

import java.util.Date;

import junit.framework.TestCase;

/**
 * @author mj
 */
public class DateUtilTest extends TestCase {
	public void testGetWeek(){
		System.out.println(DateUtil.getWeek());
	}
	
	public void testGetWeek2(){
		Date d = new Date();
		long day = 24*3600*1000;
		for(int i=0;i<7;i++){
			System.out.println(DateUtil.getWeek(d));
			d.setTime(d.getTime()+day);
		}
	}
	
	public void testFmt(){
		System.out.println(DateUtil.format(new Date(), DateUtil.fullTimeFmt));
	}
	
	public void testFmt1(){
		Date d = new Date();
		d.setTime(d.getTime()+3600l*1000l*3);
		System.out.println(DateUtil.format(d, DateUtil.fullTimeFmt));
	}
	
	public void testBeforeDay(){
		Date d = DateUtil.beforeDay(10);
		System.out.println(DateUtil.format(d, DateUtil.fullTimeFmt));
	}
	
	public void testMonday(){
		Date d = DateUtil.getMonday();
		System.out.println(DateUtil.format(d, DateUtil.fullTimeFmt));
	}
	
	public void testSameWeek(){
		assertTrue(DateUtil.isSameWeek(parse("2015-06-18"), parse("2015-06-15")));
		assertTrue(DateUtil.isSameWeek(parse("2015-06-18"), parse("2015-06-21")));
		assertTrue(DateUtil.isSameWeek(parse("2015-06-15"), parse("2015-06-21")));
		assertTrue(DateUtil.isSameWeek(parseLong("2015-06-15 10:20:30"), parse("2015-06-21")));
		assertTrue(DateUtil.isSameWeek(parseLong("2015-06-15 10:20:30"), parseLong("2015-06-21 23:59:59")));
		assertFalse(DateUtil.isSameWeek(parseLong("2015-06-15 10:20:30"), parseLong("2015-06-22 00:00:00")));
		assertFalse(DateUtil.isSameWeek(parseLong("2015-06-14 23:59:59"), parseLong("2015-06-21 23:59:59")));
		assertTrue(DateUtil.isSameWeek(parseLong("2015-06-22 00:00:00"), parseLong("2015-06-23 00:00:00")));
	}
	
	private Date parse(String s){
		return DateUtil.parse(s);
	}
	private Date parseLong(String s){
		return DateUtil.parse(s,DateUtil.fullTimeFmt);
	}
}
