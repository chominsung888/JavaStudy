package org.java.basicApl;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatEx {

	public static void main(String[] args) {
		System.out.println("DateFormat");
		
		Date now =new Date();
		System.out.println(now);
		//DateFormat -> new ����X
		
		//2.��¥ ����
		// final�� ��ü ����  -> �ѹ��� ���� �� �� �ִ�.
	DateFormat df1=	DateFormat.getInstance(); // �̱������� -> ��ü�� �ѹ��� �����ϵ��� ���α׷��� 
	//3.���� <-��¥ 
	System.out.println(df1.format(now));
		//getDateInstance
		//DateFormat df2=DateFormat.getDateInstance(DateFormat.FULL,Locale.KOREA);
		
		//getDateInstance DateFormat.FULL 2024�� 1�� 15�� ������
		
	//	DateFormat df2=DateFormat.getDateInstance(DateFormat.LONG,Locale.KOREA);
		DateFormat df2=DateFormat.getDateInstance(DateFormat.SHORT,Locale.KOREA);
		
		System.out.println(df2.format(now));

		
	}
}
