package org.java.scannerEx;

// �ٸ� ��Ű������ Ŭ������ ���� �� �� �ݵ�� 
// import ��Ű��.Ŭ����; ���� �ؾߵȴ�.
import java.util.Scanner;

/* 	java.lang ��Ű�� -. �ڹ��� �⺻ ��Ű��
 	��. java.lang ��Ű���� �ڵ����� import�ȴ�.
 	import���� ���� �� �� �ִ�.
 	import java.lang.System;
*/
public class ScannerEx1 {

	public static void main(String[] args) {
		System.out.println("Scanner");
		//���α׷��Ӱ� ���� �Է�
		Scanner scn=new Scanner(System.in); // �ý��� �Է�(�ֿܼ� �Է�)
		System.out.println("�ּҸ� �Է��ϼ���");
		String addr=scn.nextLine(); //�Է� ���� ����-> enter -> String
		
		System.out.println("�ּ�:"+addr);
		
		System.out.print("�̸��� �Է��ϼ��� ->");
		String name=scn.next();
		System.out.println("�̸�:"+name);
		
		System.out.print("���̸� �Է��ϼ��� :");
		int age=scn.nextInt(); // int������ �Է�
		System.out.println("����:"+age);
		
		System.out.print("Ű�� �Է��ϼ���:");
		double hei=scn.nextDouble();
		System.out.println("Ű:"+hei);
		
		
	}
}
