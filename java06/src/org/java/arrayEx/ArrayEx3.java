package org.java.arrayEx;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�迭");
		// for each�� -> ���õ� ��ü (�迭)�� ����Ʈ�� ��� ��Ҹ� ��ȸ
		// �ݺ��� -> ��ü�� �ݺ���
		
		int[] arrInt=new int[5];
		for(int i=0; i<arrInt.length;i++) {
			//if(i==5) break;
			//if
		
			
			
			arrInt[i]=i; // 0~4
			if(arrInt[i] %2==0)
			System.out.println(arrInt[i]);
		}
		System.out.println("===============");
		// foreach -> ��ü�� �湮
		// ��ü �迭�� ��Ҹ� ��ȸ
		for(int el:arrInt) {
			//¦���� 2�� ����̴�.
			//if(el%2==0) System.out.println(el);
			//¦���� �ڿ��� �߿��� 2�� ������ �������� ��
			if(el%2==0) {
				if(el!=0)
				System.out.println(el);
			}
		}
		
	}

}
