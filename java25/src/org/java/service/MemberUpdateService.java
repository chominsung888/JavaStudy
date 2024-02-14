package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberUpdateService implements Memberservice {

	@Override
	public void excutQureyService() throws IOException, SQLException {

		System.out.println("회원수정");

		Scanner input = new Scanner(System.in);

		System.out.println("아이디");
		String userId = input.next();

		System.out.println("비밀번호");
		String userPw = input.next();

		System.out.println("나이");
		int age = input.nextInt();

		System.out.println("이름");
		String name = input.next();

		MemberDao dao = MemberDao.getInstance();

		int bool = dao.selectBool(userId);

		if (bool != 1) {
			System.out.println("수정할 회원이 존재하지 않습니다. ");
			return;
		}

		int result = dao.update(userId, userPw, age, name);
		if (result != 1) {
			System.out.println("회원수정 Fail");
		} else {
			System.out.println("회원수정 성공 ");
		}
	}

	// 조회 할 회원을 불러와서 수정을 시킨다.
}
