package org.java.basicApi;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateTimeEx3 {
	
	public static void main(String[] args) {
		
		System.out.println("LocalDateTime");
		//날짜를 비교할 수 있다.
		LocalDateTime startDateTime =LocalDateTime.now();
		LocalDateTime endDateTime = LocalDateTime.of(2024,2,23,50,10);
		System.out.println("기준날짜: "+startDateTime);
		System.out.println("기준날짜: "+endDateTime);
		
		//이전 날씨냐?
		boolean bool =startDateTime.isBefore(endDateTime);
		System.out.println(bool);
		//같은 날짜냐?
		bool =startDateTime.isEqual(endDateTime); // false
		System.out.println(bool);
		//이후 날짜냐?
		bool= startDateTime.isAfter(endDateTime);
		System.out.println(bool);
		
		if (startDateTime.isAfter(endDateTime)) {
			System.out.println("선택날짜 이후입니다.");
		}else {
			System.out.println("선택날짜 이후가 아닙니다.");
		}
		
		ZonedDateTime utcZone = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(utcZone); //전세계 협정세계시(영국)
		// AWS ->리전(Asia/Seoul)
		ZonedDateTime seoulZone = ZonedDateTime.now(ZoneId.of("Asia/seoul")); //AWS ->리전(Asia/seoul)
		System.out.println(seoulZone); // UTC+9 -> KST(대한민국표준시)
		
		
		
	}
}
