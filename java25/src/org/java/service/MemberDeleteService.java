package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberDeleteService implements Memberservice {

	@Override
	public void excutQureyService() throws IOException, SQLException {
		System.out.println("회원탈퇴");

		Scanner input = new Scanner(System.in);

		System.out.println("아이디");
		String userId = input.next();

		MemberDao dao = MemberDao.getInstance();

		int bool = dao.selectBool(userId);

		if (bool != 1) {
			System.out.println("삭제할 회원이 존재하지 않습니다. ");
			return;
		}
		
		int result = dao.delete(userId);

		if (result != 1) {
			System.out.println("회원탈퇴 Fail!");
		} else {
			System.out.println("회원 탈퇴 Success!");
		}
	}

}
