package org.java.threadEx;

class TheadSub extends Thread{
//ThreadŬ������ ��� �޾Ƽ� run()�������̵�
	//1. Thread ����
	//TreadŬ���� -> run()���� 
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
		tread1.start();//Thread ����
		
	}
}
