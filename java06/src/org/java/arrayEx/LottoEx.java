package org.java.arrayEx;

public class LottoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lotto");
		
		//1. 1~45 ���� ����
		int[] lotto=new int[45];
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=i+1;
			
			if(i%15==0) System.out.println();
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		
		int temp=0;// �ӽ�����
		//1000�� �����ش�
		for(int i=0; i<1000;i++) {
			
			int index=(int)(Math.random()*45);//0~44���� ����
			temp=lotto[index];// ���� �ε��� ���� temp
				lotto[index]=lotto[0]; //0���� ���� ���� �ε��� ������ �ʱ�ȭ 
				lotto[0]=temp;
		}
			System.out.println("�ζ� ��ȣ ���");
			for(int i=0; i<6; i++) {
				System.out.print(lotto[i]+" ");
			}
	}
}
