package org.java.exceptionEx;

import java.io.IOException;
import java.sql.SQLException;

public class InterfaceExSub1 implements InterfaceEx{

	@Override
	public void excuteueryMethod() throws SQLException, IOException {
		System.out.println("�������̽� ���� ���� ��� Exception");
		
	}

	@Override
	public void excuteueryMethod2() throws Exception {
		System.out.println("�������̽� ���� ���� ��� Exception");
		
	}

	
}
