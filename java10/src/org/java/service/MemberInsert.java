package org.java.service;

import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberInsert extends MemberService {
	public int d;
	@Override
	public void excuteQueryService() {
		System.out.println("회원가입");
		//DB-> 회원 정보를 입력 받아서 데이터 베이스에 저장 -> DAO
		MemberDao dao=new MemberDao();
		Scanner input=new Scanner(System.in);
		
		System.out.print("회원번호:");
		int no=input.nextInt();//회원번호
		
		System.out.print("회원아이디:");
		String userId=input.next();
		
		System.out.print("회원 비밀번호:");
		String userPw=input.next();
		
		System.out.print("회원이름:");
		String name=input.next();
		
		System.out.println("전화번호:");
		String phone=input.next();
		
		
		
		
		
		int no=0; //회원 번호
		String userId=null; //회원아이디
		String userPw=null; //회원비밀번호
		String name=null; //회원이름
		String phone=null; //전화번호
		
		
		
		// 반환값이 1이면 회원가입 성공,  1이 아니면 이면 회원가입 실패
		int result=dao.insert(no,userId,userPw,name,phone);
		
		if(result==1) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("회원가입 실패");
		
	}
}
}
