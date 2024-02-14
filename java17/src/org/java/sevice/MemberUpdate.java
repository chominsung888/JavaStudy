package org.java.sevice;

import java.io.IOException;
import java.lang.reflect.Member;
import java.sql.SQLException;

import otg.java.dao.MemberDao;

public class MemberUpdate implements MemberService{

	@Override
	public void excuteQueryService() throws SQLException, IOException {
		
		MemberDao dao = new MemberDao();
		int result = dao.update();
		System.out.println("회원수정 실행");
		
	}

}
