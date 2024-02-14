package org.java.collectionEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		System.out.println("ArrayList");
		//객체만 저장
		//순서가 있고 0~
		//길이가 자동으로 설정 
		
		List<String> arr1= new ArrayList<String>();
		String s1="문자열3";
		
		arr1.add("문자열1");
		arr1.add(new String("문자열2"));
		arr1.add(s1);
		arr1.add("문자열4");
		arr1.add("문자열5");
		

		// 확장형 for문 -> foreach문
		for(String str:arr1) {
			System.out.println(str);
		}
		
		System.out.println("Iterator");
		
		// Iterator
		Iterator<String> iter=arr1.iterator();
		while(iter.hasNext()) {
			String str =iter.next();
			System.out.println(str);
		}
		
		System.out.println(arr1.size());
		System.out.println(arr1.contains("문자열1"));
		System.out.println(arr1.indexOf("문자열1"));
		System.out.println(arr1.isEmpty());
		System.out.println(arr1.remove(0));
		System.out.println(arr1);
		
		
		//forEach -> 모든 컬렉션 요소를 조회 , 타입을 X
		// 미리 타입을 인지 한 상태에서 사용 
		arr1.forEach(element ->{
			if(element.equals("문자열2"))
			System.out.println(element);
		});
		
		
		
		
	}
}
