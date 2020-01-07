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
 * @date: 2020��1��5�� ����12:00:00
 */
public class StreamUtilW {
	
	
	
	//���ж�ȡtxt�ļ�
	public static List<String> readLine(InputStream in,boolean explain) throws IOException {
			if(explain) {
				System.out.println(DateUtilW.getNow()+"������ʹ��:���ж�ȡtxt�ļ�\r����:"+in);	
			}
			List<String>list=new ArrayList<String>();
			BufferedReader br = new BufferedReader(new InputStreamReader(in,"utf-8"));
			String str=null;
			while((str=br.readLine())!=null) {
				list.add(str);
			}
			return list;
	}
	
	//���ж�ȡtxt�ļ�
	public static List<String> readLine(Reader reader,boolean explain) throws IOException {
			if(explain) {
				System.out.println(DateUtilW.getNow()+"������ʹ��:���ж�ȡtxt�ļ�\r����:"+reader);	
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
     * ����Ϊ��˵��������Ϊ��˵��
     * 
     */
    
    
    
   
	//���ж�ȡtxt�ļ�
	public static List<String> readLine(InputStream in) throws IOException {
			List<String>list=new ArrayList<String>();
			BufferedReader br = new BufferedReader(new InputStreamReader(in,"utf-8"));
			String str=null;
			while((str=br.readLine())!=null) {
				list.add(str);
			}
			return list;
	}
	
	//���ж�ȡtxt�ļ�
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
