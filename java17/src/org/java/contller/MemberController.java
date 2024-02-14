package org.java.contller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.sevice.MemberInsert;
import org.java.sevice.MemberSelectService;
import org.java.sevice.MemberService;
import org.java.sevice.MemberUpdate;

public class MemberController {
	public static void main(String[] args) throws SQLException, IOException {

		System.out.println("Controller");

		// SQL(관계형데이터베이스 CRUD언어) -> RDBMS(관계형데이터베이스): oracle,mysql
		// insert(C), select(R), update(U), delete(D)

		MemberService service = null;
		Scanner input = new Scanner(System.in);

		boolean bool = true;

		while (bool) {
			System.out.println("쿼리문 입력(insert, select, update, delete)");
			String query = input.next();

			if (query.equals("Insert")) {
				service = new MemberInsert();
				service.excuteQueryService();
			} else if (query.equals("update")) {
				service = new MemberUpdate();
				service.excuteQueryService();
			} else if (query.equals("select")) {
				service = new MemberSelectService();
				service.excuteQueryService();
			} else if (query.equals("dlelte"))

			{
				service = new MemberUpdate();
				service.excuteQueryService();
			} else if (query.equals("exit"))

			{

				System.out.println("종료");
				bool = false;
			} else {
				System.out.println("쿼리문 입력 오류");

			}
		}

	}
}
