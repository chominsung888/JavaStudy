package org.java.basicApl;

public class MathEx2_Lotto {

	public static void main(String[] args) {
		System.out.println("Math -> �ζ�");
		
		//1~45 -> �迭 0~44���� ���� 
		int[] lotto = new int[45];
		int size=lotto.length;
		//lotto�迭�� 1~45���� 
		for(int i=0; i<size; i++) {
			lotto[i]=i+1;
//			System.out.println(lotto[i]+" ");	
		}
		int temp=0;
		
		for(int i=0; i<1000; i++) {
			int idx=(int)(Math.random()*45);
			temp=lotto[idx];
			lotto[idx]=lotto[0];
			lotto[0]=temp;
		}
		System.out.println(lotto);
		for(int i=0; i<size;i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println("��õ ��ȣ");
		// lotto �迭 0���� 5����
		for(int i=0; i<6;i++) {
			System.out.print(lotto[i]+" ");
			
		}
		
		
		
	}
}
