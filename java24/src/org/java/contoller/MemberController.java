package org.java.contoller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.service.MemberDleteService;
import org.java.service.MemberInsertService;
import org.java.service.MemberSelectService;
import org.java.service.MemberUpdateService;
import org.java.service.Memberservice;

//Ŭ���̾�Ʈ�� ���� ��û ������ �ް� -> �������� ���� ��Ų��.
//���񽺿��� ���� ����� Ŭ���̾�Ʈ���� �����ش�(View)
public class MemberController {

	public static void main(String[] args) throws IOException, SQLException {
		
		System.out.println("Controller");
		// 1. ���񽺿��� �� ��Ų��.
		// 2. ����� Ŭ���̾�Ʈ���� ��ȯ(View)

		Scanner input = new Scanner(System.in);

		boolean bool = true;

		Memberservice service = null;

		while (bool) {

			System.out.println("������ �Է�");

			String query = input.next();
			if (query.equals("insert")) {
				service = new MemberInsertService();
				service.excutQureyService();
			} else if (query.equals("select")) {
				service = new MemberSelectService();
				service.excutQureyService();
			} else if (query.equals("update")) {
				service = new MemberUpdateService();
				service.excutQureyService();
			} else if (query.equals("dlete")) {
				service = new MemberDleteService();
				service.excutQureyService();

			} else if (query.equals("exit")) {
				System.out.println("exit");
				bool = false;
			} else {
				System.out.println("�ٽ�");
			}

		}
	}
}
