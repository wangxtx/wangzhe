package numberW;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import dateW.DateUtilW;

public class NumberW {
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
		String regex="\\-?\\d+\\d+";
		boolean b=str.matches(regex);
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:��֤�Ƿ�Ϊ����(������С��)\r����:"+str);	
		}
		return b;
	}

}
