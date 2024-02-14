package org.java.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.service.MemberDeleteService;
import org.java.service.MemberSelectOneService;
import org.java.service.MemberSelectService;
import org.java.service.MemberUpdateService;
import org.java.service.MemberinsertService;
import org.java.service.Memberservice;

public class MemberController {

	public static void main(String[] args) throws IOException, SQLException {

		System.out.println("Controller");

		// 서비스에게 일 시킨다
		// 결과를 클라이언트에게 반환

		Scanner input = new Scanner(System.in);

		boolean bool = true;

		Memberservice service = null;

		while (bool) {
			System.out.println("쿼리문 입력");

			String query = input.next();
			if (query.equals("insert")) {
				service = new MemberinsertService();
				service.excutQureyService();
			} else if (query.equals("select")) {
				service = new MemberSelectService();
 				service.excutQureyService();
			} else if (query.equals("selectOne")) {
				service = new MemberSelectOneService();
				service.excutQureyService();
			} else if (query.equals("update")) {
				service = new MemberUpdateService();
				service.excutQureyService();
			} else if (query.equals("delete")) {
				service = new MemberDeleteService();
				service.excutQureyService();
			} else if (query.equals("exit")) {
				System.out.println("exit");
				bool = false;

			} else {
				System.out.println("다시");
			}

		}
	}
}
