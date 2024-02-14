package org.java.guiEx;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;

class ActionEventListenerSub implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvnet -> 오버라이딩");
	}
}

public class ActionEventEx5 extends JFrame {

	public ActionEventEx5() {
		this.setTitle("ActionEvent");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout(FlowLayout.CENTER));

		JButton jButton1 = new JButton("BUTTON1");
		jButton1.setSize(100, 50);
		
		JButton jButton2 = new JButton("BUTTON2");
		jButton2.setSize(100, 50);
		
		
		JButton jButton3 = new JButton("BUTTON3");
		jButton3.setSize(100, 50);
		
		

		ActionListener action=new ActionEventListenerSub();
		jButton1.addActionListener(action);
		
		//2. 익명(무명 클래스) 이용해서 
		jButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("익명 클래스 -> ActionEvent-> 오버라이딩");
				
			}
		});
		
		//람다식을 이용해서
		jButton3.addActionListener((ActionEvent e) ->{
			System.out.println("람다식 -> ActionEvnet -> 오버라이딩");
			
		});
		
		
		this.add(jButton1);
		this.add(jButton2);
		this.add(jButton3);
		this.setLocation(600, 300);
		this.setSize(300, 200);
		this.setVisible(true);

	}


	public static void main(String[] args) {
		System.out.println("ActionEvent");

		new ActionEventEx5();
	}

}
