package org.project.service;

import java.util.Scanner;

public class MemberController {

	public static void main(String[] args) {

	
	MemberService service=null;
	
	// Scanner이용// 쿼리문 입력 하세요
	// insert입력 하면ActionInsert   excuteQuery()  실행   ->콘솔에 “회원가입”
	// select입력 하면 ActionUpdate   excuteQuery()  실행>콘솔에 “회원조회”
	// update입력 하면 ActionDelete   excuteQuery()  실행->콘솔에 “회원수정”
	// delete입력 하면 ActionSelect   excuteQuery()  실행 ->콘솔에 “회원탈퇴
	// exit입력하면 종료
	// 다른 쿼리문 입력하면 다시 입력 하세요 -> 처음부터 다시 시작(while) 
	Scanner scanner = new Scanner(System.in);
	
	while (true) {
        System.out.println("Enter a query (insert/select/update/delete/exit): ");
        String query = scanner.nextLine().toLowerCase();
      switch(query) {
      case "insert":
    	  new ActionInsert().excuteQueryService();
    	  System.out.println("회원가입");
    	  break;
    	  
      case "select":
    	  new ActionSelect().excuteQueryService();
    	  System.out.println("회원조회");
    	  break;
    
      case "update":
    	  new ActionUpdate().excuteQueryService();
    	  System.out.println("회원수정");
    	  break;
      case "delete":
    	  new ActionExit().excuteQuertService();
    	  break;
    	  
      case "exit":
    	  System.out.println("exit를 입력하면 프로그램 종료");
    	  System.exit(0);
    	  break;
    	 
      }
	}
	
	
	
	}
}
