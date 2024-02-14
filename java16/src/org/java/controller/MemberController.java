package org.java.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.service.MemberDeleteService2;
import org.java.service.MemberInsertService;
import org.java.service.MemberSelectService3;
import org.java.service.MemberService;
import org.java.service.MemberUpdateService3;

public class MemberController {

	public static void main(String[] args) throws SQLException, IOException {
		System.out.println("��Ʈ�ѷ�");
		// ������ �Է�
		Scanner input = new Scanner(System.in);

		boolean bool = true;

		MemberService service = null;

		while (bool) {

			System.out.println("������ �Է�(insert,update,delete,select");
			String query = input.next();

			if (query.equals("insert")) {
				service = new MemberInsertService();
				service.excuteQueryService();
			} else if (query.equals("select")) {
				service = new MemberSelectService3();
				service.excuteQueryService();

			} else if (query.equals("update")) {
				service = new MemberUpdateService3();
				service.excuteQueryService();

			} else if (query.equals("delete")) {
				service = new MemberDeleteService2();
				service.excuteQueryService();

			} else if (query.equals("exit")) {
				System.out.println("ȸ������ ����");
				bool = false;

			}

		}

	}

}
