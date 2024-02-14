package org.java.collcetionEx;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;


public class StreamEx1 {

	public static void main(String[] args) {
		System.out.println("Stream");

		String[] strArr = { "java", "oracle", "mysql", "servlet", "jsp" };

		// 배열 -> List 변경
		List<String> strArrList = Arrays.asList(strArr);

		for (String str : strArrList) {
			System.out.print(str + " ");
		}
		System.out.println();

		Arrays.sort(strArr);// java jsp mysql oracle servlet
		// 컬렉션 정렬
		Collections.sort(strArrList);// java jsp mysql oracle servlet

		System.out.println("정렬 후 원본 데이터가 변경이 안된다.");

		for (String str : strArrList) {
			System.out.print(str + " ");
		}
		System.out.println();

		System.out.println("Stream -> ");

		String[] strArr2 = { "java", "oracle", "mysql", "servlet", "jsp" };
		List<String> strArrList2 = Arrays.asList(strArr);

		Stream<String> stream1 = Arrays.stream(strArr2); // 배열을 Stream화
		Stream<String> stream2 = strArrList2.stream();

		stream1.sorted().forEach(elment -> {

			System.out.println(elment);
		});
		// stream에 있는 데이터를 정렬하고 하나씩 시스템 println에 집어넣어라
//		stream1.sorted().forEach(System.out::println);

		System.out.println("=======================");

//		stream2.sorted().forEach(element->{
//			System.out.println(element);
//		});
		stream2.sorted().forEach(System.out::print);

	}
}
