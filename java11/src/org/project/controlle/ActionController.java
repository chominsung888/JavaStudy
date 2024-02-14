package org.project.controlle;

import java.util.*;

import org.project.service.ActionInsert;
import org.project.service.ExcuteCommend;

public class ActionController {
	
	public static void main(String[]args) {
		
	Scanner input =new Scanner(System.in);
	
	ExcuteCommend service=null;
	
	boolean bool=true
	
	boolean bool =true;
	
	while(boo1) {
		System.out.println("쿼리문을 입력하세요");
		String query=input.next();
		
		if(query.equals("insert")) {
			service=new ActionInsert();
			service.excuteQueryService();
		}else if(query.equals("select")) {
			service=new ActionSelect();
			service.excuteQueryService();
		}else if(query.equals("update")) {
			service=new ActionUpdate();
			service.excuteQueryService();
		}else if(query.equals("delete")) {
			service=new ActionDelete();
			service.excuteQueryService();
		}else if(query.equals("exit")) {
			System.out.println("while문 종료");
			bool =false;
		}else {
			System.out.println("퀄;문 입력오류...다시 입력하세요");
		}
		
	}
		
	}
}
