package org.java.inheritanceEx;

interface In1 {
//	public static final int NUM=100; 
	int NUM=100;
//	abstract void in1();
	void in1();
}

interface In2{ 
	void in2();
}
		//���� ��� ����
interface In3 extends In1,In2{
	void in3();
}
//���� Ŭ���� -> ���� ��ü  -> 
//�������̽��� �ݵ�� ���� ��ü�� ���� ���� 
class InMain implements In3,In2,In1{

	@Override
	public void in1() {
		System.out.println("in1");
		
	}

	@Override
	public void in2() {
		System.out.println("in2");
		
	}

	@Override
	public void in3() {
		System.out.println("in3");
		
	}
	
}



public class InferitanceInterface {

	public static void main(String[] args) {
	In1 in1=new InMain();
	in1.in1();
	
	In2 in2=new InMain();
	in2.in2();
	
	In3 in3=new InMain();
	in3.in1();
	in3.in2();
	in3.in3();
	
	
	}
}
