package org.java.inheritanceEx;

public class inheritanceEx1sub extends inheritanceEx1{

	public int num5;
	public int num6;
	
	public void sub1() {
		System.out.println("sub1매서드");
	}	
	// 부모의 매서드를 이름은 동일하고 사용법을 다른 표현 하고 싶다
	// 오버라이딩(Overriding)
	// 오버라이드(Override) -> 상속을 통해서 재정의 
	@Override
	public void superM1() {
		// TODO Auto-generated method stub
		super.superM1();
	}
	
	
	public static void main(String[] args) {	
		//i1 -> Object멤버 + inheritanceEx1멤버
		inheritanceEx1 i1= new inheritanceEx1();
		i1.num1 =10;
		i1.num2 =20;
		i1.num3 =30;
		i1.superM1();
		System.out.println(i1.toString());
		System.out.println(i1.toString());
		
		inheritanceEx1sub i2= new inheritanceEx1sub();
		i2.num1=20;
		i2.num2=30;
		i2.num3=20;
		i2.num5=20;
		i2.num6=30;
		i2.superM1();
		System.out.println(i2.toString());
		System.out.println(i2.toString());
		
		
		
	}
	
	
}
