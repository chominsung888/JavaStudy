package org.java;

import java.util.Scanner;

public class if_ex5 {

	public static void main(String[] args) {
		System.out.println("if��");
		// ������ ���̽��� ���� �Ǿ� �ִ� ���̵�, ��й�ȣ
		String dbId="root";
		String dbPw="1234";
		
		//���̵�, ��й�ȣ�� �Է� �޾Ƽ� �Ѵ� true�� ��� "�α��� ����"
		//���̵�, ��й�ȣ�� �Է� �޾Ƽ� �ϳ��� falst�� ��� "�α��� ����"
		//�ֿܼ� ���
		
		Scanner scn=new Scanner(System.in);
		System.out.println("���̵� �Է�: ");
		String userId=scn.next();
		
		System.out.println("��й�ȣ �Է�: ");
		String userPw=scn.next();
		//1. �α��� ó��
		
		if(userId.equals(dbId)&& userPw.equals(dbPw)) {
			System.out.println("�α��� ����");
		}else
			System.out.println("�α��� ����");
		//2. �α���ó��
		if(userId.equals(dbId)) {
			//���̵� ��ġ
			if(dbPw.equals(dbPw)) {
				System.out.println("�α��� ����");
				
			}else {
				System.out.println("��й�ȣ�� ��ġ ���� �ʽ��ϴ�.");
				System.out.println("�α��� ����");
			}
		}else {
			System.out.println("���̵� ��ġ ���� �ʽ��ϴ�.");
			System.out.println("�α��� ����");
			
		}
		
		// -> ����, �ΰ� -> �����ӿ�ũȭ ��Ŵ -> Spring Security
		// �α��� ����, ����(ROLE), oAuth2.0
		
		
	}
}
