package org.java.opEx;

import org.java.inheritanceEx.inheritanceEx1;

public class InheritanceEx1Sub2 extends inheritanceEx1{

	public static void main(String[] args) {
		
		InheritanceEx1Sub2 i1 =new InheritanceEx1Sub2();
		
		i1.num3=10; // 상속-> protected 접근 가능, 다른 패키지
	
	}
}
