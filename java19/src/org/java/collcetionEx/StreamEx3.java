package org.java.collcetionEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx3 {
	public static void main(String[] args) {
		System.out.println("Stream");
		
		List<String> list=new ArrayList<String>();
		list.add("ma1");
		list.add("a1");
		list.add("ca1");
		list.add("ta1");
		list.add("r1");
		System.out.println();
		
		
		//1. Stream
		Stream<String> stream1=list.stream();
		//2. ���, forEach()
//		stream1.forEach(System.out::println);
		/*
		 * stream1.forEach(elment-> { System.out.println(elment); });
		 */
		//3.���͸�(����)
		stream1
		.filter(el->el.contains("a")) //�˻���
	//  .map(el-> el.toUpperCase())	
		//��Ҹ� ���� �빮�ڷ� ���� 
		.map(String::toUpperCase)    //�˻����� -> �빮�ڷ� ����
		.sorted() //����(��������)
		.collect(Collectors.toList()) //������� List�� ���� *** ��� ��밡��
		.forEach(System.out::println); //�����
		
		

		
	}
}
