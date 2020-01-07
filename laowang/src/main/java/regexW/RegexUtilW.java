package regexW;

import java.text.SimpleDateFormat;
import java.util.Date;

import dateW.DateUtilW;
/**
 * @ClassName: RegexUtilW
 * @Description: TODO
 * @author: wang
 * @date: 2020年1月5日 中午12:00:00
 */
public class RegexUtilW {
	
	
	
	//验证是否为手机号
	public  static boolean   isPhoneNumber(String phone,boolean explain) {		
		String regex="1[3|5|6|7|8]\\d{9}";
		boolean b = phone.matches(regex);
		if(explain) {
			System.out.println(DateUtilW.getNow()+"您正在使用:验证是否为手机号\r参数:"+phone);	
		}
		return b ;	
	}
	
	//验证是否为邮箱
	public static boolean isEmail(String email,boolean explain) {				
		String regex="[A-Za-z0-9]+\\@[A-Za-z0-9]+\\.[A-Za-z0-9]+";
		boolean b=email.matches(regex);
		if(explain) {
			System.out.println(DateUtilW.getNow()+"您正在使用:验证是否Email邮箱\r参数:"+email);	
		}
		return b;
	}
	

	
	
	//验证字符串是否为Null
	public static boolean  isNull(String str,boolean explain) {			
		
		boolean b=str==null;
			if(explain) {
				System.out.println("您正在使用:验证字符串是否为Null\r\n参数:'"+str);
			}
			return b;
	}
	
	//验证字符串是否为Null或空串
	public static boolean  isNullAndEmpty(String str,boolean explain) {			
		
		boolean b=str.length()==0 || str==null;
			if(explain) {
				System.out.println("您正在使用:验证字符串是否为Null或空串\r\n参数:"+str);
			}
			return b;
	}
	
	//验证字符串是否为Null或空串或纯空格
	public static boolean  isNullAndEmptyAndSpace(String str,boolean explain) {			
		
		boolean b=str.trim( ).length()==0 || str==null;
			if(explain) {
				System.out.println("您正在使用:验证字符串是否为Null或空串或纯空格\r\n参数:"+str);
			}
			return b;
	}
   
    
    
    
    
    /**
     * 
     * 以上为有说明，以下为无说明
     * 
     */
    
    
    
   
   
	//验证是否为手机号
	public  static boolean   isPhoneNumber(String phone) {		
		String regex="1[3|5|6|7|8]\\d{9}";
		boolean b = phone.matches(regex);
		return b ;	
	}
	
	//验证是否为邮箱
	public static boolean isEmail(String email) {				
		String regex="[A-Za-z0-9]+\\@[A-Za-z0-9]+\\.[A-Za-z0-9]+";
		boolean b=email.matches(regex);
		return b;
	}
	

	
	
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
}
