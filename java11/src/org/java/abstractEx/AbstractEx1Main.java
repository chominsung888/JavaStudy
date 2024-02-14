package org.java.abstractEx;

public class AbstractEx1Main {

public static void main(String[] args) {
	
	//추상클래스는 객체를 생성 하지 못한다.
	//new AbstractEx1();
	public abstract void abstractMethod();
	AbstractEx1Sub1 a1 =new AbstrractEx1Sub();
	a1.num1=10;
	a1.num2=20;
	a1.num3=30;
	a1.num4=40;
	a1.abstractMethod();
	
	AbstractEx1Sub1 a1 =new AbstrractEx1Sub();
	ab1.num1=20;
	ab1.num2=30;
	ab1.abstractMethod();
	
}
}
