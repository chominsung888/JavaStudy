package org.ForEx1;

public class WhileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("while");
		
		for(int i=0; i<0; i++) {
			System.out.println(i);
		}
		int i=0;
		while(i<10) {
			i++;
			if(i==10) {
				// i�� ������(10)�� ���
				System.out.println(i);
				break; // while�� ����
			}
			System.out.print(i+",");
		}//brak;
		
		
		System.out.println();
		int j=0;
		
		// ������ ����
		while(true) {
			
			// 1~10 ���
			// if, break
			j++;
			if(j>10) break;
			
			
			System.out.print(j); //1~10
		
		}
	}
	
	

}
