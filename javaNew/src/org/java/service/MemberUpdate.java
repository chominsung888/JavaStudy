package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class MemberUpdate implements MemberService{

	@Override
	public void excuteQueryService() throws IOException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("ȸ������");
		
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
		//->ȸ�� ��ȣ(�⺻Ű) ȸ���� �̹� �ִ��� Ȯ��
		int isMember= dao.isNoCheked(no);
		
		if(isMember==0) {
			System.out.println("���� �� ȸ���� �����ϴ�.");
			return;
		}
		//���� �� ȸ���� ���� ��� 
		
		int result=dao.update(no, userId,userPw,age,name);
		
		if(result !=1) {
			System.out.println("ȸ������ Fail");
		}else {
			System.out.println("ȸ������ Success!");
		}
	}

}
