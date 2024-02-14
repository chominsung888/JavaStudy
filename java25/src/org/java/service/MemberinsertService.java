package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberinsertService implements Memberservice {

	@Override
	public void excutQureyService() throws IOException,SQLException {
		System.out.println("회원가입 ");
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("아이디");
		String userId=input.next();
		
		System.out.println("비밀번호");
		String userPw=input.next();
		
		System.out.println("나이");
		int age =input.nextInt();
		
		System.out.println("이름");
		String name=input.next();
		
		MemberDao dao=MemberDao.getInstance();
		
		int bool=dao.selectBool( userId);
		
		if(bool==1) {
			System.out.println("이미 존재하는 회원 입니다. ");
			return;
		}
		
		// 이미 존재하면 회원가입 X		
		int result=dao.insert(userId, userPw, age, name);

		if(result!=1) {
			System.out.println("회원가입 Fail");
		}else {
			System.out.println("회원가입 Success!");
		}
		
//		if(result==1) {
//			System.out.println("회원가입 Success!");
//		}else if(result==2){
//			System.out.println("이미 존재하는 회원 입니다. ");
//		}else {
//			System.out.println("회원가입 Fail");
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
