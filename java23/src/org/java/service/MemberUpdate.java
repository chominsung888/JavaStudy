package org.java.service;

import java.io.IOException;
import java.lang.reflect.Member;
import java.sql.SQLException;

import org.java.dao.MemberDao;

public class MemberUpdate implements MemberService {

	@Override
	public void excutQueryService() throws SQLException, IOException {
	System.out.println("회원수정");
	
	MemberDao dao=	MemberDao.getInstance();
	dao.update();
	
	}

}
