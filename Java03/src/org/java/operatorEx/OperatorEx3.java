package org.java.operatorEx;

import java.util.Scanner;

public class OperatorEx3 {

	public static void main(String[] args) {
		System.out.println("�񱳿�����");
		
		int num1=30;
		int num2=20;
		
		System.out.println(num1>num2);
		System.out.println(num1>=num2);
		System.out.println(num1<num2);
		System.out.println(num1<=num2);
		System.out.println(num1==num2); // ������?
		System.out.println(num1!=num2); // ���� ����?
		// ���� �ϳ��� if���� ������ true�� ���� ������ �ȴ�.
		if(num1>num2) {
			System.out.println("num1�� num2���� Ů�ϴ�.");
		}
		
		//������ �ΰ�
		if(num1>num2) {
			System.out.println("num1�� num2���� Ů�ϴ�.");
		}else {		
			System.out.println("num1�� num2���� ũ���ʴ�.");
		}
		
		
		// ���̵� ��ġ Ȯ��
		 
		String userId="m1111";
		
		Scanner scn=new Scanner(System.in);
		System.out.println("���̵� �Է�:");
		// . ->��ü ���� ������
		String input=scn.next();
//		int rs=scn.nextInt();
		
		// ���ǹ�(if~else) .equals() ����ؼ� 
		// ���̵� ��ġ�ϸ� -> '�ߺ����̵��Դϴ�."
		// ���̵� ��ġ ���� ������ -> '���̵� ��� �� �� �ֽ��ϴ�.
		
		if(userId.equals(input)) {
			System.out.println("�ߺ����̵� �Դϴ�.");
		}else {
			System.out.println("���̵� ��� �� �� �ֽ��ϴ�.");
		}
	
		
		
		
	}
}
