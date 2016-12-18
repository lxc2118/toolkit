package util;

import java.util.ArrayList;
import java.util.List;

public class NumUtil {
	
	public static Double parseDouble(String s){
		Double ret = null;
		if(s==null) return null;
		try{
			ret = Double.parseDouble(s);
		}catch(Exception e){
			
		}
		return ret;
	}

	public static Long parseLong(String s){
		Long ret = null;
		
		if(s==null) return null;
		try{
			ret = Long.parseLong(s);
		}catch(Exception e){
			
		}
		return ret;
		
	}

	public static Integer parseInt(String s){
		Integer ret = null;
		if(s==null) return null;
		try{
			ret = Integer.parseInt(s);
		}catch(Exception e){
			
		}
		return ret;
		
	}
	
	public static List<int[]> parse2Ints(String num){
		if(num==null || num.equals("")) return null;
		List<String> nums = StrUtil.split(num, '|');
		List<int[]> ret = new ArrayList<int[]>();
		for(String st:nums){
			ret.add(parseInts(st));
		}
		return ret;
	} 
	
	public static List<long[]> parse2Longs(String num){
		if(num==null || num.equals("")) return null;
		List<String> nums = StrUtil.split(num, '|');
		List<long[]> ret = new ArrayList<long[]>();
		for(String st:nums){
			ret.add(parseLongs(st));
		}
		return ret;
	} 
	
	public static int[] parseInts(String num){
		if(num==null || num.equals("")) return null;
		String[] nums = num.split(",");
		int[] ret = new int[nums.length];
		for(int i=0;i<ret.length;i++){
			ret[i] = Integer.parseInt(nums[i]);
		}
		return ret;
	}
	
	public static long[] parseLongs(String num){
		if(num==null || num.equals("")) return null;
		List<String> nums = StrUtil.split(num, ',');
		long[] ret = new long[nums.size()];
		for(int i=0;i<ret.length;i++){
			ret[i] = Long.parseLong(nums.get(i));
		}
		return ret;
	}
	
	public static int addInt(Number n1,Number n2){
		int i1=0;
		if(n1!=null) i1 = n1.intValue();
		int i2=0;
		if(n2!=null) i2 = n2.intValue();
		return i1+i2;
	}
	/**
	 * 结果如果小于0，将变成0
	 * @param n1
	 * @param n2
	 * @return
	 */
	public static int subIntNZ(Number n1,Number n2){
		int i1=0;
		if(n1!=null) i1 = n1.intValue();
		int i2=0;
		if(n2!=null) i2 = n2.intValue();
		int ret = i1-i2;
		if(ret<0) ret = 0;
		return ret;
	}
	
	/**
	 * 结果如果小于0，将变成0
	 * @param n1
	 * @param n2
	 * @return
	 */
	public static int sub(Number n1,Number n2){
		int i1=0;
		if(n1!=null) i1 = n1.intValue();
		int i2=0;
		if(n2!=null) i2 = n2.intValue();
		int ret = i1-i2;
		
		return ret;
	}
	
	public static Integer isNull(Integer value){
		if(value==null) return 0;
		return value;
	}
	
	
}
