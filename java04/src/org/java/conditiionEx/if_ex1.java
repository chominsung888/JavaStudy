package org.java.conditiionEx;

import java.util.Scanner;

public class if_ex1 {
	
	
	//public -> ���? Ŭ������ ���ٰ���
	//final  -> �ѹ��� �ʱ�ȭ -> final���
	//static -> ����,����
	// static -> Ŭ���� ��� -> Ŭ������.�̸�
	public final static String ROLE1="ADMIN"; // 
	public final static String ROLE2="MEMBER";
	public final static String ROLE3="SELLER";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("if");
		//1. ������ �ϳ� �� ���
		// ����� ����   ������(ADMIN), �Ϲ�ȸ��(MEMBER), �Ǹ���(SELLER)
		System.out.println("������ ����:"+ if_ex1.ROLE1);
		System.out.println("�Ϲ�ȸ�� ����:"+ if_ex1.ROLE2);
		System.out.println("�Ǹ��� ����:"+ if_ex1.ROLE3);
		
		// �ֿܼ� ����� ������ �Է� �޾Ƽ�
		// ������ ADMIN -> "������ �������� �̵�"       �ֿܼ� ���
		// ������ MEMBER -> "�Ϲ�ȸ�� �������� �̵�"     �ܼ��� ���
		// ������ SELLER -> "�Ǹ��� �������� �̵�"       �ֿܼ� ���
		// ��� �Ǿ� �ִ� ����
		String user_ROLE ="ADMIN";
		System.out.println("�������� ����:"+user_ROLE);
		
		Scanner scn=new Scanner(System.in);
		System.out.println("���� �Է�:");
		String input_ROLE=scn.next();
		
		if(input_ROLE.equals("ADMIN")) {
			System.out.println("������ �������� �̵��մϴ�.");
		}
		if(input_ROLE.equals("MEMBER")) {
			System.out.println("�Ϲ�ȸ�� �������� �̵��մϴ�.");
			
		if(input_ROLE.equals("SELLER")) {
			System.out.println("�Ǹ��� �������� �̵��մϴ�.");
		}
			
			
		}
		
		
		
		
		
		
		
		
	}

}
