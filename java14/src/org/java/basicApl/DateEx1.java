package org.java.basicApl;

import java.util.Date;

public class DateEx1 {
	public static void main(String[] args) {
		System.out.println("Date");
		
		Date date=new Date(); //KST,Korea Standard Time
		System.out.println(date);
		System.out.println(date.getYear()+1900); //1900+124 ->2024
		System.out.println(date.getMonth()); // ��(0���� ����) ��+1
		System.out.println(date.getDate()); //��
		System.out.println(date.getMinutes()); //��
		System.out.println(date.getSeconds());// ��
		System.out.println(date.getDay());// ���� -> �Ͽ��� 0
		
		int year=date.getYear()+1900;
		int month=date.getMonth()+1;//01234~ 11
		int day=date.getDate();
		int hour=date.getHours();
		int minutes=date.getMinutes();
		int second=date.getSeconds();
		int key=date.getDay();// ���� 0(��) 1(��),,,,6(��)
		
		String week="";
		
		switch(key) {
				case 0:
					week="�Ͽ���";
					break;
				case 1:
					week="������";
					break;
				case 2:
					week="ȭ����";
					break;
				case 3:
					week="������";
					break;
				case 4:
					week="�����";
					break;
				case 5:
					week="�ݿ���";
					break;
				case 6:
					week="�����";
					break;
				default:
					System.out.println("�Է¿���");
		
		}
		//����ð�: �� �� �� �� �� �� ����(switch) �ֿܼ� ���
		System.out.println(year+"�� "+month+"�� "+day+"�� "+hour+"�� "+minutes+"�� "+second+"�� "+week);
		
		
	}
}
