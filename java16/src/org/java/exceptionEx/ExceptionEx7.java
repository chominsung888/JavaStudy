package org.java.exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx7 {
	
		public static void main(String[] args) {
			// "���ܸ� ó���ϰ� ���������� ���α׷��� ������ ����" -> ����(��������)
			System.out.println("Exception");

			Scanner input = new Scanner(System.in);
			int[] arrInt = new int[5];
			System.out.println("1->");
			try {
//				for (int i = 0; i < 6; i++) {
//					System.out.println(arrInt[i]);
//				}
				System.out.println("2->");

				System.out.println("���� �Է�: ");
				int num = input.nextInt();
				System.out.println("�Է°�: " + num);
				System.out.println("3->");

				System.out.println("���� ����");
				System.out.println("4->");

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("5->1");
				System.out.println("���� �߻�");
				e.printStackTrace();
			} catch (InputMismatchException e) {
				System.out.println("5->2");
				e.printStackTrace();
			} catch (Exception e) {
				System.out.println("5-> �� 2���� ���� ��� ���� ó��");
				e.printStackTrace();
			} finally {
				System.out.println("6->");
				System.out.println("������ ����");
			}

			System.out.println("7->");
			System.out.println("���α׷� ���� ����");

		}
	}