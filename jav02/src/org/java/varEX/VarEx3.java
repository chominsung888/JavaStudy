package org.java.varEX;

public class VarEx3 {

	public static void main(String[] args) {
		
		System.out.println("변수명 규칙");
		
		//키워드(예약어) -> 사용하기로 약속 된
//		int int;
//		int char;
		// 숫자로 시작하지 않는다.
//		int 1var;
		// 공백을 허용하지 않는다.
//		int var 1;
		// 특수기호 _ $만 허용
		int _var=10;
		int var$4=10;
		int var_01=10;
//		int var%1;
//		int $&dd;
		
		//	대소문자 구별
		int Var1=10;
		int var1=20;
					// 변수+"문자열"+변수
		System.out.println(Var1+","+var1);
		
		//변수는 소문자로 시작하기를 권한다.
		int amazon =10;
		
		// 의미 있는 변수명이 중복되면 첫번째 문자는 소문자
		// 두번째 문자열의 시작은 대문자로 설정한다. (권한다.)
		// 카멜 케이스 (camel case) 
		
		int varNumber=10;
		int maxNumber=10;
		int maxNumberTopAndBottomMiddle=100;
		
		// 한글명은 권하지 않는다.
		int 한글 = 100;
		System.out.println(한글);
		
		
	}

}
