package numberW;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import dateW.DateUtilW;

public class NumberW {
	//验证是否为数字(包括小数)
	public static boolean isNumberAndDecimals(String str,boolean explain) {
		String regex="\\-?\\d+(\\.\\d+)?";
		boolean b=str.matches(regex);
		if(explain) {
			System.out.println(DateUtilW.getNow()+"您正在使用:验证是否为数字(包括小数)\r参数:"+str);	
		}
		return b;
	}
	
	//验证是否为数字(不包括小数)
	public static boolean isNumber(String str,boolean explain) {
		String regex="\\-?\\d+\\d+";
		boolean b=str.matches(regex);
		if(explain) {
			System.out.println(DateUtilW.getNow()+"您正在使用:验证是否为数字(不包括小数)\r参数:"+str);	
		}
		return b;
	}

}
