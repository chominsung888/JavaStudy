package org.java.operatorEx;

import java.util.Scanner;

public class Qulz2 {
	public static void main(String[] args) {

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

		// if��(������ �ϳ�), equals �̿� ���� �غ�����
		// op�� + -> num1+num2 ���� �ֿܼ� ���
		if (op.equals("+")) {
			System.out.println(num1 + num2);
		}
		// op�� - -> num1-num2 ���� �ֿܼ� ���
		if (op.equals("-")) {
			System.out.println(num1 - num2);
		}
		// op�� * -> num1*num2 ���� �ֿܼ� ���
		if (op.equals("*")) {
			System.out.println(num1 * num2);
		}
		// op�� / -> num1/num2 ���� �ֿܼ� ���
		if (op.equals("/")) {
			System.out.println((double) num1 / num2);
		}

	}

}
