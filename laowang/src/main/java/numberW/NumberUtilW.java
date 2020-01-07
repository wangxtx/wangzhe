package numberW;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import dateW.DateUtilW;
/**
 * @ClassName: NumberUtilW
 * @Description: TODO
 * @author: wang
 * @date: 2020年1月5日 中午12:00:00
 */
public class NumberUtilW {
	
	
	
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
		String regex="\\-?\\d+";
		boolean b=str.matches(regex);
		if(explain) {
			System.out.println(DateUtilW.getNow()+"您正在使用:验证是否为数字(不包括小数)\r参数:"+str);	
		}
		return b;
	}


   
    
    
    
    
    /**
     * 
     * 以上为有说明，以下为无说明
     * 
     */
    
    
    
   
   
	
	//验证是否为数字(包括小数)
	public static boolean isNumberAndDecimals(String str) {
		String regex="\\-?\\d+(\\.\\d+)?";
		boolean b=str.matches(regex);
		return b;
	}
	
	//验证是否为数字(不包括小数)
	public static boolean isNumber(String str) {
		String regex="\\-?\\d+";
		boolean b=str.matches(regex);
		return b;
	}
}
