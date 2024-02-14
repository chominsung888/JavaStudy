package org.java.basicApi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateEx {

	public static void main(String[] args) {
		// 1.날짜 생성

		Date date = new Date();
		date.getYear();// 1900+
		date.getMonth();// 월-> 0~
		date.getDay();// 요일 -> 일요일이 0
		// SimpleDateFormat
		// 2. 날짜포맷 설정
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String day1 = sf.format(date); // String
		System.out.println(day1);

		// DateFormat

		DateFormat df1 = DateFormat.getInstance(); // 객체를 한번만 생성할 수 있다.-> 싱글톤 패턴
		String day2 = df1.format(date);
		System.out.println(day2);

		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, Locale.KOREA);
		String day3 = df2.format(date);
		System.out.println(day3);

		DateFormat df3 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.KOREA);
		String day4 = df3.format(date);
		System.out.println(day4);
	}
}
