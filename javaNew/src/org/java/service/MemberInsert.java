package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class MemberInsert implements MemberService{

	@Override
	public void excuteQueryService() throws IOException, SQLException {
		System.out.println("ȸ�����");
		
Scanner input= new Scanner(System.in);

		System.out.println("ȸ����ȣ");//123,,,
		int no=input.nextInt();
		
		System.out.println("���̵�");
		String userId=input.next();
		
		System.out.println("��й�ȣ");
		String userPw=input.next();
		
		System.out.println("����");
		int age =input.nextInt();
		
		System.out.println("�̸�");
		String name=input.next();
		
		
		//ȸ���� �ִ��� ������ ���� Ȯ�� -> ���̵�� ȸ���� �̹� �ִ��� Ȯ�� 
		
		int isMember= dao.isUserIdChekd(userId);
		
		if(isMember==1) {
			System.out.println("�̹� ȸ���� ���� �Ѵ�.");
			return;
		}
		
		int result=dao.insert(no, userId,userPw,age,name);
		
	}

}
