package org.java.basicApl;

public class MathEx1 {
	public static void main(String[] args) {
		System.out.println("Math");
		
		double ran1= Math.random(); //0 <= <1
		System.out.println((int)ran1);
/*	for(int i=0; i<100; i++) {
			System.out.println((int)(Math.random()*45)+"");
	}
*/	
		System.out.println("=====================");
		System.out.println(Math.min(100, 200)); //�ּڰ�
		System.out.println(Math.max(100, 200)); //�ִ�
		System.out.println(Math.abs(-50)); // ���밪(���)
		System.out.println(Math.ceil(11.1)); //�ø� -> ����¡
		System.out.println(Math.floor(11.2)); //���� -> ����¡
		System.out.println(Math.round(11.5)); //�ݿø�
		System.out.println(Math.round(11.2)); //�ݿø� 
		
		
	}
}
