package org.java.basicApi;

import java.util.Scanner;

public class StringEx3 {
	public static void main(String[] args) {
		System.out.println("String");
		System.out.println("substring");
		
		
		String str1="java 2024 project";
		System.out.println("substring(인덱스) -> 문자열의 인덱스부터 변환(return)");
		
		System.out.println(str1.length()); //17
		System.out.println(str1.substring(0));
		System.out.println(str1.substring(10));
		System.out.println(str1.substring(5));
		System.out.println("project".length()); //project 길이
				
					//10    3 <-끝자리 가져 올 문자열 
					//10 -3 -> 7 -> 인덱스
		String insert="/member_insert.do";
		String dolenth=".do";
		
		// 공식 -> 전체문자열 길이 - 가졍ㄹ 문자열 (끝문자열) -> 
		// substring(시작번지)
		System.out.println(insert.length());
		System.out.println(insert.substring(7));
		// 전체 문자열 길이 - ",do"
		System.out.println(insert.length()-dolenth.length()); //7
		int index=insert.length()-dolenth.length();
		System.out.println(insert.substring(index));
		
		System.out.println("퀴즈:");
		//퀴즈
		//update, select ,delete 문자열에서 마지막. do를 콘솔에 출력
		// 단 .substring() 이용해야합니다. 
		
		String update="/member_update.do"; //".do"
		System.out.println(update.substring(update.length()-".do".length()));
		
		String select="/member_select.do"; //".do"
		System.out.println(update.substring(update.length()-".do".length()));
		
		String delete="/member_delete.do"; //".do"
		System.out.println(update.substring(update.length()-".do".length()));
		
		System.out.println("사용자 요청 정보 입력");
		
		Scanner input=new Scanner(System.in);
		System.out.println("입력(반드시 끝에 .do를 입력: ");
		String query=input.next(); 
		System.out.println(query);
		
		// query에서 .do만 query2에 저장하고 출력
		int index2=query.length()-".do".length();
		String query2=query.substring(index2);//.do제
		System.out.println(query);
	}
	
}
