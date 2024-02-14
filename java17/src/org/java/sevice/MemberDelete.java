package org.java.sevice;

import java.io.IOException;
import java.sql.SQLException;

import otg.java.dao.MemberDao;


public class MemberDelete implements MemberService{

	@Override
	public void excuteQueryService() throws SQLException, IOException {
		System.out.println("È¸¿øÅ»Åð");
		
		MemberDao dao= new MemberDao();
		int result=dao.delete();
		
		if(result!=1) {
			System.out.println("È¸¿øÅ»Åð Fail!");
		}else {
			System.out.println("È¸¿øÅ»Åð Success!");
		}
		
	}

}