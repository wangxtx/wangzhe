package ioW;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import dateW.DateUtilW;

/**
 * 
 * @ClassName: IoW 
 * @Description: TODO
 * @author: wang
 * @date: 2020年1月3日 下午3:53:41
 */
public class IoUtilW {
	//按行读取txt文件
	public static List<String> readLine(InputStream in,boolean explain) throws IOException {
			if(explain) {
				System.out.println(DateUtilW.getNow()+"您正在使用:按行读取txt文件\r\n参数:"+in);	
			}
			List<String>list=new ArrayList<String>();
			BufferedReader br = new BufferedReader(new InputStreamReader(in,"utf-8"));
			String str=null;
			while((str=br.readLine())!=null) {
				list.add(str);
			}
			return list;
	}
}
