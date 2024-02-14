package org.java.controller;

import java.sql.Date;
import java.util.Scanner;

//다른 패키지에서 클래스를 조회 할 경우
//import 패키지 전체경로를 작성 해주어야 한다.
import org.java.dto.MemberDto;

public class MemberController {

	public static void main(String[] args) {
	
	MemberDto member1= new MemberDto();
	
	member1.setNo(1); //회원번호 -> 실제는 자동으로 설정(시퀀스,auto_increment)
	member1.setUserId("m111");
	member1.setUserPw("1111");
	member1.setUserName("조민성");
	member1.setUserEmail("m12@naver.com");
	member1.setPhone("011-1111-1111");
	member1.setDate(new Date(2024,2,5));
	
	System.out.println("회원번호:"+member1.getNo());
	System.out.println("회원ID:"+member1.getUserId());
	System.out.println("회원PW:"+member1.getUserPw());
	System.out.println("회원이름:"+member1.getUserName());
	System.out.println("회원이메일:"+member1.getUserEmail());
	System.out.println("회원전화:"+member1.getPhone());
	System.out.println("회원생일:"+member1.getDate());

	String info=member1.toString(); //객체 정보 조회
	System.out.println(info);
	
	
	
	MemberDto member2= new MemberDto();
	
	System.out.println("회원가입 수행 하세요");
	Scanner input=new Scanner(System.in);
	System.out.println("회원번호:");
		member2.setNo(input.nextInt());
		
	
		//id
	System.out.println("회원ID:");
	String userId2=input.next();
	member2.setUserId(userId2);
		//pw
	System.out.println("회원PW:");
	String userPw2=input.next();
	member2.setUserPw(userPw2);
		//email
	System.out.println("회원이메일:");
	String userEmail=input.next();
	member2.setUserEmail(userEmail);
		
		//전화
	System.out.println("회원전화:");
	String userphone=input.next();
	member2.setPhone(userphone);
		

	
	
	String info2=member2.toString(); //객체 정보 조회
	System.out.println(info2);
	
}
}
