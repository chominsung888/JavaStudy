package org.java.inheritanceEx;

class A2{
	int a;
	
	//���⼺(polymorghism)
	//�����ε� -> �ż������ �Ȱ��� �Ű�����(����) Ÿ�ԶǴ� ������ �ٸ� ��� ���
	public A2() {
		super();//ObjectŬ���� �⺻ ������
		System.out.println("A2 �⺻������ , �ڵ� ");
	}
	public A2(int a) {
		this.a=a;
	}
	
	void m1() {
		System.out.println("A2 m1()");
	}
}
class B2 extends A2{
	int b;
	public B2() {
		super();//A2 Ŭ���� �⺻ ������
		System.out.println("B2 �⺻ ������. �ڵ�");
	}
	void m2() {
		System.out.println("B2 m2()");
		
		}
	
	
	}

	


public class InheritanceEx4 extends B2 {
	public InheritanceEx4() {
		super();
	}
	int c;
	public static void main(String[] args) {
		
		// ������(polymorphsim)
		//�θ� Ÿ���� ��ü ���������� �پ��� ��ü�� ���ٰ���
		A2 a2=new A2();
		a2.a=10;
		a2.m1();
		
		a2=new B2();
		a2.a=10;
		a2.m1();
		
		a2=new InheritanceEx4();
		a2.a=10;
		a2.m1();
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
