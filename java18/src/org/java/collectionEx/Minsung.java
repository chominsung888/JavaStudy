package org.java.collectionEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Minsung {

	public static void main(String[] args) {
		System.out.println("�ڹٰ��� ���");

		List<MemberDto> members = new ArrayList<MemberDto>();

		Scanner input = new Scanner(System.in);
		boolean bool = true;

		while (bool) {
			System.out.println("�������� �Է��ϼ���.");
			String query = input.next();
			if (query.equals("insert")) {
				System.out.println("���� �Է�:");
				int age = input.nextInt();
				System.out.println("�̸��Է�:");
				String name = input.next();

				members.add(new MemberDto(age, name));
			} else if (query.equals("select")) {
				for (MemberDto member : members) {
					System.out.println("����:" + member.getAge());
					System.out.println();
				}
			}

		}

	}
}
