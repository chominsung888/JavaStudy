package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberInsertService implements Memberservice {

	@Override
	public void excutQureyService() throws IOException, SQLException {
		System.out.println("ȸ������");
		
		
		//�̱���
	MemberDao dao=	MemberDao.getInstance();
	Scanner input=new Scanner(System.in);
	System.out.println("���̵�:");
	String userId=input.next();
	
	System.out.println("��й�ȣ:");
	String userPw=input.next();

	System.out.println("����:");
	int age=input.nextInt();
	
	System.out.println("�̸�:");
	String name=input.next();
	
	int result =dao.insert(userId, userPw,age, name);
	
	if(result !=1) {
		System.out.println("ȸ������ Fail!");
	}else {
		System.out.println("ȸ������ Success!");
	}
	
	
	}

	
}
