package org.java.study;

import org.java.study.In1Sub2.A;

interface In1{
	void ab1(); //다형성을 이용해서 프로젝트 작업 효과적으로 수행
}

class In1Sub implements In1{
	//다형성 -> 하나의 이름으로 여러 일을 수행?
	//상속을 통해서 부모의 매서드를 구현한 프로그래밍 방식(오버라이딩) 
	@Override
	public void ab1() {
		System.out.println("추상매서드-> 오버라이딩");
		
	}
	
}
class In1Sub2 implements In1{
	
class A{
	int a; //맴버-> 필드

	//매서드 이름이 똑같고 매개인자  갯수 또는 타입이 다른것을 허용
	//매서드 이름 똑같고 매개인자 갯수 또는 타입이 다른 것을 허용
	//오버로딩 
	
	//맴버 생성자
	public A() {
		System.out.println("기본생성자");
	}
	public A(int a) {
		this.a=a;
	}
	//멤버 -> 매서드
	void m1(int num) { // int num -> 매개변수(인자) -> 지역 변수 
		int num2=10; // 지역변수 
		System.out.println("m1");
	}
}

@Override
public void ab1() {
	System.out.println("java study");
	
}



}
public class Study1 {

	int num1;//클래스 멤버
	int num2;
	static int num; //공유자원( 따로 패키지에 저장)
	
	public Study1() {
		// TODO Auto-generated constructor stub
	}  
		
	void me1(){
		
	}
	
	public static void main(String[] args) {
		System.out.println("java Study");
		//타입
		int i=10;
		double d=1.1;
		
		A a1=new A();
		A a2=new A();
		
		// 인터페이스는 객체를 생성 할 수 없다. new가 없다
		//하나의이름으로(타입) 여러객체를 접근 할 수 있는 프로그래밍 방식 
		In1 in1=new In1Sub();
		in1= new In1Sub2();
		
		
		
	}
}
