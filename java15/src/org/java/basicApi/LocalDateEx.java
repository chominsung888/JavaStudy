package org.java.basicApi;

import java.time.LocalDate;
import java.util.Date;

public class LocalDateEx {

	public static void main(String[] args) {
		System.out.println("LocalDate");
		//날짜만
		// 싱글톤 패턴 -> 한번만 객체를 생성 하는 방식
	LocalDate date1=LocalDate.now(); //오늘날짜
	
	System.out.println("LocalDate.now() ->"+date1);
		System.out.println(date1);
		System.out.println(date1.getMonth());//1
		System.out.println(date1.getMonthValue()); //1
		System.out.println(date1.getDayOfYear());// 16/365 2월1일 ->32
		System.out.println(date1.getDayOfMonth()); //1월16일 2월1일-> 1
		System.out.println(date1.getDayOfWeek()); //TUESDay
		System.out.println(date1.isLeapYear());
		
		//직접 추가
		
		LocalDate date2=LocalDate.of(2024,2,1); //오늘날
		System.out.println(date2);
		System.out.println(date2.getMonth());//1
		System.out.println(date2.getMonthValue()); //1
		System.out.println(date2.getDayOfYear());// 16/365 2월1일 ->32
		System.out.println(date2.getDayOfMonth()); //1월16일 2월1일-> 1
		System.out.println(date2.getDayOfWeek()); //TUESDay
		System.out.println(date2.isLeapYear());
		
		
		
		
		
		
		
	}
}
