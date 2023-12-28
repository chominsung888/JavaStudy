package org.java.operatorEx;

public class OperatorEx5 {

	public static void main(String[] args) {
		System.out.println("논리연산자");
		System.out.println("&&");
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);
		
		System.out.println("||"); //조건이 하나이상 true 이상 true
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		
		System.out.println("^"); // 서로 다르면 true
		System.out.println(true^true); // 서로 다르면 true
		System.out.println(true^false); // 서로 다르면 true
		System.out.println(false^false); // 서로 다르면 true
		System.out.println(false^true); // 서로 다르면 true
		System.out.println(false^false); // 서로 다르면 true
		
		System.out.println("!"); // 반대 toggle ->스위치
		System.out.println(!true);
		System.out.println(!false);
		
		// 아이디와 비밀번호가 일치하면 로그인 성공 일치 하지 않으면 로그인 실패
		
		String userId="m1111";
		String userPw="1111";
		
		System.out.println(userId.equals("m1111"));
		System.out.println(userPw.equals("1111"));
		
		System.out.println(userId.equals("m1111") && userPw.equals("1111"));
		
		if(userId.equals("m1111") && userPw.equals("1111")) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		
		
	}
}
