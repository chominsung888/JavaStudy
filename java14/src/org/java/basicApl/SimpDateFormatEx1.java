package org.java.basicApl;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpDateFormatEx1 {

	public static void main(String[] args) {
		System.out.println("SimpldateFormatEx");
		// JSP -> 날짜를 표시 할 때 자주 사용
		//1.날짜
		Date date1=new Date();
		//2.포맷
		SimpleDateFormat df1= new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
		
		String day1= df1.format(date1);
		System.out.println(day1);
		
		SimpleDateFormat df2=new SimpleDateFormat("yyy년-MM월-dd일 hh시mm분ss초");
		String day2 = df2.format(date1);
		System.out.println(day2);
		//1900년도를 뺴주기  월은 0부터 시작한다.
		Date date3 = new Date(124, 0,15,17,10,10);
		System.out.println(date3);
		SimpleDateFormat df3=new SimpleDateFormat("yy/M/d HH/mm/ss");
		
		String day3= df2.format(date3);
		System.out.println(day3);
	}
}
