package org.java.guiEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionEventEx7 extends JFrame implements ActionListener {

	JButton btn1=null;
	JButton btn2=null;
	JButton btn3=null;
	
	public ActionEventEx7() {
		this.setTitle("ActionListener");
		this.setLayout(new FlowLayout());
		// TODO Auto-generated constructor stub

		Container container = this.getContentPane();
		container.setLayout(new FlowLayout());

		btn1 = new JButton("BUTTON1");
		btn1.setSize(100, 50);

		 btn2 = new JButton("BUTTON2");
		btn2.setSize(100, 50);
	
		btn3 = new JButton("BUTTON3");
		btn3.setSize(100, 50);
	
		
		container.add(btn1);
		container.add(btn2);
		container.add(btn3);
		
		this.setLocation(700, 300);
		this.setSize(400, 200);
		this.setVisible(true);
	
		// ActionListener ���� �޾� ���� ��ü this-> addActionListener(this)
		// *** ���� ��ü �̺�Ʈ�� ���-> 2�� �̻��� ��ü�� ActionEvent ����
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			System.out.println(e);
			System.out.println(e.getSource()); //Ŭ���� ��ü�� ��
			System.out.println(e.getID());
			
			if(e.getSource()==btn1) {
				System.out.println("btn1");
			}else if(e.getSource()==btn2) {
				System.out.println("btn2");
			}else if(e.getSource()==btn3) {
				System.out.println("btn3");
		
	}else {
		System.out.println("Ŭ���� ��ü�� �������� �ʽ��ϴ�.");
	}
}
	
	public static void main(String[] args) {
		System.out.println("ActionListener");

		new ActionEventEx7();
	}

}
