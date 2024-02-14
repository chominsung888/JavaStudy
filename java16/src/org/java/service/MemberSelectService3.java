package org.java.service;

import java.io.IOException;
import java.sql.SQLException;

import org.java.dao.MemberDao;

public class MemberSelectService3 implements MemberService {

	@Override
	public void excuteQueryService() throws SQLException, IOException {
		
		System.out.println("회원조회");
		
		//DAO
		MemberDao	dao=	new MemberDao();
		MemberDto member =	dao.select();
		
		if(member!=null) {
			System.out.println("회원조회: "+member.getNo());
			System.out.println("아이디: "+member.getUserId());
			System.out.println("회원조회: "+member.getUserPw());
			System.out.println("회원조회: "+member.getName());
			System.out.println("회원조회: "+member.getAge());
		}else {
			System.out.println("조회 할 회원 없습니다.");
		}
		
		
		
		
	}

	
}
