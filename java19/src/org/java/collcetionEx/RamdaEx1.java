package org.java.collcetionEx;

interface In1{
	abstract void m1();
}
/*class In2Sub implements In1{
	
/*	@Override
	public void m1() {
		
	}
}
*/
interface In2{
	abstract void m2(int num1,int num2);
}
interface In3{
	abstract void m3(int num1);
}

public class RamdaEx1 {

	public static void main(String[] args) {
		
		/*
		 * In3 in3=(int num1)->{ System.out.println(num1); };
		 */
		
		In3 in3=num1-> System.out.println(num1);
		in3.m3(1000);
		
		
		
		
		
		System.out.println("���ٽ�");
		
		//�͸� Ŭ����- > �ϳ��� ���� -> �������̽� ������ü 
		In1 in1=new In1() {
			
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("�͸� Ŭ���� �������̵�");
			}
		};
		in1.m1();
		// //�͸� Ŭ����-> Interface In2�ż��� ���� 
		In2 in2=new In2() {
			
			@Override
			public void m2(int num1, int num2) {
				// TODO Auto-generated method stub
				System.out.println("�͸�Ŭ���� m2:"+(num1+num2));
			}
		};
		in2.m2(100, 200); 
		
		//���ٽ�
		//1. ���� ��ɹ��� �ϳ��� {} ���� ����
		In1 in11=() -> {
			System.out.println("���ٽ� ����(�͸� �ż���)");
			long sum=10;
			System.out.println(sum);
		};
		in11.m1();
		
		In2 in22=(int num1,int num2)->{
			System.out.println("���ٽ� ����(�͸� �ż���)");
			System.out.println(num1+num2);
		};
		in22.m2(100,200);
			
		
		
		
		
	}
}
