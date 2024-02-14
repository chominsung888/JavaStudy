package org.java.basicApi;

import java.util.Scanner;

public class StringEx6 {
	public static void main(String[] args) {
		
	
	// Scanner 이용해서 입력값이 ".do"면 회원관리 실행(while)
	// 입력값이 "exit" -> 전체 while문 종료
	// 입력값이 .do, exit이외의 값을 입력하면 -> 다시 입력 콘솔
	
	// 안의 while문 -> ".do"면 회원관리 실행(while)
	// "/insert.do" 입력되면 -> "회원가입" 콘솔
	// "/select.do" 입력되면 -> "회원조회" 콘솔
	// "/update.do" 입력되면 -> "회원수정" 콘솔
	// "/delete.do" 입력되면 -> "회원탈퇴" 콘솔
	// "/fdsafda.do" 잘못 .do -> "다시 입력 해주세요"
	// "/exit.do" 입력되면 -> 전체 while문이 종료
	System.out.println("사용자 요청 정보 입니다.(/inset.do입력)");
	Scanner input=new Scanner(System.in);
	
	boolean bool=true;
	while(bool) {
		System.out.println("요청정보입력:");
		String order=input.next();
		System.out.println(order);
		
		if(order.equals("exit")) {
			bool=false;
		}else {
			
		}
		
		String rsOrder=order.substring(order.length()-3);
		System.out.println(rsOrder);
		
		if(rsOrder.equals(".do")) {
			
			System.out.println("요청정보->"+order);
			String url=order.substring(0,order.length()-3);
			System.out.println(".do 제외-> "+url);
			
			if(url.equals("/insert")) {
				System.out.println("회원가입");
			}else if(url.equals("/update")) {
				System.out.println("회원수정");
			}else if(url.equals("/select")) {
				System.out.println("회원조회");
			}else if(url.equals("/delete")){
				System.out.println("회원 탈퇴");
			}else
				System.out.println("URL입력오류-> 다시입력 해주세요"); {
		}
			
			
		}else if(order.equals("exit")) {
			System.out.println("서비스 종료");
			bool=false;
		}else {
			System.out.println("다시 입력 해주세요");
		}
		
		
		
		
	}

	}
}


