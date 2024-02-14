package org.java.threadEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread3 extends Thread{
	
	JLabel timerlabel;
	
	
	public TimerThread3() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param timerlabel
	 */
	public TimerThread3(JLabel timerlabel) {
		super();
		this.timerlabel = timerlabel;
	}
	int count=0;
	
	@Override
	public void run() {
		System.out.println("timer Thread-> ");
		
		
		
		while(true) {
								//int -> String
			timerlabel.setText(Integer.toString(count));
			
		try {	
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
			return;
		}
		count++;
			
		
		}
		
	
	
	}
}

public class ThreadTimerEx3 extends JFrame{
	
	
	
	public ThreadTimerEx3() {
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
		
	JFrame jFrame=new JFrame("Thread Test");
	jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
	
	
	//2. Container ����-> ���۳�Ʈ ��Ƶ�~~~~
	Container container=jFrame.getContentPane();
	container.setLayout(new FlowLayout());
	
	//3.Label ����
	JLabel jLabel=new JLabel();
	jLabel.setFont(new Font("Arial",Font.ITALIC,100));
	//4.Label -> �г�(�����̳�)�� �߰�
	container.add(jLabel);
	
	//5. JFrame ũ�� ����
	jFrame.setSize(300,200);
	//6. jFrame ������~
	
	jFrame.setVisible(true);
	
	//7. Thread ����
	TimerThread3 timer=	new TimerThread3(jLabel);
		timer.start(); //Thread ����
	}
}
