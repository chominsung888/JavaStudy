package org.java.sevice;

import java.io.IOException;
import java.sql.SQLException;

import otg.java.dao.MemberDao;

public class MemberInsert implements MemberService {

	@Override
	public void excuteQueryService() throws SQLException, IOException {
		System.out.println("회원가입");

		MemberDao dao = new MemberDao();
		int result = dao.insert();
		
		if(result==1) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("회원가입 실패");
			
		}
			
		
	}

}
