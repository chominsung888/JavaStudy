package org.ForEx1;

public class DowhileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("do~while");
		// 반드시 한번은 실행해야되는 경우
		int i=10;
		
		do {
			i++;
			System.out.print(i);
		}while(i<10);
		
		System.out.println();
		
		//구구단
		System.out.println("구구단");
		//2~9단
		int i2=2;
		do {
			System.out.println(i2+"*"+j+"="+(i2*j)+" ");
			i2++;
			
		}while(j<10);
		
		System.out.println();
		i2++;
		
	}while(i2<10);

}

