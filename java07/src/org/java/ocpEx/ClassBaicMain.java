package org.java.ocpEx;

public class ClassBaicMain {
	
	public static void main(String[] args) {
		
		//클래스(static)멤버 클래스명.클래스멤버
		ClassBasic.num3=25;
		
		System.out.println("클래스");
		//new -> 객체 생성 연산자
		//생성자(Construct) ->객체 생성에 도움을 주는 매서드
		//클래스(사용지정의 타입) -> ClassBasic
		// c1->객체 참조 변수 -> 생성된 객체의 주소값을 저장
		// c1 -> 인스턴스, 객체
		// 인스턴스화 -> 객체화
		 
		ClassBasic c1=new ClassBasic();
		// . 객체 접근 연산자
		c1.num1=100;
		c1.num2=200;
		//매서드를 호출(call) -> 매서드명()
		//매서드의 구현부에 설정된 명령어(실행)된다.
		c1.instanceMethod();
		
		System.out.println(c1.num3+"<<num3");
		
		System.out.println(c1.num1+c1.num2);
		
		ClassBasic c2= new ClassBasic();
		c2.num1=10;
		c2.num2=20;
		
		//클래스(static) 멤버 -> 공유하고 싶은 데이터에 설정 
		System.out.println(ClassBasic.num3);
		ClassBasic.num3=90;
		System.out.println(ClassBasic.num3);
		
		
	}
	
}
