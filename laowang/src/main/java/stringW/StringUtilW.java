package stringW;

import java.text.SimpleDateFormat;
import java.util.Date;

import dateW.DateUtilW;

/**
 * 
 * @ClassName: RegexUtilW 
 * @Description: TODO
 * @author: wang
 * @date: 2020年1月3日 下午2:30:02
 */
public class StringUtilW {
	//验证字符串是否为Null
	public static boolean  isNull(String str,boolean explain) {			
		
		boolean b=str!=null;
			if(explain) {
				System.out.println(DateUtilW.getNow()+"您正在使用:验证字符串是否为Null\r参数:"+str);
			}
			return b;
	}
	
	//验证字符串是否为Null或空串
	public static boolean  isNullAndEmpty(String str,boolean explain) {			
		
		boolean b=str.length()!=0 && str!=null;
			if(explain) {
				System.out.println(DateUtilW.getNow()+"您正在使用:验证字符串是否为Null或空串\r参数:"+str);
			}
			return b;
	}
	
	//验证字符串是否为Null或空串或纯空格
	public static boolean  isNullAndEmptyAndSpace(String str,boolean explain) {			
		
		boolean b=str.trim( ).length()!=0 && str!=null;
			if(explain) {
				System.out.println(DateUtilW.getNow()+"您正在使用:验证字符串是否为Null或空串或纯空格\r参数:"+str);
			}
			return b;
	}
	
}
