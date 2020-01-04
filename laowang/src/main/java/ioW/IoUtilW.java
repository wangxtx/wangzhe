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
 * @date: 2020��1��3�� ����3:53:41
 */
public class IoUtilW {
	//���ж�ȡtxt�ļ�
	public static List<String> readLine(InputStream in,boolean explain) throws IOException {
			if(explain) {
				System.out.println(DateUtilW.getNow()+"������ʹ��:���ж�ȡtxt�ļ�\r\n����:"+in);	
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
