package stringW;

import java.text.SimpleDateFormat;
import java.util.Date;

import dateW.DateUtilW;

/**
 * 
 * @ClassName: RegexUtilW 
 * @Description: TODO
 * @author: wang
 * @date: 2020��1��3�� ����2:30:02
 */
public class StringUtilW {
	//��֤�ַ����Ƿ�ΪNull
	public static boolean  isNull(String str,boolean explain) {			
		
		boolean b=str!=null;
			if(explain) {
				System.out.println(DateUtilW.getNow()+"������ʹ��:��֤�ַ����Ƿ�ΪNull\r����:"+str);
			}
			return b;
	}
	
	//��֤�ַ����Ƿ�ΪNull��մ�
	public static boolean  isNullAndEmpty(String str,boolean explain) {			
		
		boolean b=str.length()!=0 && str!=null;
			if(explain) {
				System.out.println(DateUtilW.getNow()+"������ʹ��:��֤�ַ����Ƿ�ΪNull��մ�\r����:"+str);
			}
			return b;
	}
	
	//��֤�ַ����Ƿ�ΪNull��մ��򴿿ո�
	public static boolean  isNullAndEmptyAndSpace(String str,boolean explain) {			
		
		boolean b=str.trim( ).length()!=0 && str!=null;
			if(explain) {
				System.out.println(DateUtilW.getNow()+"������ʹ��:��֤�ַ����Ƿ�ΪNull��մ��򴿿ո�\r����:"+str);
			}
			return b;
	}
	
}
