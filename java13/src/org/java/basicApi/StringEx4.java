package org.java.basicApi;

public class StringEx4 {
	public static void main(String[] args) {
		System.out.println("String");
		System.out.println("String-> 특정 문자열 추출");
		
		// 1.substring(인덱스) -> 인덱스부터 문자열 추출
		String str1="java 2024 project";
		
		System.out.println(str1.substring(10)); //10번지부터 추출
		//공식 -> 전체문자열 길이 - 가져올 문자열(끝문자열)
		// -> 가져올 시작번지
		// substring(시작번지)
		String str2="123456789";
		int size=str2.length();
		System.out.println(size);
		int num=3; // 가져올 마지막 문자열 갯수(7,8,9)
		int index1=size-num; //문자열에서 가져올 마지막 인덱스 
		//문자열의 인덱스부터 가져와라 
		System.out.println(str2.substring(index1)); 
		
		String str3="member .do";
		int str3Index=str3.length()-3; // 전체 길이에서 - 가져올 문자열 갯수(마지막) 
		
		System.out.println(str3.substring(str3Index));
		
		//2. substring(시작번지,끝번지-1)-> 문자열의 시작번지부터 끝번지-1 문자열을 추출 
		String str4="java oracle project";
		
		System.out.println(str4.substring(0,4));
		System.out.println(str4.substring(5,11));
		System.out.println(str4.substring(12,19));
		
		String insert="/member_insert.do";
		
		System.out.println(".do를 제외한 문자열을 추출하여 콘솔에 출력");
		
		//2.substring(시작번지,끝번지) -> 문자열의 시작번지부터 끝번지 -1 문자열을 추출
		// 특정문자열에서 끝문자열을 제외하고 나머지 문자열을 추출 하고 싶을 때
		//**특정문열.substring(0,); //0번지 부터 문자열을 가져올 때는 (0,가져올 문자열갯수)
		// 전체 문자열길이 - 제외할 문자열의 길이 ->14
		// 3-> .do
		
		//0번지 14개 문자열을 추출 
		
		System.out.println(insert.substring(0,14));// 0번지 14개 문자열을 추출 
		int num2=insert.length()-3; 
		System.out.println(num2);
		System.out.println(insert.substring(num2));
		
		//특정문자열에서 0번지부터 문자열을 추출 할 때(마지막 문자열을 제외하고)
		// 가져올 문자열 갯수-> 전체문자열 길이 - 마지막제외 문자열 길이 
		//특정문자열.substring(0,가져올 문자열 갯수) -> 제외 할 문자열(마지막) 이외에
		//0번지부터 문자열을 추출 
		
		String s1="/index.do";
		// "/index"
		System.out.println(s1.substring(0,6));
		System.out.println(s1.substring(0,s1.length()-3));
		
		
		String s2="/memberUpdate.do";
		// "/memberUpdate"
		System.out.println(s2.substring(0,13));
		System.out.println(s2.substring(0,s2.length()-3));
		
		String s3="/modify.do";
		// "/modify"
		System.out.println(s3.substring(0,7));
		System.out.println(s3.substring(0,s3.length()-3));
		
		String s4="/admin_shop.do";
		// "/admin_shop"
		System.out.println(s4.substring(0,11));
		System.out.println(s4.substring(0,s4.length()-3));
		
		
		//".do"끝나는 문자열
	//4.substring(전체길이-3);// 마지막 3글자 
		
	}

}
