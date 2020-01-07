package stringW;

import java.text.SimpleDateFormat;
import java.util.Date;

import dateW.DateUtilW;
/**
 * @ClassName: StringUtilW
 * @Description: TODO
 * @author: wang
 * @date: 2020��1��5�� ����12:00:00
 */
public class StringUtilW {
	
	
	
	//��֤�ַ����Ƿ�ΪNull
	public static boolean  isNull(String str,boolean explain) {			
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:��֤�ַ����Ƿ�ΪNull\r����:"+str);
		}
		boolean b=str==null;

			return b;
	}
	
	//��֤�ַ����Ƿ�ΪNull��մ�
	public static boolean  isNullAndEmpty(String str,boolean explain) {			
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:��֤�ַ����Ƿ�ΪNull��մ�\r����:"+str);
		}
		boolean b=str.length()==0 || str==null;

			return b;
	}
	
	//��֤�ַ����Ƿ�ΪNull��մ��򴿿ո�
	public static boolean  isNullAndEmptyAndSpace(String str,boolean explain) {			
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:��֤�ַ����Ƿ�ΪNull��մ��򴿿ո�\r����:"+str);
		}
		boolean b=str.trim( ).length()==0 || str==null;
			return b;
	}
	

	// ����ĸתСд
	public static String firstStringToLowerCase(String str,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:����ĸתСд\r����:"+str);
		}
		if (Character.isLowerCase(str.charAt(0)))
			return str;
		else
			return (new StringBuilder()).append(Character.toLowerCase(str.charAt(0))).append(str.substring(1)).toString();
	}
 
	// ����ĸת��д
	public static String firstStringToUpperCase(String str,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:����ĸת��д\r����:"+str);
		}
		if (Character.isUpperCase(str.charAt(0)))
			return str;
		else
			return (new StringBuilder()).append(Character.toUpperCase(str.charAt(0))).append(str.substring(1)).toString();
	}
	
	//��һ��yyyy-MM-dd��ʽ���ַ���ת��ΪDate����(������)
	public static Date getDateByStringBy_yyyy_MM_dd(String yyyy_MM_dd,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:��һ��yyyy_MM_dd���ַ���ת��ΪDate����\r����:"+yyyy_MM_dd);
		}
		int yyyy=Integer.parseInt(yyyy_MM_dd.substring(0,4))-1900;
		int MM= Integer.parseInt(yyyy_MM_dd.substring(5,7))-1;
		int dd= Integer.parseInt(yyyy_MM_dd.substring(8,10));
		return new Date(yyyy, MM, dd);
	}
	
	//��һ��yyyy-MM-dd HH:mm:ss��ʽ���ַ���ת��ΪDate����(������ʱ����)
	public static Date getDateByStringBy_yyyy_MM_dd_HH_mm_ss(String yyyy_MM_dd_HH_mm_ss,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:��һ��yyyy_MM_dd HH:mm:ss��ʽ���ַ���ת��ΪDate����\r����:"+yyyy_MM_dd_HH_mm_ss);
		}
		int yyyy=Integer.parseInt(yyyy_MM_dd_HH_mm_ss.substring(0,4))-1900;
		int MM= Integer.parseInt(yyyy_MM_dd_HH_mm_ss.substring(5,7))-1;
		int dd= Integer.parseInt(yyyy_MM_dd_HH_mm_ss.substring(8,10));
		int HH=Integer.parseInt(yyyy_MM_dd_HH_mm_ss.substring(11,13));
		int mm=Integer.parseInt(yyyy_MM_dd_HH_mm_ss.substring(14,16));
		int ss=Integer.parseInt(yyyy_MM_dd_HH_mm_ss.substring(17,19));
		return new Date(yyyy, MM, dd, HH, mm, ss);
	}
	
	//��һ��Date����ת��ΪString����(yyyy-MM-dd������)
	public static String getStringyyyy_MM_ddByDate(Date date,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:��һ��Date����ת��ΪString����(yyyy-MM-dd������)\r����:"+date);
		}
		return new SimpleDateFormat("yyyy-MM-dd").format(date);
	}
	
	
	//��һ��Date����ת��ΪString����(yyyy-MM-dd HH:mm:ss������ʱ����)
	public static String getStringyyyy_MM_dd_HH_mm_ssByDate(Date date,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:��һ��Date����ת��ΪString����(yyyy-MM-dd HH:mm:ss������ʱ����)\r����:"+date);
		}
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
	}
	
	//�ж��Ƿ�Ϊ��ĸ
	public static boolean isLetter(String str,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:�ж��Ƿ�Ϊ��ĸ\r����:"+str);
		}
		 if(str==null) return false;
	        return str.matches("[a-zA-Z]+");
	}

	//�ж��Ƿ�Ϊ��ĸ
	public static boolean isLetter(char c,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:�ж��Ƿ�Ϊ��ĸ\r����:"+c);
		}
		String str=""+c;
        return str.matches("[a-zA-Z]+");
	}
	
	//�ж��Ƿ�Ϊ����
    public static boolean isChineseChar(char c,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:�ж��Ƿ�Ϊ����\r����:"+c);
		}
        return String.valueOf(c).matches("[\u4e00-\u9fa5]");
    }
    
	//�ж��Ƿ�Ϊ����
    public static boolean isChineseChar(String str,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:�ж��Ƿ�Ϊ����\r����:"+str);
		}
        return str.matches("[\u4e00-\u9fa5]");
    }
    
    
    
    
    
    /**
     * 
     * ����Ϊ��˵��������Ϊ��˵��
     * 
     */
    
    
    
   
    
	//��֤�ַ����Ƿ�ΪNull
	public static boolean  isNull(String str) {			

		boolean b=str==null;

			return b;
	}
	
	//��֤�ַ����Ƿ�ΪNull��մ�
	public static boolean  isNullAndEmpty(String str) {			

		boolean b=str.length()==0 || str==null;

			return b;
	}
	
	//��֤�ַ����Ƿ�ΪNull��մ��򴿿ո�
	public static boolean  isNullAndEmptyAndSpace(String str) {			
		boolean b=str.trim( ).length()==0 || str==null;
			return b;
	}
	

	// ����ĸתСд
	public static String firstStringToLowerCase(String str) {

		if (Character.isLowerCase(str.charAt(0)))
			return str;
		else
			return (new StringBuilder()).append(Character.toLowerCase(str.charAt(0))).append(str.substring(1)).toString();
	}
 
	// ����ĸת��д
	public static String firstStringToUpperCase(String str) {

		if (Character.isUpperCase(str.charAt(0)))
			return str;
		else
			return (new StringBuilder()).append(Character.toUpperCase(str.charAt(0))).append(str.substring(1)).toString();
	}
	
	//��һ��yyyy-MM-dd��ʽ���ַ���ת��ΪDate����(������)
	public static Date getDateByStringBy_yyyy_MM_dd(String yyyy_MM_dd) {

		int yyyy=Integer.parseInt(yyyy_MM_dd.substring(0,4))-1900;
		int MM= Integer.parseInt(yyyy_MM_dd.substring(5,7))-1;
		int dd= Integer.parseInt(yyyy_MM_dd.substring(8,10));
		return new Date(yyyy, MM, dd);
	}
	
	//��һ��yyyy-MM-dd HH:mm:ss��ʽ���ַ���ת��ΪDate����(������ʱ����)
	public static Date getDateByStringBy_yyyy_MM_dd_HH_mm_ss(String yyyy_MM_dd_HH_mm_ss) {

		int yyyy=Integer.parseInt(yyyy_MM_dd_HH_mm_ss.substring(0,4))-1900;
		int MM= Integer.parseInt(yyyy_MM_dd_HH_mm_ss.substring(5,7))-1;
		int dd= Integer.parseInt(yyyy_MM_dd_HH_mm_ss.substring(8,10));
		int HH=Integer.parseInt(yyyy_MM_dd_HH_mm_ss.substring(11,13));
		int mm=Integer.parseInt(yyyy_MM_dd_HH_mm_ss.substring(14,16));
		int ss=Integer.parseInt(yyyy_MM_dd_HH_mm_ss.substring(17,19));
		return new Date(yyyy, MM, dd, HH, mm, ss);
	}
	
	//��һ��Date����ת��ΪString����(yyyy-MM-dd������)
	public static String getStringyyyy_MM_ddByDate(Date date) {

		return new SimpleDateFormat("yyyy-MM-dd").format(date);
	}
	
	
	//��һ��Date����ת��ΪString����(yyyy-MM-dd HH:mm:ss������ʱ����)
	public static String getStringyyyy_MM_dd_HH_mm_ssByDate(Date date) {

		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
	}
	
	//�ж��Ƿ�Ϊ��ĸ
	public static boolean isLetter(String str) {

		 if(str==null) return false;
	        return str.matches("[a-zA-Z]+");
	}

	//�ж��Ƿ�Ϊ��ĸ
	public static boolean isLetter(char c) {

		String str=""+c;
        return str.matches("[a-zA-Z]+");
	}
	
	//�ж��Ƿ�Ϊ����
    public static boolean isChineseChar(char c) {
        return String.valueOf(c).matches("[\u4e00-\u9fa5]");
    }
    
	//�ж��Ƿ�Ϊ����
    public static boolean isChineseChar(String str) {

        return str.matches("[\u4e00-\u9fa5]");
    }
    

     
}
