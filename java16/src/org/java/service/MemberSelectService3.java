package org.java.service;

import java.io.IOException;
import java.sql.SQLException;

import org.java.dao.MemberDao;

public class MemberSelectService3 implements MemberService {

	@Override
	public void excuteQueryService() throws SQLException, IOException {
		
		System.out.println("ȸ����ȸ");
		
		//DAO
		MemberDao	dao=	new MemberDao();
		MemberDto member =	dao.select();
		
		if(member!=null) {
			System.out.println("ȸ����ȸ: "+member.getNo());
			System.out.println("���̵�: "+member.getUserId());
			System.out.println("ȸ����ȸ: "+member.getUserPw());
			System.out.println("ȸ����ȸ: "+member.getName());
			System.out.println("ȸ����ȸ: "+member.getAge());
		}else {
			System.out.println("��ȸ �� ȸ�� �����ϴ�.");
		}
		
		
		
		
	}

	
}
