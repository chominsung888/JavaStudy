package org.java.threadEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread2 extends Thread{
	
	JLabel timerlabel;
	
	
	public TimerThread2() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param timerlabel
	 */
	public TimerThread2(JLabel timerlabel) {
		super();
		this.timerlabel = timerlabel;
	}
	int count=0;
	
	@Override
	public void run() {
		System.out.println("timer Thread-> ");
		
		
		
		while(true) {
			count++;
								//int -> String
			timerlabel.setText(Integer.toString(count));
			
		try {	
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
			return;
		}
			
		
		}
		
	
	
	}
}

public class ThreadTimerEx2 extends JFrame{
	
	
	
	public ThreadTimerEx2() {
		System.out.println("�⺻ ������-> ThreadTimerEx2");
		
		// JFrame �⺻ ���� 
		this.setTitle("ThreadTimer2");// JFrame -> Ÿ��Ʋ 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X������ JFrame ����
		Container container=this.getContentPane(); // ������Ʈ�� �����̳� 
		container.setLayout(new FlowLayout()); // ���ͳ��̳� �ȿ��� ���۳�Ʈ�� �⺻ ��ġ
		
		JLabel timerLabel=new JLabel();
							//�۲�(font-family) , ����(font-weight) , ũ��(font-size) 
		timerLabel.setFont(new Font("Gothic", Font.BOLD, 200));
		timerLabel.setText("Start!!");
	//	timerLabel.setBackground(Color.cyan);
		
		//�� �����̳ʿ� �߰� 
		container.add(timerLabel);
		
		this.setSize(500, 300);// width,height
		this.setVisible(true); //������~
		//Thread
		TimerThread2 thread=new TimerThread2(timerLabel);
		thread.start();
	}
	
	public static void main(String[] args) {
		System.out.println("Thread �ǽ�");
		
		
		new ThreadTimerEx2();
		
		
	}
}
