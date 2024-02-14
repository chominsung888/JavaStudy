package org.java.guiEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class ActionEventEx5 extends JFrame{

	
	public ActionEventEx5() {
		this.setTitle("ActionListener");
		this.setLayout(new FlowLayout());
		// TODO Auto-generated constructor stub
		
		Container container =this.getContentPane();
		container.setLayout(new FlowLayout());
		
		JButton btn=new JButton("BUTTON");
		btn.setSize(100,50);
		
		ActionListenerSub1 action1=new ActionListenerSub1();
		
		//익명(무명)클래스로 ActionListener 인터페이스 actionPerformed구현
		btn.addActionListener(new ActionListener() {
			//구현 클래스 없이 익명 클래스 없이 오버라이드를 구현한다.
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e);
				System.out.println(e.getSource());
				System.out.println(e.getID());
				
			}
		} );
		
		container.add(btn);
		
		
		this.setSize(400,200);
		this.setVisible(true);
	
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("ActionListener");
		new ActionEventEx5();
	}
}
