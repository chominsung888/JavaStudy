package org.java.service;

import java.io.IOException;
import java.sql.SQLException;

import org.java.dao.MemberDao;

public class MemberSelect implements MemberService{

	@Override
	public void excutQueryService() throws SQLException, IOException {
		System.out.println("회원조회");
		
		
		MemberDao dao=MemberDao.getInstance();
		dao.select();
	}

	
}
