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
		
		
		// 아이디 와 비밀번호를 입력 받아서 
		// 입력받은 아이디가 dbId와 입력받은 비밀번호가 dbPw가 동시에 일치 하면
		// 콘솔에 "로그인 성공" 실패 하면 "로그인 실패"가 출력 되도록 프로그래밍 하시오.
		// scanner , equlas , && , if~else문 을 활용하여 작성하시오.
		// 입력 받은 값을 변수명은 임의로 작성
		String dbId="green";
		String dbPw="1111";
		
		System.out.println(dbId.equals("green"));
		System.out.println(dbPw.equals("1111"));
		
		System.out.println(dbId.equals("green") && dbPw.equals("1111"));
		
		if(dbId.equals("green")&& dbPw.equals("1111")) 
		if(dbId.equals("Yellow")&& dbPw.equals("3333")) {	
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		
		
		
		
		
		
	}
}
