package numberW;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import dateW.DateUtilW;
/**
 * @ClassName: NumberUtilW
 * @Description: TODO
 * @author: wang
 * @date: 2020��1��5�� ����12:00:00
 */
public class NumberUtilW {
	
	
	
	//��֤�Ƿ�Ϊ����(����С��)
	public static boolean isNumberAndDecimals(String str,boolean explain) {
		String regex="\\-?\\d+(\\.\\d+)?";
		boolean b=str.matches(regex);
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:��֤�Ƿ�Ϊ����(����С��)\r����:"+str);	
		}
		return b;
	}
	
	//��֤�Ƿ�Ϊ����(������С��)
	public static boolean isNumber(String str,boolean explain) {
		String regex="\\-?\\d+";
		boolean b=str.matches(regex);
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:��֤�Ƿ�Ϊ����(������С��)\r����:"+str);	
		}
		return b;
	}


   
    
    
    
    
    /**
     * 
     * ����Ϊ��˵��������Ϊ��˵��
     * 
     */
    
    
    
   
   
	
	//��֤�Ƿ�Ϊ����(����С��)
	public static boolean isNumberAndDecimals(String str) {
		String regex="\\-?\\d+(\\.\\d+)?";
		boolean b=str.matches(regex);
		return b;
	}
	
	//��֤�Ƿ�Ϊ����(������С��)
	public static boolean isNumber(String str) {
		String regex="\\-?\\d+";
		boolean b=str.matches(regex);
		return b;
	}
}
