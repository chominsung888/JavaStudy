package org.java.sevice;

import java.io.IOException;
import java.lang.reflect.Member;
import java.sql.SQLException;

import org.java.dto.MemberDto;

import otg.java.dao.MemberDao;

public class MemberSelectService implements MemberService {

	@Override
	public void excuteQueryService() throws SQLException, IOException {
		System.out.println("ȸ����ȸ");

		MemberDao dao = new MemberDao();
		// ȸ�� ��ȸ -> DB���̺� ��ȸ get
		MemberDto member = dao.select();

		if (member != null) {
			System.out.println("��ȸ�� ȸ���� �ֽ��ϴ�.");
		} else {
			System.out.println("��ȸ �� ȸ���� �����ϴ�.");
		}

	}

}
