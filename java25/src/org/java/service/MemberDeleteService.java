package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberDeleteService implements Memberservice {

	@Override
	public void excutQureyService() throws IOException, SQLException {
		System.out.println("ȸ��Ż��");

		Scanner input = new Scanner(System.in);

		System.out.println("���̵�");
		String userId = input.next();

		MemberDao dao = MemberDao.getInstance();

		int bool = dao.selectBool(userId);

		if (bool != 1) {
			System.out.println("������ ȸ���� �������� �ʽ��ϴ�. ");
			return;
		}
		
		int result = dao.delete(userId);

		if (result != 1) {
			System.out.println("ȸ��Ż�� Fail!");
		} else {
			System.out.println("ȸ�� Ż�� Success!");
		}
	}

}
