
package org.java.inheritanceEx;
//�׽�Ʈ�� Ŭ����
class A1{
	int a;
	
	
	public A1() {
		super(); // �θ�Ŭ������ ������(�⺻������)
		System.out.println("A1�⺻ ������");
		
	}
	public A1(int a) {
	//this();//�ٸ� ������
	//	this.a; //�ʵ�
	//	this.m1();//�ɹ� -> �ż���
		this.a=a;
	}
	
	void m1() {
		System.out.println("A1 m1()");
	}
	
}
class B1 extends A1{
	int b;
	
	public B1() {
	 super(10); //�θ� Ŭ���� -> A1Ŭ���� �⺻ ������

	}
	void m2() {
		System.out.println("B1 m2()");
	}
}

public class inheritanceEx3 {
	
	public static void main(String[] args) {
		
		A1 a1 = new A1();
		B1 b1=  new B1();
		// ���⼺(polymorphism) -> �����θ�
		A1 a2=new B1();
	}

}
