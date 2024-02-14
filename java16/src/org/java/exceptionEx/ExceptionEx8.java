package org.java.exceptionEx;

public class ExceptionEx8 {

	public static void main(String[] args) {
		
		System.out.println("Exception");
		
		String userId=null;
			
		try {
			System.out.println("예외를 던졌다.");
//			Exception e=new Exception("예외 발생");
//			throw e;
			
			//throw new Exception("에러 메세지");
			//1.회원가입 2.로그인 3.아이디체크 4.검색
//			System.out.println("정상실행");
			if(userId==null) //  일치 하느냐?
			throw new IllegalAccessError("아이디가 없습니다"); 
	// System.out.println("정상실행");		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally");
		}
		System.out.println("정상 종료");
		
		
		
		
	}
}
