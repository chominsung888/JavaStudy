package org.ForEx1;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("while");
		System.out.println("������");
		
		int i=1;
		
		while(i<9) {
			i++;
			System.out.println(i+"���Դϴ�");
			
	/*		int j=0; // 0123456789 -> �ٽ� �ʱ�ȭ ���Ѿ� �ȴ�. j-> 0 
			while(j<9) {
				j++;
				System.out.println(i+"*"+j+"="+(i*j));
			}
			*/
			// j-> 10
			Scanner scn= new Scanner(System.in);
			System.out.println("���۴�:");
			int firstNum = scn.nextInt();
			
			System.out.println("����:");
			int secondNum = scn.nextInt();
			
			if(firstNum<secondNum) {
				while(firstNum<=secondNum) {
					System.out.println(firstNum+"���Դϴ�.");
					
					int j =0;
					while (j<9) {
						j++;
						System.out.println(firstNum+"*"+j+"="+(firstNum*j));
					}
					firstNum++;				}
			}
			
			

				System.out.println("ù��° ���ڴ� �ݵ�� �ι�° ���ں��� �۾ƾߵȴ�");
			}
		}
		
	}


