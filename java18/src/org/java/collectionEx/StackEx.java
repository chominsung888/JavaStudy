package org.java.collectionEx;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		System.out.println("Stack");
		
		Stack<Integer> stack1=	new Stack<Integer>();
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		stack1.push(40);
		stack1.push(50);
		
		System.out.println(stack1);
		
		for(Integer i: stack1) {
			System.out.println(i);
		}
		System.out.println(stack1);
			System.out.println();
			
		stack1.pop(); //top -> ���� �������� �߰� -> ����
		System.out.println(stack1);
		
		System.out.println(stack1.peek()); //������ ��� ��ȸ
		System.out.println(stack1.search(10)); //������ ��� ->ó�����
		System.out.println(stack1.isEmpty());
		
		System.out.println();
		// 1~100���� �Է� -> 100~1���� �ֿܼ� ��� �� stack push,pop
		
		Stack<Integer> stack2=new Stack<Integer>();
		for(int i=1;i<=100; i++) {
			stack2.push(i);
		}
		System.out.println(stack2);
		for(int i=0; i<100;i++) {
			System.out.println("top->"+stack2.pop());
			
		}
		
		
	}
}
