package org.java.conditiionEx;

import java.util.Scanner;

public class if_ex1 {
	
	
	//public -> 어느? 클래스든 접근가능
	//final  -> 한번만 초기화 -> final상수
	//static -> 공유,정적
	// static -> 클래스 멤버 -> 클래스명.이름
	public final static String ROLE1="ADMIN"; // 
	public final static String ROLE2="MEMBER";
	public final static String ROLE3="SELLER";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("if");
		//1. 조건이 하나 일 경우
		// 사용자 권한   관리자(ADMIN), 일반회원(MEMBER), 판매자(SELLER)
		System.out.println("관리자 권한:"+ if_ex1.ROLE1);
		System.out.println("일반회원 권한:"+ if_ex1.ROLE2);
		System.out.println("판매자 권한:"+ if_ex1.ROLE3);
		
		// 콘솔에 사용자 권한을 입력 받아서
		// 권한이 ADMIN -> "관리자 페이지로 이동"       콘솔에 출력
		// 권한이 MEMBER -> "일반회원 페이지로 이동"     콘술에 출력
		// 권한이 SELLER -> "판매자 페이지로 이동"       콘솔에 출력
		// 등록 되어 있는 권한
		String user_ROLE ="ADMIN";
		System.out.println("접속자의 권한:"+user_ROLE);
		
		Scanner scn=new Scanner(System.in);
		System.out.println("권한 입력:");
		String input_ROLE=scn.next();
		
		if(input_ROLE.equals("ADMIN")) {
			System.out.println("관리자 페이지로 이동합니다.");
		}
		if(input_ROLE.equals("MEMBER")) {
			System.out.println("일반회원 페이지로 이동합니다.");
			
		if(input_ROLE.equals("SELLER")) {
			System.out.println("판매자 페이지로 이동합니다.");
		}
			
			
		}
		
		
		
		
		
		
		
		
	}

}
