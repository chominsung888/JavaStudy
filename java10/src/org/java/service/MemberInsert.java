package org.java.service;

import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberInsert extends MemberService {
	public int d;
	@Override
	public void excuteQueryService() {
		System.out.println("ȸ������");
		//DB-> ȸ�� ������ �Է� �޾Ƽ� ������ ���̽��� ���� -> DAO
		MemberDao dao=new MemberDao();
		Scanner input=new Scanner(System.in);
		
		System.out.print("ȸ����ȣ:");
		int no=input.nextInt();//ȸ����ȣ
		
		System.out.print("ȸ�����̵�:");
		String userId=input.next();
		
		System.out.print("ȸ�� ��й�ȣ:");
		String userPw=input.next();
		
		System.out.print("ȸ���̸�:");
		String name=input.next();
		
		System.out.println("��ȭ��ȣ:");
		String phone=input.next();
		
		
		
		
		
		int no=0; //ȸ�� ��ȣ
		String userId=null; //ȸ�����̵�
		String userPw=null; //ȸ����й�ȣ
		String name=null; //ȸ���̸�
		String phone=null; //��ȭ��ȣ
		
		
		
		// ��ȯ���� 1�̸� ȸ������ ����,  1�� �ƴϸ� �̸� ȸ������ ����
		int result=dao.insert(no,userId,userPw,name,phone);
		
		if(result==1) {
			System.out.println("ȸ������ ����");
		}else {
			System.out.println("ȸ������ ����");
		
	}
}
}
