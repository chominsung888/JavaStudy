package org.java.basicApi;

import java.time.LocalDate;
import java.util.Date;

public class LocalDateEx {

	public static void main(String[] args) {
		System.out.println("LocalDate");
		//��¥��
		// �̱��� ���� -> �ѹ��� ��ü�� ���� �ϴ� ���
	LocalDate date1=LocalDate.now(); //���ó�¥
	
	System.out.println("LocalDate.now() ->"+date1);
		System.out.println(date1);
		System.out.println(date1.getMonth());//1
		System.out.println(date1.getMonthValue()); //1
		System.out.println(date1.getDayOfYear());// 16/365 2��1�� ->32
		System.out.println(date1.getDayOfMonth()); //1��16�� 2��1��-> 1
		System.out.println(date1.getDayOfWeek()); //TUESDay
		System.out.println(date1.isLeapYear());
		
		//���� �߰�
		
		LocalDate date2=LocalDate.of(2024,2,1); //���ó�
		System.out.println(date2);
		System.out.println(date2.getMonth());//1
		System.out.println(date2.getMonthValue()); //1
		System.out.println(date2.getDayOfYear());// 16/365 2��1�� ->32
		System.out.println(date2.getDayOfMonth()); //1��16�� 2��1��-> 1
		System.out.println(date2.getDayOfWeek()); //TUESDay
		System.out.println(date2.isLeapYear());
		
		
		
		
		
		
		
	}
}
