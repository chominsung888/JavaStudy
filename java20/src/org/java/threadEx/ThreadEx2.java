package org.java.threadEx;

class ThreadSub2 extends Thread {

	int[] arrInt = new int[10];

	// thread Ƚ�� üũ
	int count = 0;

	@Override
	public void run() {

		for (int i = 0; i < arrInt.length; i++) {
			count++;
			System.out.println("Thread ����->Ƚ��:" + count);
			System.out.println("���� ���� Thead:" + Thread.currentThread());

			arrInt[i] = count;

			try {
				Thread.sleep(1000); // 1�ʵ��� ����� ����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}

public class ThreadEx2 {

	public static void main(String[] args) {

		System.out.println("Thread");
		ThreadSub2 t1 = new ThreadSub2();
		t1.start();

		System.out.println("���� ���� main()- Thread:" + Thread.currentThread());

	}

}
