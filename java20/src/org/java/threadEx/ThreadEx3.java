package org.java.threadEx;

//2. Runnable �������̽��� ����
class ThreadSub3 implements Runnable{

	@Override
	public void run() {
		System.out.println("Runnable�������̽� -> run()");
		// TODO Auto-generated method stub
		
	}
	
}



public class ThreadEx3 {
	public static void main(String[] args) {
		System.out.println("Thread");
		
		Runnable t1=new ThreadSub3();
		Thread t2 =new Thread(t1);
		
		t2.start(); //Thread ���� 
		
		/////////////////////////////
		Thread t3 = new Thread(new ThreadSub3());
		t3.start();
		
		
		/////////////////////////////
	Thread t4=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Runnable �������̽� -> run() �͸�Ŭ����");
				
			}
		});
	t4.start();
	//////////////////////�ż��� �ϳ��� �������̽�->>>>>>> ���ٽ�////////////////////////
	//Thread t5= new Thread(() -> System.out.println("Runnable �������̽� -> run() �͸�Ŭ����"));
	Thread t5=new Thread(()->{
		System.out.println("Runnable�������̽� -> run() ���ٽ�");
	});
	
	t5.start(); //Thread ���� start()
	
	
	
	}

}
