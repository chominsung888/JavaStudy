package org.java;

import java.util.Scanner;

public class if_ex5 {

	public static void main(String[] args) {
		System.out.println("if문");
		// 데이터 베이스에 저장 되어 있는 아이디, 비밀번호
		String dbId="root";
		String dbPw="1234";
		
		//아이디, 비밀번호를 입력 받아서 둘다 true일 경우 "로그인 성공"
		//아이디, 비밀번호를 입력 받아서 하나라도 falst일 경우 "로그인 실패"
		//콘솔에 출력
		
		Scanner scn=new Scanner(System.in);
		System.out.println("아이디 입력: ");
		String userId=scn.next();
		
		System.out.println("비밀번호 입력: ");
		String userPw=scn.next();
		//1. 로그인 처리
		
		if(userId.equals(dbId)&& userPw.equals(dbPw)) {
			System.out.println("로그인 성공");
		}else
			System.out.println("로그인 실패");
		//2. 로그인처리
		if(userId.equals(dbId)) {
			//아이디 일치
			if(dbPw.equals(dbPw)) {
				System.out.println("로그인 성공");
				
			}else {
				System.out.println("비밀번호가 일치 하지 않습니다.");
				System.out.println("로그인 실패");
			}
		}else {
			System.out.println("아이디가 일치 하지 않습니다.");
			System.out.println("로그인 실패");
			
		}
		
		// -> 인증, 인가 -> 프레임워크화 시킴 -> Spring Security
		// 로그인 정보, 권한(ROLE), oAuth2.0
		
		
	}
}
