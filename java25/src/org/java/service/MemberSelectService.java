package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class MemberSelectService implements Memberservice{

	@Override
	public void excutQureyService() throws IOException,SQLException {
		
		System.out.println("ȸ����ȸ");
		
		
		MemberDao dao=MemberDao.getInstance();
		List<MemberDto> members=dao.select();
		
		if(members.isEmpty()) {
			System.out.println("��ȸ �� ȸ������� �����ϴ�.");
		}else {
			for(MemberDto member:members) {
				System.out.print(" ���̵�:"+member.getUserId());
				System.out.print(",��й�ȣ:"+member.getUserPw());
				System.out.print(",����:"+member.getAge());
				System.out.println(",�̸�:"+member.getName());
			}
		}
		
		
	}

}
