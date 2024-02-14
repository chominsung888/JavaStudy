package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class MemberInsert implements MemberService{

	@Override
	public void excuteQueryService() throws IOException, SQLException {
		System.out.println("회원등록");
		
Scanner input= new Scanner(System.in);

		System.out.println("회원번호");//123,,,
		int no=input.nextInt();
		
		System.out.println("아이디");
		String userId=input.next();
		
		System.out.println("비밀번호");
		String userPw=input.next();
		
		System.out.println("나이");
		int age =input.nextInt();
		
		System.out.println("이름");
		String name=input.next();
		
		
		//회원이 있는지 없는지 먼저 확인 -> 아이디로 회원이 이미 있는지 확인 
		
		int isMember= dao.isUserIdChekd(userId);
		
		if(isMember==1) {
			System.out.println("이미 회원이 존재 한다.");
			return;
		}
		
		int result=dao.insert(no, userId,userPw,age,name);
		
	}

}
