package org.java.operatorEx;

import java.util.Scanner;

// java.lang -> �ڹ��� �⺻ ��Ű��-> �ڵ����� import
// import java.lang.*;// ����

public class OperatorEx1 {

	public static void main(String[] args) {
		
		System.out.println("���������");
		
		int num1=10;
		int num2=3;
		// 10+20=30
		// ���ڿ�+���� -> "���ڿ�����"
		System.out.println(num1+"+"+num2+"="+(num1+num2)); // ���ϱ�
		System.out.println(num1+"-"+num2+"="+(num1-num2)); // ����
		System.out.println(num1+"*"+num2+"="+(num1*num2)); // ���ϱ�
		System.out.println(num1+"/"+num2+"="+((double)num1/num2)); // ������
		System.out.println(num1+"%"+num2+"="+(num1%num2)); // ������
		
		System.out.println("�� ������ �Է��� �޾Ƽ� +-*/% ������ ���� �Ͻÿ�.");
		Scanner scn=new Scanner(System.in);
		
		System.out.println("ù��°����:");
		int inputNum1=scn.nextInt();
		
		System.out.println("�ι�°����:");
		int inputNum2=scn.nextInt();
		
		System.out.println(inputNum1+"+"+inputNum2+"="+(inputNum1+inputNum2));
		System.out.println(inputNum1+"-"+inputNum2+"="+(inputNum1-inputNum2));
		System.out.println(inputNum1+"*"+inputNum2+"="+(inputNum1*inputNum2));
		System.out.println(inputNum1+"/"+inputNum2+"="+((double)inputNum1+inputNum2));
		System.out.println(inputNum1+"%"+inputNum2+"="+(inputNum1%inputNum2));
		
		
		
	}
}
