package org.java.threadEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread extends Thread {	
	//Swing ���۳�Ʈ
	JLabel timerLabel;// Ÿ�̸��� ǥ�ñ�

	public TimerThread(JLabel timerLabel) {
		super();
		this.timerLabel = timerLabel;
	}

	@Override // �������ڵ�, run�ż��尡 �����ϸ� �����嵵 ����
	public void run() {
		int num = 0;// Ÿ�̸�ī��Ʈ
		
		while (true) {
			//������ �����ʹ� ���ڿ���ȯ
			timerLabel.setText(Integer.toString(num));//0 1 2,,,
			num++;
			try {
				Thread.sleep(1000); // 1�ʵ���..
			} catch (InterruptedException e) {
				e.printStackTrace();
				//InterruptedException ���� ������ ����
				return;// ������ �����ض�. -> Run()����
			}
		}
	}

}

public class ThreadTimerEx extends JFrame {

	private static final long serialVersionUID = 1L;	
	//������
	public ThreadTimerEx() {		
		//JFrame -> ����
		// JFrame ����
		
		setTitle("Thread Timer ����");		
		//X������ �� ����		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();// �г��ϳ�
		c.setLayout(new FlowLayout());

		// timerLaber
		JLabel timerLaber = new JLabel();// Ÿ�̸� ��
						     //(�۲�, ����, ũ��)
		timerLaber.setFont(new Font("Gothic", Font.BOLD, 120));
		c.add(timerLaber);
		// timerLaber
		
			// width,height
		setSize(500, 300);
		setVisible(true);// ������
		// JFrame ����

		// Thread
		TimerThread thread = new TimerThread(timerLaber);
		thread.start();
	}

	public static void main(String[] args) {
		new ThreadTimerEx();
	}
}