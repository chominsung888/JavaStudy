package org.java.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.service.BoardDleleteService2;
import org.java.service.BoardInsertService;
import org.java.service.BoardSelectService;
import org.java.service.BoardService;
import org.java.service.BoardUpateService;
import org.java.service.Memberservice;

public class BoardController {

public static void main(String[] args) throws IOException, SQLException
{
		
		System.out.println("Controller -> Board");
		
		BoardService service=null;
		Scanner input = new Scanner(System.in);

		boolean bool = true;

		while (bool) {

			System.out.println("쿼리문 입력");

			String query = input.next();

			if (query.equals("binsert")) {
				service = new BoardInsertService();
				service.excutQureyService();
			} else if (query.equals("bselect")) {
				service = new BoardSelectService();
				service.excutQureyService();
			} else if (query.equals("bselectOne")) {
				service = new BoardSelectService();
				service.excutQureyService();
			}else if (query.equals("bupdate")) {
				service = new BoardUpateService();
				service.excutQureyService();
			} else if (query.equals("bdelete")) {
				service = new BoardDleleteService2();
				service.excutQureyService();
			} else if (query.equals("exit")) {
				System.out.println("서비스종료");
				bool = false;
			} else {
				System.out.println("쿼리문 입력 Fail! -> 다시");
			}

		}
		
		
	}
}
