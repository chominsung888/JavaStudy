package org.java.conditiionEx;

import java.util.Scanner;

public class if_ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("==== ���� ====");
		/*
		 * �������� ������(+,-,*,/)�� �Է��� �޾Ƽ� �����ڰ� +�� ���ϱ�, -�� ����, *�� ���ϱ�, /�� ������ ������ ���� �Ͻÿ�
		 */

		Scanner scn = new Scanner(System.in);

		System.out.print("����1�Է�:");
		int num1 = scn.nextInt();

		System.out.print("����2�Է�:");
		int num2 = scn.nextInt();

		System.out.println("�����ڸ� �Է��ϼ���(+-*/)");
		String op = scn.next();
		
		//if~else if~else
		// �����ڰ� +*-/�̿��� ���� �Է��� �Ǹ� 
		// "������ �Է� ����" �޼����� �ֿܼ� ���
		// �������� ���� ���� ���� �Ͻÿ�.
		
		if(op.equals("+")) {
			System.out.println(num1+"+"+num2+"="+(num1 +num2));
		}else if(op.equals("-")) {
			System.out.println(num1+"-"+num2+"="+(num1 -num2));
		}else if(op.equals("*")) {
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		}else if(op.equals("/")) {
			System.out.println(num1+"/"+num2+"="+((double)num1/num2));
		} else {
			System.out.println("������ �Է� �����Դϴ�!. �ٽ� �Է����ּ���~");
		}
		
	
		
	}


	}


