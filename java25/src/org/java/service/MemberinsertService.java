package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberinsertService implements Memberservice {

	@Override
	public void excutQureyService() throws IOException,SQLException {
		System.out.println("ȸ������ ");
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("���̵�");
		String userId=input.next();
		
		System.out.println("��й�ȣ");
		String userPw=input.next();
		
		System.out.println("����");
		int age =input.nextInt();
		
		System.out.println("�̸�");
		String name=input.next();
		
		MemberDao dao=MemberDao.getInstance();
		
		int bool=dao.selectBool( userId);
		
		if(bool==1) {
			System.out.println("�̹� �����ϴ� ȸ�� �Դϴ�. ");
			return;
		}
		
		// �̹� �����ϸ� ȸ������ X		
		int result=dao.insert(userId, userPw, age, name);

		if(result!=1) {
			System.out.println("ȸ������ Fail");
		}else {
			System.out.println("ȸ������ Success!");
		}
		
//		if(result==1) {
//			System.out.println("ȸ������ Success!");
//		}else if(result==2){
//			System.out.println("�̹� �����ϴ� ȸ�� �Դϴ�. ");
//		}else {
//			System.out.println("ȸ������ Fail");
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
