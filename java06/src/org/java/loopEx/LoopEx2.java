package org.java.loopEx;

import java.util.Scanner;

public class LoopEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ݺ���");
		
		// 1~10 �߿��� ¦���� �ֿܼ� ��� -> for��
		
		for(int i=0;i<20; i++) {
			int i2=i+3;
			/*1. if~else
			if(i2%2==2) {
				System.out.println("¦��:"+i2);
			}else {
			
			System.out.println("Ȧ��:"+i2);
		}
			 2. continue */
			if(i2%2!=0) {
				System.out.println("Ȧ��:"+i2);
				continue;
			}

	}//continue
		System.out.println("while");
		Scanner scn=new Scanner(System.in);
		
		//������ �Է��ϸ� ADMIN�Է��ϸ� -> "����� ������ ADMIN�Դϴ�." ���
		//exit�Է��ϸ� while�� ����
		//�� ���� �� exit �̿��� ���ڿ��� �Է��ϸ� -> "�ٽ� �Է��� �ּ���" ���
		// while�� �̿��ؼ� �ۼ�, ���ǹ�-> switch,if
		
		while(true) {
			System.out.println("������ �Է��ϼ��� (ADMIN,MEMBER,SELLER)");
			String user_ROLE=scn.next();
			
			if(user_ROLE.equals("ADMIN")) {
				System.out.println("����� ������ ADMIN�Դϴ�.");
			}else if(user_ROLE.equals("MEMBER")) {
				System.out.println("����� ������ MEMBER�Դϴ�.");
			}else if(user_ROLE.equals("SELLER"));{
				System.out.println("����� ������ SELLER�Դϴ�.");
			}else if(user_ROLE.equals("exit"));{
				System.out.println("�����մϴ�.");
				break;
			}else {
				System.out.println("�ٽ� �Է����ּ���");
			
		}
		
	}
	scn.close();
	System.out.println("main����");
}
}
