package org.java.controller;

import java.sql.Date;
import java.util.Scanner;

//�ٸ� ��Ű������ Ŭ������ ��ȸ �� ���
//import ��Ű�� ��ü��θ� �ۼ� ���־�� �Ѵ�.
import org.java.dto.MemberDto;

public class MemberController {

	public static void main(String[] args) {
	
	MemberDto member1= new MemberDto();
	
	member1.setNo(1); //ȸ����ȣ -> ������ �ڵ����� ����(������,auto_increment)
	member1.setUserId("m111");
	member1.setUserPw("1111");
	member1.setUserName("���μ�");
	member1.setUserEmail("m12@naver.com");
	member1.setPhone("011-1111-1111");
	member1.setDate(new Date(2024,2,5));
	
	System.out.println("ȸ����ȣ:"+member1.getNo());
	System.out.println("ȸ��ID:"+member1.getUserId());
	System.out.println("ȸ��PW:"+member1.getUserPw());
	System.out.println("ȸ���̸�:"+member1.getUserName());
	System.out.println("ȸ���̸���:"+member1.getUserEmail());
	System.out.println("ȸ����ȭ:"+member1.getPhone());
	System.out.println("ȸ������:"+member1.getDate());

	String info=member1.toString(); //��ü ���� ��ȸ
	System.out.println(info);
	
	
	
	MemberDto member2= new MemberDto();
	
	System.out.println("ȸ������ ���� �ϼ���");
	Scanner input=new Scanner(System.in);
	System.out.println("ȸ����ȣ:");
		member2.setNo(input.nextInt());
		
	
		//id
	System.out.println("ȸ��ID:");
	String userId2=input.next();
	member2.setUserId(userId2);
		//pw
	System.out.println("ȸ��PW:");
	String userPw2=input.next();
	member2.setUserPw(userPw2);
		//email
	System.out.println("ȸ���̸���:");
	String userEmail=input.next();
	member2.setUserEmail(userEmail);
		
		//��ȭ
	System.out.println("ȸ����ȭ:");
	String userphone=input.next();
	member2.setPhone(userphone);
		

	
	
	String info2=member2.toString(); //��ü ���� ��ȸ
	System.out.println(info2);
	
}
}
