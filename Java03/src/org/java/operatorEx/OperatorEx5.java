package org.java.operatorEx;

import java.util.Scanner;

public class OperatorEx5 {

	public static void main(String[] args) {
	
		
		// 아이디 와 비밀번호를 입력 받아서 
		// 입력받은 아이디가 dbId와 입력받은 비밀번호가 dbPw가 동시에 일치 하면
		// 콘솔에 "로그인 성공" 실패 하면 "로그인 실패"가 출력 되도록 프로그래밍 하시오.
		// scanner , equlas , && , if~else문 을 활용하여 작성하시오.
		// 입력 받은 값을 변수명은 임의로 작성
		String dbId="green";
		String dbPw="1111";
		
		Scanner scn=new Scanner(System.in);
		
		System.out.print("아이디 입력:");
		String userId=scn.next(); //return(반환) -> 문자열 반환
		
		System.out.print("비밀번호 입력:");
		String userPw=scn.next();
		
		if(userId.equals(dbId) && userPw.equals(dbPw)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
			
		}
	}
		
}
