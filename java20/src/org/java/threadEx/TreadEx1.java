package org.java.threadEx;

class TheadSub extends Thread{
//Thread클래스를 상속 받아서 run()오버라이딩
	//1. Thread 구현
	//Tread클래스 -> run()구현 
	@Override
	public void run() {
		System.out.println("Thread run()");
		
	}
}


public class TreadEx1 {

	public static void main(String[] args) {
		System.out.println("Thread");
		TheadSub tread1=new TheadSub();
		//tread1.run();
		tread1.start();//Thread 실행
		
	}
}
