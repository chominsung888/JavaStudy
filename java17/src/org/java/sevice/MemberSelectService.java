package org.java.sevice;

import java.io.IOException;
import java.lang.reflect.Member;
import java.sql.SQLException;

import org.java.dto.MemberDto;

import otg.java.dao.MemberDao;

public class MemberSelectService implements MemberService {

	@Override
	public void excuteQueryService() throws SQLException, IOException {
		System.out.println("회원조회");

		MemberDao dao = new MemberDao();
		// 회원 조회 -> DB테이블 조회 get
		MemberDto member = dao.select();

		if (member != null) {
			System.out.println("조회할 회원이 있습니다.");
		} else {
			System.out.println("조회 할 회원이 없습니다.");
		}

	}

}
