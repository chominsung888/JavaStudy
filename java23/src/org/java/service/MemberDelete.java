package org.java.service;

import java.io.IOException;
import java.sql.SQLException;

import org.java.dao.MemberDao;

public class MemberDelete implements MemberService{

	@Override
	public void excutQueryService() throws SQLException, IOException {
		System.out.println("ȸ��Ż��");
	//�̱��� -> "��ü�� �ѹ��� ����" 
	MemberDao dao =MemberDao.getInstance();
		dao.delete();
	}

	
}
