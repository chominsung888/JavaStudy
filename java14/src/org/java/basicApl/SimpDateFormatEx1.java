package org.java.basicApl;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpDateFormatEx1 {

	public static void main(String[] args) {
		System.out.println("SimpldateFormatEx");
		// JSP -> ��¥�� ǥ�� �� �� ���� ���
		//1.��¥
		Date date1=new Date();
		//2.����
		SimpleDateFormat df1= new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
		
		String day1= df1.format(date1);
		System.out.println(day1);
		
		SimpleDateFormat df2=new SimpleDateFormat("yyy��-MM��-dd�� hh��mm��ss��");
		String day2 = df2.format(date1);
		System.out.println(day2);
		//1900�⵵�� ���ֱ�  ���� 0���� �����Ѵ�.
		Date date3 = new Date(124, 0,15,17,10,10);
		System.out.println(date3);
		SimpleDateFormat df3=new SimpleDateFormat("yy/M/d HH/mm/ss");
		
		String day3= df2.format(date3);
		System.out.println(day3);
	}
}
