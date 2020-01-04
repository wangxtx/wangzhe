package dateW;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * 
 * @ClassName: DateUtilW 
 * @Description: TODO
 * @author: wang
 * @date: 2020年1月3日 下午4:33:21
 */
public class DateUtilW {				
	//根据出生日期获取当前年龄
	public static  int getAge(String birthday,boolean explain) {																							
		if(explain) {
			System.out.println(DateUtilW.getNow()+"您正在使用:根据出生日期获取当前年龄\r参数:"+birthday);	
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
	
	//获取从1970年早晨8点到当前时间的总毫秒数
	public static long getNowMsec(boolean explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"您正在使用:获取从1970年早晨8点到当前时间的总毫秒数");	
		}
		return new Date().getTime();
	}
	
	
	//获取当前时间的标准格式
	public static  String getNow() {
	String now ="["+new  SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format(new Date())+"]   ###王行天下出品###   ###哲出必属精品###\r[---说明文档---]\r";
	return now;
	}
	

	
	//获取一个的在两者之间的随机时间
	public static Date getABMsec(Date a,Date b,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"您正在使用:获取一个的在两者之间的随机时间\r参数:"+a+"  "+b);	
		}
		//获取开始日期的毫秒数
		long t1 = a.getTime();
		//获取结束日期的毫秒数
		long t2 = b.getTime();		
		long t =(long) ((Math.random() * (t2-t1)+1) +t1);	
		return new Date(t);
	}
	
	//获取一个的在两者之间的随机时间
	@SuppressWarnings("deprecation")
	public static Date getABMsec(String a,String b,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"您正在使用:获取一个的在两者之间的随机时间\r参数:"+a+"  "+b);	
		}
		int a1 = Integer.parseInt(a.substring(0,4))-1900;
		int a2 = Integer.parseInt(a.substring(5,7));
		int a3=Integer.parseInt(a.substring(8));
		int b1=Integer.parseInt(b.substring(0,4))-1900;
		int b2=Integer.parseInt(b.substring(5,7));
		int b3=Integer.parseInt(b.substring(8));
		Date d1=new Date(a1,a2,a3);
		Date d2=new Date(b1,b2,b3);
		//获取开始日期的毫秒数
		long t1 = d1.getTime();
		//获取结束日期的毫秒数
		long t2 = d2.getTime();		
		long t =(long) ((Math.random() * (t2-t1)+1) +t1);	
		return new Date(t);
	}
	

	//获取一个月的月初
	public static Date getMonthFirstDay(Date date,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"您正在使用:获取一个月的月初\r参数:"+date);	
		}
		//获取一个日期类
		Calendar c = Calendar.getInstance();
		//用传入的日期初始日历类
		c.setTime(date);
		
	   c.set(Calendar.DAY_OF_MONTH, 1);//设置为当前日期的第一天
	   c.set(Calendar.HOUR_OF_DAY, 0);//设置小时
	   c.set(Calendar.MINUTE, 0);//分钟
	   c.set(Calendar.SECOND, 0);//秒
		return c.getTime();
		
	}
	//获取一个月的月末
	public static Date getMonthLastDay(Date date,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"您正在使用:获取一个月的月末\r参数:"+date);	
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		//让月份+1
		c.add(Calendar.MONTH, 1);
		//让时间变成月初
		Date initMonth = getMonthFirstDay(c.getTime(),false);
		c.setTime(initMonth);
		//让日期减去1
		c.add(Calendar.SECOND, -1);
		return c.getTime();
		
	}
	
	
}
