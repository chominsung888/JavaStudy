package org.java.oopEx2;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class CalculatorMain {
	public static void main(String[] args) {
	
		Calculator1 cal1=new Calculator1();
		// 필드 -> 초기화
		// 매서드 -> 필드 사용
		cal1.num1=10;
		cal1.num2=100;
		
		Scanner scn=new Scanner(System.in);
		System.out.println("연산자 입력 :");
		cal1.op=scn.next(); //연산자 +-*/
		
		//if 문이용해서 ca1.op ->
		if(cal1.op.equals("+")) {
			cal1.sum();//10+100
		}else if(cal1.op.equals("-")) {
			cal1.sub();
		}else if(cal1.op.equals("*")) {
			cal1.mult();
		}else if(cal1.op.equals("/")) {
			cal1.div();
		}else {
			System.out.println("연산자 입력오류");
		}
		// +
		cal1.sum();//10+100
		// -
		cal1.sub();
		//*
		cal1.mult();
		// /
		cal1.div();
		
		Calculator1 cal2=new Calculator1();
		cal2.num1=44;
		cal2.num2=55;
		cal2.op="+";
		cal2.opMethod();
/*		cal2.sum();
		cal2.sub();
		cal2.mult();
		cal2.div();
*/		
		System.out.println();
		
		 Calculator2 c2= new  Calculator2();
		 
		 Scanner scn=new Scanner(System.in);
		 System.out.println("숫자1");
		 int m1=scn.nextInt();
		 System.out.println("숫자2");
		 int m2=scn.nextInt();
		 System.out.println("연산자");
		 String op2=scn.next();
		
		 
		 c2.opMoethod(m1, m2, op2);
		 
//       call.sum();
		
	}
	
}
