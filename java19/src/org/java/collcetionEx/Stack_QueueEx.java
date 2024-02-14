package org.java.collcetionEx;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_QueueEx {

	public static void main(String[] args) {
		
		System.out.println("Strack->push(),pop()");
		
		Stack<Integer> stack=new Stack<Integer>();
		stack.add(10);
		stack.add(20);
		stack.add(30);
		stack.add(40);
		stack.add(50);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);

		System.out.println("Queue");

		Queue<Integer> queue =new LinkedList<Integer>();
		queue.add(100);
		queue.add(200);
		queue.add(300);
		queue.add(400);
		queue.add(500);
	
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		
	}
	
}
