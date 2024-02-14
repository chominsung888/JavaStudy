package org.java.basicApi;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateTimeEx3 {
	
	public static void main(String[] args) {
		
		System.out.println("LocalDateTime");
		//��¥�� ���� �� �ִ�.
		LocalDateTime startDateTime =LocalDateTime.now();
		LocalDateTime endDateTime = LocalDateTime.of(2024,2,23,50,10);
		System.out.println("���س�¥: "+startDateTime);
		System.out.println("���س�¥: "+endDateTime);
		
		//���� ������?
		boolean bool =startDateTime.isBefore(endDateTime);
		System.out.println(bool);
		//���� ��¥��?
		bool =startDateTime.isEqual(endDateTime); // false
		System.out.println(bool);
		//���� ��¥��?
		bool= startDateTime.isAfter(endDateTime);
		System.out.println(bool);
		
		if (startDateTime.isAfter(endDateTime)) {
			System.out.println("���ó�¥ �����Դϴ�.");
		}else {
			System.out.println("���ó�¥ ���İ� �ƴմϴ�.");
		}
		
		ZonedDateTime utcZone = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(utcZone); //������ ���������(����)
		// AWS ->����(Asia/Seoul)
		ZonedDateTime seoulZone = ZonedDateTime.now(ZoneId.of("Asia/seoul")); //AWS ->����(Asia/seoul)
		System.out.println(seoulZone); // UTC+9 -> KST(���ѹα�ǥ�ؽ�)
		
		
		
	}
}
