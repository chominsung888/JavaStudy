package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberInsertService implements MemberService {

	@Override
	public void excuteQueryService() throws SQLException, IOException {
		
		System.out.println("ȸ������");
	
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("ȸ����ȣ:");
		int no=input.nextInt();

		System.out.println("���̵�:");
		String userId=input.next();
		
		System.out.println("��й�ȣ:");
		String userPw=input.next();

		System.out.println("�̸�:");
		String username=input.next();
		
		System.out.println("����:");
		int userage=input.nextInt();
		
		MemberDao dao=new MemberDao();
		
		int rs=dao.insert(no, userId, userPw, username, userage);
		
		if(rs!=1) {
			System.out.println("ȸ������ ����");
		}else {
			System.out.println("ȸ������ ����");
		}
		
		
		
	}

	
}
