package dateW;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * @ClassName: DateUtilW 
 * @Description: TODO
 * @author: wang
 * @date: 2020��1��5�� ����12:00:00
 */
public class DateUtilW {				
	//���ݳ������ڻ�ȡ��ǰ����
	public static  int getAgeByBirthday(String birthday,boolean explain) {																							
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:���ݳ������ڻ�ȡ��ǰ����\r����:"+birthday);	
		}
		String nowTime = new SimpleDateFormat ("yyyy-MM-dd").format(new Date());
		int y=Integer.parseInt(nowTime.substring(0,4))-Integer.parseInt(birthday.substring(0,4));
		int m= Integer.parseInt(nowTime.substring(5,7))-Integer.parseInt(birthday.substring(5,7));
		int d= Integer.parseInt(nowTime.substring(8,10))-Integer.parseInt(birthday.substring(8,10));
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
	
	
	//��ȡ��ǰʱ��ı�׼��ʽ�����ߺ�˵���ĵ���ʾ
	public static  String getNow() {
	String now ="["+new  SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format(new Date())+"]   ###�������³�Ʒ###   ###�ܳ�������Ʒ###\r[---˵���ĵ�---]\r";
	return now;
	}
	

	
	//��ȡһ����������֮������ʱ��
	public static Date getABMsec(Date a,Date b,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:��ȡһ����������֮������ʱ��\r����:"+a+"  "+b);	
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
			System.out.println(DateUtilW.getNow()+"������ʹ��:��ȡһ����������֮������ʱ��\r����:"+a+"  "+b);	
		}
		int a1 = Integer.parseInt(a.substring(0,4))-1900;
		int a2 = Integer.parseInt(a.substring(5,7))-1;
		int a3=Integer.parseInt(a.substring(8,10));
		int b1=Integer.parseInt(b.substring(0,4))-1900;
		int b2=Integer.parseInt(b.substring(5,7))-1;
		int b3=Integer.parseInt(b.substring(8,10));
		Date d1=new Date(a1,a2,a3);
		Date d2=new Date(b1,b2,b3);
		//��ȡ��ʼ���ڵĺ�����
		long t1 = d1.getTime();
		//��ȡ�������ڵĺ�����
		long t2 = d2.getTime();		
		long t =(long) ((Math.random() * (t2-t1)+1) +t1);	
		return new Date(t);
	}
	

	//��ȡһ���µ��³�
	public static Date getMonthFirstDay(Date date,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:��ȡһ���µ��³�\r����:"+date);	
		}
		//��ȡһ��������
		Calendar c = Calendar.getInstance();
		//�ô�������ڳ�ʼ������
		c.setTime(date);
		
	   c.set(Calendar.DAY_OF_MONTH, 1);//����Ϊ��ǰ���ڵĵ�һ��
	   c.set(Calendar.HOUR_OF_DAY, 0);//����Сʱ
	   c.set(Calendar.MINUTE, 0);//����
	   c.set(Calendar.SECOND, 0);//��
		return c.getTime();
		
	}
	//��ȡһ���µ���ĩ
	public static Date getMonthLastDay(Date date,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:��ȡһ���µ���ĩ\r����:"+date);	
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		//���·�+1
		c.add(Calendar.MONTH, 1);
		//��ʱ�����³�
		Date initMonth = getMonthFirstDay(c.getTime(),false);
		c.setTime(initMonth);
		//�����ڼ�ȥ1
		c.add(Calendar.SECOND, -1);
		return c.getTime();
		
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

	
}
