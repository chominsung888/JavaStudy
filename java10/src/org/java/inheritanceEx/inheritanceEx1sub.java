package org.java.inheritanceEx;

public class inheritanceEx1sub extends inheritanceEx1{

	public int num5;
	public int num6;
	
	public void sub1() {
		System.out.println("sub1�ż���");
	}	
	// �θ��� �ż��带 �̸��� �����ϰ� ������ �ٸ� ǥ�� �ϰ� �ʹ�
	// �������̵�(Overriding)
	// �������̵�(Override) -> ����� ���ؼ� ������ 
	@Override
	public void superM1() {
		// TODO Auto-generated method stub
		super.superM1();
	}
	
	
	public static void main(String[] args) {	
		//i1 -> Object��� + inheritanceEx1���
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
