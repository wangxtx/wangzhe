package dateW;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 
 * @ClassName: DateUtilW 
 * @Description: TODO
 * @author: wang
 * @date: 2020��1��3�� ����4:33:21
 */
public class DateUtilW {				
	//���ݳ������ڻ�ȡ��ǰ����
	public static  int getAge(String birthday,boolean explain) {																							
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:���ݳ������ڻ�ȡ��ǰ����\r\n����:"+birthday);	
		}
		String nowTime = new SimpleDateFormat ("yyyy-MM-dd").format(new Date());
		int y=Integer.parseInt(nowTime.substring(0,4))-Integer.parseInt(birthday.substring(0,4));
		int m= Integer.parseInt(nowTime.substring(5,7))-Integer.parseInt(birthday.substring(5,7));
		int d= Integer.parseInt(nowTime.substring(8))-Integer.parseInt(birthday.substring(8));
		if(m<0) {
			return y-1;
		}
		else if(m>0) {
			return y;
		}else {
			if(d<0) {
				return y-1;
			}else{
				return y;
			}
		}	
	}
	
	//��ȡ��1970���糿8�㵽��ǰʱ����ܺ�����
	public static long getNowMsec(boolean explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:��ȡ��1970���糿8�㵽��ǰʱ����ܺ�����");	
		}
		return new Date().getTime();
	}
	
	
	//��ȡ��ǰʱ��ı�׼��ʽ
	public static  String getNow() {
	String now ="["+new  SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format(new Date())+"]   ###�������³�Ʒ###   \r\n";
	return now;
	}
	

	
	//��ȡһ����������֮������ʱ��
	public static Date getABMsec(Date a,Date b,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:��ȡһ����������֮������ʱ��\r\n����:"+a+"  "+b);	
		}
		//��ȡ��ʼ���ڵĺ�����
		long t1 = a.getTime();
		//��ȡ�������ڵĺ�����
		long t2 = b.getTime();		
		long t =(long) ((Math.random() * (t2-t1)+1) +t1);	
		return new Date(t);
	}
	
	//��ȡһ����������֮������ʱ��
	@SuppressWarnings("deprecation")
	public static Date getABMsec(String a,String b,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:��ȡһ����������֮������ʱ��\r\n����:"+a+"  "+b);	
		}
		int a1 = Integer.parseInt(a.substring(0,4))-1900;
		int a2 = Integer.parseInt(a.substring(5,7));
		int a3=Integer.parseInt(a.substring(8));
		int b1=Integer.parseInt(b.substring(0,4))-1900;
		int b2=Integer.parseInt(b.substring(5,7));
		int b3=Integer.parseInt(b.substring(8));
		Date d1=new Date(a1,a2,a3);
		Date d2=new Date(b1,b2,b3);
		//��ȡ��ʼ���ڵĺ�����
		long t1 = d1.getTime();
		//��ȡ�������ڵĺ�����
		long t2 = d2.getTime();		
		long t =(long) ((Math.random() * (t2-t1)+1) +t1);	
		return new Date(t);
	}
	

}
