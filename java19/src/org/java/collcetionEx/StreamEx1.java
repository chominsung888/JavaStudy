package org.java.collcetionEx;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;


public class StreamEx1 {

	public static void main(String[] args) {
		System.out.println("Stream");

		String[] strArr = { "java", "oracle", "mysql", "servlet", "jsp" };

		// �迭 -> List ����
		List<String> strArrList = Arrays.asList(strArr);

		for (String str : strArrList) {
			System.out.print(str + " ");
		}
		System.out.println();

		Arrays.sort(strArr);// java jsp mysql oracle servlet
		// �÷��� ����
		Collections.sort(strArrList);// java jsp mysql oracle servlet

		System.out.println("���� �� ���� �����Ͱ� ������ �ȵȴ�.");

		for (String str : strArrList) {
			System.out.print(str + " ");
		}
		System.out.println();

		System.out.println("Stream -> ");

		String[] strArr2 = { "java", "oracle", "mysql", "servlet", "jsp" };
		List<String> strArrList2 = Arrays.asList(strArr);

		Stream<String> stream1 = Arrays.stream(strArr2); // �迭�� Streamȭ
		Stream<String> stream2 = strArrList2.stream();

		stream1.sorted().forEach(elment -> {

			System.out.println(elment);
		});
		// stream�� �ִ� �����͸� �����ϰ� �ϳ��� �ý��� println�� ����־��
//		stream1.sorted().forEach(System.out::println);

		System.out.println("=======================");

//		stream2.sorted().forEach(element->{
//			System.out.println(element);
//		});
		stream2.sorted().forEach(System.out::print);

	}
}
