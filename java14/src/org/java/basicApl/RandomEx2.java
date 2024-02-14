package org.java.basicApl;

import java.util.Random;

public class RandomEx2 {
	
	public static void main(String[] args) {
		System.out.println("Random");
		
		Random rd =new Random();
		
		
		//5번실행-> 임의의 정수값을 추출
		for(int i=0; i<5;i++) {
			int rdInt=rd.nextInt();
			System.out.println(rdInt);
			System.out.println(Integer.toBinaryString(rdInt));
			
			//2진수 문자열
		}
		System.out.println(Integer.toBinaryString(10));
		
		for(int i=0; i<5;i++) {
			System.out.println(rd.nextInt(45)+" ");
		}
		System.out.println();
		//5번 실행 -> 랜덤 소수점 2자리
		for(int i=0; i<5; i++) {
			System.out.printf("" ,rd.nextDouble());
		}
		
		System.out.printf("%d+%d=%d",5,5,(5+15));
		
	}

}
