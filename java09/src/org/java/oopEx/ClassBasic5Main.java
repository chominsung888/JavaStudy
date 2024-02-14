package org.java.oopEx;

import java.lang.invoke.ConstantCallSite;

public class ClassBasic5Main {
	
	public static int num2;
	public void m1() {
		System.out.println("m1");
	}
	public static void main(String[] args) {
		//인스턴스 멤버 사용
		ClassBasic5Main cM1=new ClassBasic5Main();
		
		ClassBasic5Main.num2=100;
		int num3;
		
		//new 객체 생성 연산자
		//c1 객체 접근 연산자,객체,인스턴스 
		// ClassBasic5 타입 c1;
		// c1. -> 객체 접근 연산자
		// 인스턴스화, 객체화
	ClassBasic5 c1=	new ClassBasic5();
		
	c1.age=10;
	c1.instanceMathod1();
	
	String[] str2= {"1","2","3"};
	String[] str3=new String[] {"1","2","2"};
	
	c1.m1(new String[] {"1","2","2"});
	
	c1.setUserId("m1");
	c1.setUserPw("11");
	c1.getUserId();
	c1.getUserPw();
	
	//클래스 멤버
	ClassBasic5.projectName="PROJECT NAME";
	ClassBasic5.classMethode();
		
		
		
		
		
		
		
		
		
	}
}
