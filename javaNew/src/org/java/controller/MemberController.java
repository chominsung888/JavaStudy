package org.java.controller;

import java.util.Scanner;

import javax.management.Query;

import org.java.service.MemberDelete;
import org.java.service.MemberDlete;
import org.java.service.MemberInsert;
import org.java.service.MemberSelect;
import org.java.service.MemberService;
import org.java.service.MemberUpdate;
import org.java.service.ShopDleteService;
import org.java.service.ShopInsertService;
import org.java.service.ShopSelect;
import org.java.service.ShopSelectsearchService;
import org.java.service.ShopUpdateService;

public class MemberController {

	public static void main(String[] args) {
		
		
		MemberService service=null;
		
		Scanner input=new Scanner(System.in);
		
		boolean bool =true;
		
		while(bool) {
			System.out.println("쿼리문 입력");

			String query = input.next();

			if (query.equals("Insert")) {
				service=new MemberInsert();
				service.excuteQueryService();
			} else if (query.equals("select")) {
				service=new MemberSelect();
			service.excuteQueryService();
			}else if (query.equals("update")) {
				service=new MemberUpdate();
				service.excuteQueryService();
			} else if (query.equals("delete")) {
				service=new MemberDelete();
				service.excuteQueryService();
			} else if (query.equals("exit")) {
				System.out.println("서비스종료");
				bool = false;
			} else {
				System.out.println("쿼리문 입력 Fail! -> 다시");
			}

		}
		}
}
