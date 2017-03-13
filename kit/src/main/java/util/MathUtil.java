package util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * mathUtil for count
 * @author lxc
 *
 */
public class MathUtil {
	
	/**
	 * 除法保留位数
	 */
	private static final int DEF_DIV_SCALE = 10;
	
	private static BigDecimal acq(Object t) {
		return new BigDecimal(t.toString());
	}
	/**
	 * 如果全部时传入Obj
	 * 会导致返回值类型多样
	 * 如果返回BigDecimal或者Obj,就太麻烦了,还要手动变
	 * 所以只能多写几个方法了
	 */

	public static double add(double ... vs) {
		BigDecimal temp = new BigDecimal(vs[0]);
		for(int i=1;i<vs.length;i++){
			temp = temp.add(acq(vs[i]));
		}
		return temp.doubleValue();
	}

	public static double sub(double v1, double v2) {
		return acq(v1).subtract(acq(v2)).doubleValue();
	}

	public static double mul(double v1, double v2) {
		return acq(v1).multiply(acq(v2)).doubleValue();
	}
	
	public static float add(float v1, float v2) {
		return acq(v1).add(acq(v2)).floatValue();
	}

	public static float sub(float v1, float v2) {
		return acq(v1).subtract(acq(v2)).floatValue();
	}

	public static float mul(float v1, float v2) {
		return acq(v1).multiply(acq(v2)).floatValue();
	}

	/**
	 * 提供（相对）精确的除法运算，当发生除不尽的情况时，精确到 小数点以后10位，以后的数字四舍五入。
	 * 
	 * @param v1
	 *            被除数
	 * @param v2
	 *            除数
	 * @return 两个参数的商
	 */
	public static double div(double v1, double v2) {
		return div(v1, v2, DEF_DIV_SCALE);
	}

	/**
	 * 提供（相对）精确的除法运算。当发生除不尽的情况时，由scale参数指 定精度，以后的数字四舍五入。
	 * 
	 * @param v1
	 *            被除数
	 * @param v2
	 *            除数
	 * @param scale
	 *            表示表示需要精确到小数点以后几位。
	 * @return 两个参数的商
	 */
	public static double div(double v1, double v2, int scale) {
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		return acq(v1).divide(acq(v2), scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	/**
	 * 提供精确的小数位四舍五入处理。
	 * 
	 * @param v
	 *            需要四舍五入的数字
	 * @param scale
	 *            小数点后保留几位
	 * @return 四舍五入后的结果
	 */
	public static double round(double v, int scale) {
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		return acq(v).divide(acq(1), scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

}
