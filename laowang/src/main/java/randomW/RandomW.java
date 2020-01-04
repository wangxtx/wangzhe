package randomW;

import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Random;

import dateW.DateUtilW;

public class RandomW {
	
	//���һ����min-max֮����������
	public static int getRandomInt(int min,int max,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:���һ����min-max֮����������\r����:"+min+"  "+max);	
		}
		int num=new Random().nextInt((max-min)+1)+min;
		return num;
	}
	
	//���һ��0-9 a-z A-Z������ַ�
	public static char getChar(boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:���һ��0-9 a-z A-Z������ַ�");	
		}
		String str="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghigklmnopqrstuvwxyz";
		return str.charAt(new Random().nextInt(str.length()-1));
	}
	
	
	//��õ�һ��ֵ���ڶ���ֵ֮���subs�����ظ��������
	public static int[] getMin_MaxRandomBySubs (int min, int max, int subs,boolean  explain){
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:��õ�һ��ֵ���ڶ���ֵ֮���subs�����ظ��������\r����:"+min+"  "+max+"  "+subs);	
		}
		int[] x =new int[subs];//��������������Ž��ֵ
		
		HashSet<Integer> set = new HashSet<Integer>();
		while(set.size()!=subs) {
			set.add(getRandomInt(min, max,false));
		}
		int i=0;
		for (Integer integer : set) {	//��set���Ϸ���������
			x[i]=integer;
			i++;
		}
		return x;
		
		
	}
	//��ȡlength������ַ�
	public static String getRandomStrings(int length,boolean  explain){
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:��ȡlength������ַ�\r����:"+length);	
		}
		String str="";
		 for(int i =0 ;i<length; i++) {
			str+=  getChar(false);
		 }
		return str;
	}
	
	//��ȡ1����GB2312(�൱�����ļ���)��Χ�ڵ����ĺ����ַ���
	public static String randomChineseString(boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:��ȡ1����GB2312(�൱�����ļ���)��Χ�ڵ����ĺ����ַ���");	
		}
	        String str = null;
	        int highPos, lowPos;
	        Random random = new Random();
	        highPos = (176 + Math.abs(random.nextInt(39)));//���룬0xA0��ͷ���ӵ�16����ʼ����0xB0=11*16=176,16~55һ�����֣�56~87��������
	        random=new Random();
	        lowPos = 161 + Math.abs(random.nextInt(94));//λ�룬0xA0��ͷ����Χ��1~94��
	        byte[] bArr = new byte[2];

	        bArr[0] = (new Integer(highPos)).byteValue();
	        bArr[1] = (new Integer(lowPos)).byteValue();
	        try {
	            str = new String(bArr, "GB2312");   //��λ����ϳɺ���
	        } catch (UnsupportedEncodingException e) {
	            e.printStackTrace();
	        }
	            return str;
	    }
		

	// ��ȡlength����GB2312(�൱�����ļ���)��Χ�ڵ����ĺ����ַ���
	public static String randomChineseString(int length,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:��ȡlength����GB2312(�൱�����ļ���)��Χ�ڵ����ĺ����ַ���\r����:"+length);	
		}
		  StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			sb.append(randomChineseString(false));
			
		}
		return sb.toString();
	}

	//��ȡһ����������
	public static String getRandomChineseFirstName(boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:��ȡһ����������");	
		}
		String[] str= {"��","Ǯ","��","��","��","��","֣","��","��","��","��","��","��","��","��","��",
				"��","��","��","��","��","��","ʩ","��","��","��","��","��","��","κ","��","��","��","л",
				"��","��","��","ˮ","�","��","��","��","��","��","��","��","��","��","³","Τ","��","��",
				"��","��","��","��","��","��","Ԭ","��","ۺ","��","ʷ","��","��","��","�","Ѧ","��","��",
				"��","��","��","��","��","��","��","��","��","��","��","��","ʱ","��","Ƥ","��","��","��",
				"��","��","Ԫ","��","��","��","ƽ","��","��","��","��","��","Ҧ","��","տ","��","��","ë",
				"��","��","��","��","��","�","��","��","��","��","̸","��","é","��","��","��","��","��",
				"��","ף","��","��","��","��","��","��","ϯ","��","��","ǿ","��","·","¦","Σ","��","ͯ",
				"��","��","÷","ʢ","��","��","��","��","��","��","��","��","��","��","��","��","��","��",
				"��","��","֧","��","��","��","¬","Ī","��","��","��","��","��","��","Ӧ","��","��","��",
				"��","��","��","��","��","��","��","��","��","ʯ","��","��","ť","��","��","��","��","��",
				"��","½","��","��","��","��","�","��","��","�L","��","��","��","��","��","��","��","��",
				"��","��","��","��","��","��","��","��","��","��","��","��","ɽ","��","��","��","�","��",
				"ȫ","ۭ","��","��","��","��","��","��","��","��","��","��","��","б","��","��","��","��",
				"��","��","��","ղ","��","��","Ҷ","��","˾","��","۬","��","��","��","ӡ","��","��","��",
				"��","ۢ","��","��","��","��","��","��","׿","��","��","��","��","��","��","��","��","��",
				"��","˫","��","ݷ","��","��","̷","��","��","��","��","��","��","��","Ƚ","��","۪","Ӻ",
				"�S","�","ɣ","��","�","ţ","��","ͨ","��","��","��","��","ۣ","��","��","ũ","��","��",
				"ׯ","��","��","��","��","��","Ľ","��","��","ϰ","��","��","��","��","��","��","��","��",
				"��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","»",
				"��","��","ŷ","�","��","��","ε","Խ","��","¡","ʦ","��","��","��","��","��","��","��",
				"��","��","��","��","��","��","��","��","��","��","ɳ","ؿ","��","��","��","��","��","��",
				"��","��","��","��","��","��","��","��","Ȩ","��","��","��","��","��","��","��","��","��",
				"��","۳","Ϳ","��","��","˧","��","��","��","��","��","��","��","Ĳ","��","٦","��","��",
				"ī","��","��","��","��","��","��","١","��ٹ","˾��","�Ϲ�","ŷ��","�ĺ�","���","����",
				"����","����","�ʸ�","ξ��","����","�̨","��ұ","����","���","����","����","̫��",
				"����","����","����","��ԯ","���","����","����","����","Ľ��","����","����","˾ͽ",
				"˾��","آ��","˾��","��","��","�ӳ�","���","��ľ","����","����","���","����","����",
				"����","�ذ�","�й�","�׸�","����","�θ�","����","����","����","����","��","��","����",
				"΢��","����","����","����","����","�Ϲ�"};
		//��ȡ�������
		String firstName= str[RandomW.getRandomInt(0, str.length-1,false)];
		return firstName;
	}
	
	// ��ȡһ����������(2~4λ,������ѭ�ټ���)
	public static String getRandomChineseName(boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:��ȡlength����GB2312(�൱�����ļ���)��Χ�ڵ����ĺ����ַ���");	
		}
		
		//��ȡ�������
		String firstName= getRandomChineseFirstName(false);
		
		//��ȡ����
		String lastName = randomChineseString(RandomW.getRandomInt(1, 2,false),false);
		
		return firstName + lastName;
	}
	
	//��ȡһ��ָ�����ϵ���������
	public static String getRandomChineseNameByFirstName(String firstName,boolean  explain) {
		if(explain) {
			System.out.println(DateUtilW.getNow()+"������ʹ��:��ȡһ��ָ�����ϵ���������\r����:"+firstName);	
		}
		return firstName+RandomW.randomChineseString(RandomW.getRandomInt(1,2, false), false);
		
	}

}
