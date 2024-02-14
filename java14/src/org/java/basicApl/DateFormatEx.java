package org.java.basicApl;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatEx {

	public static void main(String[] args) {
		System.out.println("DateFormat");
		
		Date now =new Date();
		System.out.println(now);
		//DateFormat -> new 생성X
		
		//2.날짜 포맷
		// final로 객체 생성  -> 한번만 생성 할 수 있다.
	DateFormat df1=	DateFormat.getInstance(); // 싱글톤패턴 -> 객체를 한번만 생성하도록 프로그래밍 
	//3.포맷 <-날짜 
	System.out.println(df1.format(now));
		//getDateInstance
		//DateFormat df2=DateFormat.getDateInstance(DateFormat.FULL,Locale.KOREA);
		
		//getDateInstance DateFormat.FULL 2024년 1월 15일 월요일
		
	//	DateFormat df2=DateFormat.getDateInstance(DateFormat.LONG,Locale.KOREA);
		DateFormat df2=DateFormat.getDateInstance(DateFormat.SHORT,Locale.KOREA);
		
		System.out.println(df2.format(now));

		
	}
}
