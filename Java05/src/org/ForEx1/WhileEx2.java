package org.ForEx1;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("while");
		System.out.println("구구단");
		
		int i=1;
		
		while(i<9) {
			i++;
			System.out.println(i+"단입니다");
			
	/*		int j=0; // 0123456789 -> 다시 초기화 시켜야 된다. j-> 0 
			while(j<9) {
				j++;
				System.out.println(i+"*"+j+"="+(i*j));
			}
			*/
			// j-> 10
			Scanner scn= new Scanner(System.in);
			System.out.println("시작단:");
			int firstNum = scn.nextInt();
			
			System.out.println("끝단:");
			int secondNum = scn.nextInt();
			
			if(firstNum<secondNum) {
				while(firstNum<=secondNum) {
					System.out.println(firstNum+"단입니다.");
					
					int j =0;
					while (j<9) {
						j++;
						System.out.println(firstNum+"*"+j+"="+(firstNum*j));
					}
					firstNum++;				}
			}
			
			

				System.out.println("첫번째 숫자는 반드시 두번째 숫자보다 작아야된다");
			}
		}
		
	}


