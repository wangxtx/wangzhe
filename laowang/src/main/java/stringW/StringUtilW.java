package stringW;

import java.text.SimpleDateFormat;
import java.util.Date;

import dateW.DateUtilW;
/**
 * @ClassName: StringUtilW
 * @Description: TODO
 * @author: wang
 * @date: 2020年1月5日 中午12:00:00
 */
public class StringUtilW {
	
	
	
	//验证字符串是否为Null
	public static boolean  isNull(String str,boolean explain) {			
		if(explain) {
			System.out.println(DateUtilW.getNow()+"您正在使用:验证字符串是否为Null\r参数:"+str);
		}
		boolean b=str==null;

			return b;
	}
	
	//验证字符串是否为Null或空串
	public static boolean  isNullAndEmpty(String str,boolean explain) {			
		if(explain) {
			System.out.println(DateUtilW.getNow()+"您正在使用:验证字符串是否为Null或空串\r参数:"+str);
		}
		boolean b=str.length()==0 || str==null;

			return b;
	}
	
	//验证字符串是否为Null或空串或纯空格
	public static boolean  isNullAndEmptyAndSpace(String str,boolean explain) {			
		if(explain) {
			System.out.println(DateUtilW.getNow()+"您正在使用:验证字符串是否为Null或空串或纯空格\r参数:"+str);
		}
		boolean b=str.trim( ).length()==0 || str==null;
			return b;
	}
	

