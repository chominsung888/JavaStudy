package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class MemberSelectService implements Memberservice {

	@Override
	public void excutQureyService() throws IOException, SQLException {

		System.out.println("ȸ����ȸ");
		
		MemberDao dao= MemberDao.getInstance();
		
		List<MemberDto> members=dao.select();
		for(MemberDto member:members) {
			System.out.println("���̵�:"+member.getUserId());
			System.out.println("��й�ȣ:"+member.getUserPw());
			System.out.println("����:"+member.getAge());
			System.out.println("�̸�:"+member.getName());
		}
	}

}
