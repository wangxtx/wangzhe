package streamW;

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
 * @ClassName: StreamUtilW
 * @Description: TODO
 * @author: wang
 * @date: 2020年1月5日 中午12:00:00
 */
public class StreamUtilW {
	
	
	
	//按行读取txt文件
	public static List<String> readLine(InputStream in,boolean explain) throws IOException {
			if(explain) {
				System.out.println(DateUtilW.getNow()+"您正在使用:按行读取txt文件\r参数:"+in);	
			}
			List<String>list=new ArrayList<String>();
			BufferedReader br = new BufferedReader(new InputStreamReader(in,"utf-8"));
			String str=null;
			while((str=br.readLine())!=null) {
				list.add(str);
			}
			return list;
	}
	
	//按行读取txt文件
	public static List<String> readLine(Reader reader,boolean explain) throws IOException {
			if(explain) {
				System.out.println(DateUtilW.getNow()+"您正在使用:按行读取txt文件\r参数:"+reader);	
			}
			List<String>list=new ArrayList<String>();
			BufferedReader br = new BufferedReader(reader);
			String str=null;
			while((str=br.readLine())!=null) {
				list.add(str);
			}
			return list;
	}
   
    
    
    
    
    /**
     * 
     * 以上为有说明，以下为无说明
     * 
     */
    
    
    
   
	//按行读取txt文件
	public static List<String> readLine(InputStream in) throws IOException {
			List<String>list=new ArrayList<String>();
			BufferedReader br = new BufferedReader(new InputStreamReader(in,"utf-8"));
			String str=null;
			while((str=br.readLine())!=null) {
				list.add(str);
			}
			return list;
	}
	
	//按行读取txt文件
	public static List<String> readLine(Reader reader) throws IOException {
			List<String>list=new ArrayList<String>();
			BufferedReader br = new BufferedReader(reader);
			String str=null;
			while((str=br.readLine())!=null) {
				list.add(str);
			}
			return list;
	}
}
