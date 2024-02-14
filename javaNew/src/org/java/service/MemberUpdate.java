package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class MemberUpdate implements MemberService{

	@Override
	public void excuteQueryService() throws IOException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("회원수정");
		
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
		//->회원 번호(기본키) 회원이 이미 있는지 확인
		int isMember= dao.isNoCheked(no);
		
		if(isMember==0) {
			System.out.println("수정 할 회원이 없습니다.");
			return;
		}
		//수정 할 회원이 있을 경우 
		
		int result=dao.update(no, userId,userPw,age,name);
		
		if(result !=1) {
			System.out.println("회원수정 Fail");
		}else {
			System.out.println("회원수정 Success!");
		}
	}

}
