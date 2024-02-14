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
		System.out.println("기본 생성자-> ThreadTimerEx2");
		
		// JFrame 기본 설정 
		this.setTitle("ThreadTimer2");// JFrame -> 타이틀 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X누르면 JFrame 제거
		Container container=this.getContentPane(); // 컴포넌트의 컨테이너 
		container.setLayout(new FlowLayout()); // 컨터네이너 안에서 컴퍼넌트의 기본 배치
		
		JLabel timerLabel=new JLabel();
							//글꼴(font-family) , 굵기(font-weight) , 크기(font-size) 
		timerLabel.setFont(new Font("Gothic", Font.BOLD, 200));
		timerLabel.setText("Start!!");
	//	timerLabel.setBackground(Color.cyan);
		
		//라벨 컨테이너에 추가 
		container.add(timerLabel);
		
		this.setSize(500, 300);// width,height
		this.setVisible(true); //보여라~
		//Thread
		TimerThread2 thread=new TimerThread2(timerLabel);
		thread.start();
	}
	
	public static void main(String[] args) {
		System.out.println("Thread 실습");
		
	JFrame jFrame=new JFrame("Thread Test");
	jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
	
	
	//2. Container 생성-> 컴퍼넌트 모아둔~~~~
	Container container=jFrame.getContentPane();
	container.setLayout(new FlowLayout());
	
	//3.Label 생성
	JLabel jLabel=new JLabel();
	jLabel.setFont(new Font("Arial",Font.ITALIC,100));
	//4.Label -> 패널(컨테이너)에 추가
	container.add(jLabel);
	
	//5. JFrame 크기 설정
	jFrame.setSize(300,200);
	//6. jFrame 보여라~
	
	jFrame.setVisible(true);
	
	//7. Thread 연동
	TimerThread3 timer=	new TimerThread3(jLabel);
		timer.start(); //Thread 시작
	}
}
