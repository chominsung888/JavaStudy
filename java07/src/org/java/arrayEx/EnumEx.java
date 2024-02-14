package org.java.arrayEx;

import javax.management.relation.Role;

public class EnumEx {
	
	// static -> 클래스(static) 멤버 -> 클래스명.이름
	
	public static final String ADMIN= "ROLE_ADMIN";
	public static final String MEMBER= "ROLE_MEMBER";
	public static final String SELLER= "ROLE_SELLER";
	
	enum USER_ROLE{
		ROLE_ADMIN,ROLE_MEMBER,ROLE_SELLER
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enum");
		
		System.out.println("관리자 권한:"+EnumEx.ADMIN); //클래스명.클래스멤버
		System.out.println("판매자 권한:"+EnumEx.SELLER); //클래스명.클래스멤버
		System.out.println("일반회원 권한:"+EnumEx.MEMBER); //클래스명.클래스멤버
		System.out.println("esum->조회"); //클래스명.클래스멤버
		System.out.println("관리자 권한:"+USER_ROLE.ROLE_ADMIN); //클래스명.클래스멤버
		System.out.println("판매자 권한:"+USER_ROLE.ROLE_SELLER); //클래스명.클래스멤버
		System.out.println("일반회원 권한:"+USER_ROLE.ROLE_MEMBER); //클래스명.클래스멤버
		
		System.out.println("enum->생성");
		System.out.println("관리자 권한:"+ ROLE.ROLE_ADMIN); //클래스명.클래스멤버
		System.out.println("판매자 권한:"+ ROLE.ROLE_SELLER); //클래스명.클래스멤버
		System.out.println("일반회원 권한:"+ ROLE.ROLE_MEMBER); //클래스명.클래스멤버
	
		
	}

}
