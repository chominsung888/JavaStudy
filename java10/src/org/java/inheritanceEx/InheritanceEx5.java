package org.java.inheritanceEx;

class Parent{
	int a;
	void m1() {
		System.out.println("�θ�Ŭ����m1()");
	}
}
class sub1 extends Parent{
	int b;
	void m2() {
		System.out.println("�ڽ�Ŭ���� m2()");
	}
}




public class InheritanceEx5 {
 
	public static void main(String[] args) {
		Parent p1=new Parent();
		p1.a=10;
		p1.m1();
		
		sub1 s1=new sub1();
		
	}
}
