package org.java.conditiionEx;

public class if_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("if");
		//2.조건이 2개
		String dbId="green" ;
		String dbPw="1111" ;
		
		if(dbId.equals("green") && dbPw.equals("1111")) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
	}

}
