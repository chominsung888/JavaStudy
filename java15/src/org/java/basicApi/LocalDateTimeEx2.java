package org.java.basicApi;

import java.time.LocalDateTime;

public class LocalDateTimeEx2 {
	public static void main(String[] args) {
		System.out.println("LocalDateTime");
		
		// 현재시간
		LocalDateTime now= LocalDateTime.now();
		System.out.println(now);
		
		System.out.println(now.getYear());
		System.out.println(now.getMonth());
		System.out.println(now.getMonthValue());
		System.out.println(now.getDayOfYear());
		System.out.println(now.getDayOfMonth());
		
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		System.out.println(now.getSecond());
		System.out.println(now.getNano());
		System.out.println();
		
		
		//직접 설정
		LocalDateTime.of(2024, 2,10,12,30,30);
		System.out.println(dateTime2);
		System.out.println(now.getYear());
		System.out.println(now.getMonth());
		System.out.println(now.getMonthValue());
		System.out.println(now.getDayOfYear());
		System.out.println(now.getDayOfMonth());
		
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		System.out.println(now.getSecond());
		System.out.println(now.getNano());
	}
}
