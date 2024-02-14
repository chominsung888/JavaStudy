package org.java.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;


import org.java.service.ShopDleteService;
import org.java.service.ShopInsertService;
import org.java.service.ShopSelect;
import org.java.service.ShopSelectsearchService;
import org.java.service.ShopSeriver;
import org.java.service.ShopUpdateService;

public class ShopController {

	public static void main(String[] args) throws IOException, SQLException {
		System.out.println("Controllter-> shop");
	
	ShopSeriver service=null;
	
	Scanner input=new Scanner(System.in);
	
	boolean bool = true;

	while (bool) {

		System.out.println("쿼리문 입력");

		String query = input.next();

		if (query.equals("sInsert")) {
			service=new ShopInsertService();
			service.excuteQueryService();
		} else if (query.equals("sselect")) {
			service=new ShopSelect();
			service.excuteQueryService();
			
		} else if (query.equals("sSelectsearch")) {
			service=new ShopSelectsearchService();
			service.excuteQueryService();
			
		}else if (query.equals("supdate")) {
			service=new ShopUpdateService();
			service.excuteQueryService();
		} else if (query.equals("sdelete")) {
			service=new ShopDleteService();
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