	// 首字母转小写
	public static String firstStringToLowerCase(String str,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"您正在使用:首字母转小写\r参数:"+str);
		}
		if (Character.isLowerCase(str.charAt(0)))
			return str;
		else
			return (new StringBuilder()).append(Character.toLowerCase(str.charAt(0))).append(str.substring(1)).toString();
	}
 
	// 首字母转大写
	public static String firstStringToUpperCase(String str,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"您正在使用:首字母转大写\r参数:"+str);
		}
		if (Character.isUpperCase(str.charAt(0)))
			return str;
		else
			return (new StringBuilder()).append(Character.toUpperCase(str.charAt(0))).append(str.substring(1)).toString();
	}
	
	//将一个yyyy-MM-dd格式的字符串转换为Date类型(年月日)
	public static Date getDateByStringBy_yyyy_MM_dd(String yyyy_MM_dd,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"您正在使用:将一个yyyy_MM_dd的字符串转换为Date类型\r参数:"+yyyy_MM_dd);
		}
		int yyyy=Integer.parseInt(yyyy_MM_dd.substring(0,4))-1900;
		int MM= Integer.parseInt(yyyy_MM_dd.substring(5,7))-1;
		int dd= Integer.parseInt(yyyy_MM_dd.substring(8,10));
		return new Date(yyyy, MM, dd);
	}
	
	//将一个yyyy-MM-dd HH:mm:ss格式的字符串转换为Date类型(年月日时分秒)
	public static Date getDateByStringBy_yyyy_MM_dd_HH_mm_ss(String yyyy_MM_dd_HH_mm_ss,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"您正在使用:将一个yyyy_MM_dd HH:mm:ss格式的字符串转换为Date类型\r参数:"+yyyy_MM_dd_HH_mm_ss);
		}
		int yyyy=Integer.parseInt(yyyy_MM_dd_HH_mm_ss.substring(0,4))-1900;
		int MM= Integer.parseInt(yyyy_MM_dd_HH_mm_ss.substring(5,7))-1;
		int dd= Integer.parseInt(yyyy_MM_dd_HH_mm_ss.substring(8,10));
		int HH=Integer.parseInt(yyyy_MM_dd_HH_mm_ss.substring(11,13));
		int mm=Integer.parseInt(yyyy_MM_dd_HH_mm_ss.substring(14,16));
		int ss=Integer.parseInt(yyyy_MM_dd_HH_mm_ss.substring(17,19));
		return new Date(yyyy, MM, dd, HH, mm, ss);
	}
	
	//将一个Date对象转换为String类型(yyyy-MM-dd年月日)
	public static String getStringyyyy_MM_ddByDate(Date date,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"您正在使用:将一个Date对象转换为String类型(yyyy-MM-dd年月日)\r参数:"+date);
		}
		return new SimpleDateFormat("yyyy-MM-dd").format(date);
	}
	
	
	//将一个Date对象转换为String类型(yyyy-MM-dd HH:mm:ss年月日时分秒)
	public static String getStringyyyy_MM_dd_HH_mm_ssByDate(Date date,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"您正在使用:将一个Date对象转换为String类型(yyyy-MM-dd HH:mm:ss年月日时分秒)\r参数:"+date);
		}
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
	}
	
	//判断是否为字母
	public static boolean isLetter(String str,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"您正在使用:判断是否为字母\r参数:"+str);
		}
		 if(str==null) return false;
	        return str.matches("[a-zA-Z]+");
	}

	//判断是否为字母
	public static boolean isLetter(char c,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"您正在使用:判断是否为字母\r参数:"+c);
		}
		String str=""+c;
        return str.matches("[a-zA-Z]+");
	}
	
	//判断是否为汉字
    public static boolean isChineseChar(char c,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"您正在使用:判断是否为汉字\r参数:"+c);
		}
        return String.valueOf(c).matches("[\u4e00-\u9fa5]");
    }
    
	//判断是否为汉字
    public static boolean isChineseChar(String str,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"您正在使用:判断是否为汉字\r参数:"+str);
		}
        return str.matches("[\u4e00-\u9fa5]");
    }
    
    
    
    
    
    /**
     * 
     * 以上为有说明，以下为无说明
     * 
     */
    
    
    
   
    
	//验证字符串是否为Null
	public static boolean  isNull(String str) {			

		boolean b=str==null;

			return b;
	}
	
	//验证字符串是否为Null或空串
	public static boolean  isNullAndEmpty(String str) {			

		boolean b=str.length()==0 || str==null;

			return b;
	}
	
	//验证字符串是否为Null或空串或纯空格
	public static boolean  isNullAndEmptyAndSpace(String str) {			
		boolean b=str.trim( ).length()==0 || str==null;
			return b;
	}
	

	// 首字母转小写
	public static String firstStringToLowerCase(String str) {

		if (Character.isLowerCase(str.charAt(0)))
			return str;
		else
			return (new StringBuilder()).append(Character.toLowerCase(str.charAt(0))).append(str.substring(1)).toString();
	}
 
	// 首字母转大写
	public static String firstStringToUpperCase(String str) {

		if (Character.isUpperCase(str.charAt(0)))
			return str;
		else
			return (new StringBuilder()).append(Character.toUpperCase(str.charAt(0))).append(str.substring(1)).toString();
	}
	
	//将一个yyyy-MM-dd格式的字符串转换为Date类型(年月日)
	public static Date getDateByStringBy_yyyy_MM_dd(String yyyy_MM_dd) {

		int yyyy=Integer.parseInt(yyyy_MM_dd.substring(0,4))-1900;
		int MM= Integer.parseInt(yyyy_MM_dd.substring(5,7))-1;
		int dd= Integer.parseInt(yyyy_MM_dd.substring(8,10));
		return new Date(yyyy, MM, dd);
	}
	
	//将一个yyyy-MM-dd HH:mm:ss格式的字符串转换为Date类型(年月日时分秒)
	public static Date getDateByStringBy_yyyy_MM_dd_HH_mm_ss(String yyyy_MM_dd_HH_mm_ss) {

		int yyyy=Integer.parseInt(yyyy_MM_dd_HH_mm_ss.substring(0,4))-1900;
		int MM= Integer.parseInt(yyyy_MM_dd_HH_mm_ss.substring(5,7))-1;
		int dd= Integer.parseInt(yyyy_MM_dd_HH_mm_ss.substring(8,10));
		int HH=Integer.parseInt(yyyy_MM_dd_HH_mm_ss.substring(11,13));
		int mm=Integer.parseInt(yyyy_MM_dd_HH_mm_ss.substring(14,16));
		int ss=Integer.parseInt(yyyy_MM_dd_HH_mm_ss.substring(17,19));
		return new Date(yyyy, MM, dd, HH, mm, ss);
	}
	
	//将一个Date对象转换为String类型(yyyy-MM-dd年月日)
	public static String getStringyyyy_MM_ddByDate(Date date) {

		return new SimpleDateFormat("yyyy-MM-dd").format(date);
	}
	
	
	//将一个Date对象转换为String类型(yyyy-MM-dd HH:mm:ss年月日时分秒)
	public static String getStringyyyy_MM_dd_HH_mm_ssByDate(Date date) {

		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
	}
	
	//判断是否为字母
	public static boolean isLetter(String str) {

		 if(str==null) return false;
	        return str.matches("[a-zA-Z]+");
	}

	//判断是否为字母
	public static boolean isLetter(char c) {

		String str=""+c;
        return str.matches("[a-zA-Z]+");
	}
	
	//判断是否为汉字
    public static boolean isChineseChar(char c) {
        return String.valueOf(c).matches("[\u4e00-\u9fa5]");
    }
    
	//判断是否为汉字
    public static boolean isChineseChar(String str) {

        return str.matches("[\u4e00-\u9fa5]");
    }
    

     
}
