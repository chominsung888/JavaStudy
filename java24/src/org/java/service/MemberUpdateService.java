package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberUpdateService implements Memberservice {

	@Override
	public void excutQureyService() throws IOException, SQLException {
		System.out.println("회원수정");
		
		//싱글톤
		MemberDao dao=	MemberDao.getInstance();
		Scanner input=new Scanner(System.in);
		System.out.println("아이디:");
		String userId=input.next();
		
		System.out.println("비밀번호:");
		String userPw=input.next();

		System.out.println("나이:");
		int age=input.nextInt();
		
		System.out.println("이름:");
		String name=input.next();
		
		int result =dao.update(userId, userPw,age, name);
		
		if(result !=1) {
			System.out.println("회원수정 Fail!");
		}else {
			System.out.println("회원수정 Success!");
		}
		

	}

}
