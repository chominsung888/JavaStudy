package org.java.oopExTest;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// ���̵�, �����ȣ, ���� �Է��ϰ�
		// �ֿܼ� id: m11, password: m11, age:11 ��� �ϰ�
		// setters,getters�̿�
		// �ٽ� ó������ ���ư����� �ۼ��� ������

		// ȸ������ �Ŀ� �α��� ����
		// 1. �α��� ����
		// ���̵�� �����ȣ�� ���ÿ� ��ġ�ϸ� -> "�α��� ����" -> �α��ο� ���� while�� ����
		// ���̵�� �����ȣ�� ���ÿ� ��ġ������ -> "�α��� ����"->
		// 2. �α��� ���� ���� -> ��ü while�� ����
		// 3. �̿ܿ��� �ٽ� �α��� -> �α��ο� ���� while��

		Register member1 = new Register();

		Scanner input = new Scanner(System.in);

		boolean bool = true;
		// while(true) -> break;
		while (bool) {

			System.out.println("ȸ�������� ���� �Ͻðڽ��ϱ�? " + "\n while�� ����(exit), ȸ�����Խ���(yes), ȸ����������(no)");
			String order = input.next();

			if (order.equals("yes")) {

				System.out.println("ȸ������ ���� ");
				System.out.print("���̵� �Է�: ");
				String userId = input.next();
				member1.setId(userId);

				System.out.print("�����ȣ �Է�: ");
				String passWord = input.next();
				member1.setPassword(passWord);

				System.out.print("���� �Է�: ");
				int age = input.nextInt();
				member1.setAge(age);

				System.out.println();

				// �α���
				while (true) {
					System.out.println("�α��� ���� �ϰڽ��ϱ�? yes(����),exit(��üwhile����)");
					String q = input.next();

					if (q.equals("yes")) {
						System.out.println("�α��� ����");

						System.out.print("���̵�: ");
						String userId2 = input.next();

						System.out.print("��й�ȣ: ");
						String userPw2 = input.next();

						if (userId.equals(userId2) && passWord.equals(userPw2)) {
							System.out.println("�α��� ����, ��ſ� ���� �Ǽ���~");
							// bool=false; //��ü while�� ����
							break;// �α��ο� ���� while��
						} else {
							System.out.println("�α��� ����, �ٽ÷α��� �ϼ���");
						}

					} else if (q.equals("exit")) {
						System.out.println("��ü while�� ����");
						bool = false;
						break;
					} else {
						System.out.println("�Է� ���� -> �ٽ��Է�");
					}
				}

			} else if (order.equals("no")) {
				System.out.println("ȸ������ ���� X, �ٸ� �۾� -> ");
			} else if (order.equals("exit")) {
				System.out.println("while����");
				bool = false;// true -> false
				// while(true) -> break;
			} else {
				System.out.println("�Է°� ����-> �ٽ� �Է� �ϼ���");
			}
			System.out.println("��ü while�� �ٽ� ����!!");
		}

		input.close();

	}
}

