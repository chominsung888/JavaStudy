package org.java;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("switch");
		
		System.out.println("���ĺ� �Է� �Ͻÿ�.");
		Scanner scn=new Scanner(System.in);
		
		System.out.println("�Է�:");
		String alpha=scn.next();
		
		switch(alpha) {
		case "a":
			//break;
		case "A":
			System.out.println("A");
			break; // switch�� ����
		case "b":
		case "B":
			System.out.println("B");
			break;
		case"c":
		case"C":
			System.out.println("C");
			break;
		default:
			System.out.println("A,B,C�̿��� �� �Է�");
		}//break;
		
		//.if(90>=) -> A
		// switch(��) {
		// case 99 ,98 ,97, 96,95,94,93 ,92,  91,90:
		
		// }
		
	}

}
