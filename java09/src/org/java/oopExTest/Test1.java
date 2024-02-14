package org.java.oopExTest;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Register member1 =new Register();
		
		Scanner input=new Scanner(System.in);
		
		boolean bool=false;
		
		while(!bool) {
			System.out.println("회원가입을 실행 하시겠습니까?"
					+ "\n while문 종료는 exit, 회원 가입 실행은 yes,회원가입 종료 no");
			String order=input.next();
			if(order.equals("yes")) {
				System.out.println("회원가입 실행 0");
				// 아이디, 비밀번호, 나이 입력하고
				// 아이디, 비밀번호, 나이 입력하고 콘솔에 id: m11, password:m11, age:11 출력하고
				// setters,getters 이용, toString 이용
				// 다시 처음으로 돌아가도록 작성해보세요.
				
				System.out.println("아이디 입력:");
				String userId=input.next();
				member1.setId(userId);
				
				System.out.println("비밀번호 입력:");
				String password=input.next();
				member1.setPassword(password);
				
				System.out.println("나이 입력:");
				int age=input.nextInt();
				member1.setAge(age);
				
				

				System.out.println();
				String info=member1.toString();
				System.out.println(info);
				
				
			}else if(order.equals("no")) {
				System.out.println("회원가입 실행 X,다른 작업-> ");
			}else if(order.equals("exit")) {
				System.out.println("while종료");
				bool=false; //true -> false
				
				
			}else {
				System.out.println("입력값 오류-> 다시 입력 하세요");
			}
			
			
		}
	
		input.close();
	}
	
}
