package org.java.service;

import java.io.IOException;
import java.sql.SQLException;

import org.java.dao.MemberDao;

public class MemberInsert implements MemberService {

	@Override
	public void excutQueryService() throws SQLException, IOException {
		System.out.println("ȸ������");

		// Dao -> insert()
		
		// �̱��� -> �ż��� ȣ�� ���
		MemberDao dao = MemberDao.getInstance();
		dao.insert();
		
		
		
		
	}

}
