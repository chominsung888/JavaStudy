package org.java.collectionEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Minsung {

	public static void main(String[] args) {
		System.out.println("자바과제 출력");

		List<MemberDto> members = new ArrayList<MemberDto>();

		Scanner input = new Scanner(System.in);
		boolean bool = true;

		while (bool) {
			System.out.println("쿼리문을 입력하세요.");
			String query = input.next();
			if (query.equals("insert")) {
				System.out.println("나이 입력:");
				int age = input.nextInt();
				System.out.println("이름입력:");
				String name = input.next();

				members.add(new MemberDto(age, name));
			} else if (query.equals("select")) {
				for (MemberDto member : members) {
					System.out.println("나이:" + member.getAge());
					System.out.println();
				}
			}

		}

	}
}
