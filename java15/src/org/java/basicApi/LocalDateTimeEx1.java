package org.java.basicApi;

import java.time.LocalDateTime;

public class LocalDateTimeEx1 {
	public static void main(String[] args) {
		System.out.println("LocalDateTime");
		// ��¥ ,�ð�
		
		//���� �ð�
		LocalDateTime now =LocalDateTime.now();
		System.out.println("LocalDateTime.now()->"+now);
		
		LocalDateTime now2 =LocalDateTime.now();
		System.out.println("LocalDateTime.now()->"+now2);
		
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
