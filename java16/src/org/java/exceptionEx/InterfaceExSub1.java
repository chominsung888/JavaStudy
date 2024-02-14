package org.java.exceptionEx;

import java.io.IOException;
import java.sql.SQLException;

public class InterfaceExSub1 implements InterfaceEx{

	@Override
	public void excuteueryMethod() throws SQLException, IOException {
		System.out.println("인터페이스 구현 예외 상속 Exception");
		
	}

	@Override
	public void excuteueryMethod2() throws Exception {
		System.out.println("인터페이스 구현 예외 상속 Exception");
		
	}

	
}
