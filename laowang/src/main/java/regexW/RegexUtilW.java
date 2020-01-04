package regexW;

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
public class RegexUtilW {
	//��֤�Ƿ�Ϊ�ֻ���
	public  static boolean   isPhoneNumber(String phone,boolean explain) {		
		String regex="1[3|5|6|7|8]\\d{9}";
		boolean b = phone.matches(regex);
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:��֤�Ƿ�Ϊ�ֻ���\r\n����:"+phone);	
		}
		return b ;	
	}
	
	//��֤�Ƿ�Ϊ����
	public static boolean isEmail(String email,boolean explain) {				
		String regex="[A-Za-z0-9]+\\@[A-Za-z0-9]+\\.[A-Za-z0-9]+";
		boolean b=email.matches(regex);
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:��֤�Ƿ�Email����\r\n����:"+email);	
		}
		return b;
	}
	

	
	
	//��֤�ַ����Ƿ�ΪNull
	public static boolean  isNull(String str,boolean explain) {			
		
		boolean b=str!=null;
			if(explain) {
				System.out.println("������ʹ��:��֤�ַ����Ƿ�ΪNull\r\n����:'"+str);
			}
			return b;
	}
	
	//��֤�ַ����Ƿ�ΪNull��մ�
	public static boolean  isNullAndEmpty(String str,boolean explain) {			
		
		boolean b=str.length()!=0 && str!=null;
			if(explain) {
				System.out.println("������ʹ��:��֤�ַ����Ƿ�ΪNull��մ�\r\n����:"+str);
			}
			return b;
	}
	
	//��֤�ַ����Ƿ�ΪNull��մ��򴿿ո�
	public static boolean  isNullAndEmptyAndSpace(String str,boolean explain) {			
		
		boolean b=str.trim( ).length()!=0 && str!=null;
			if(explain) {
				System.out.println("������ʹ��:��֤�ַ����Ƿ�ΪNull��մ��򴿿ո�\r\n����:"+str);
			}
			return b;
	}
	
}