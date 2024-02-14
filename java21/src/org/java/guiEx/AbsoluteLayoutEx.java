package org.java.guiEx;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AbsoluteLayoutEx extends JFrame{
public AbsoluteLayoutEx() {
	
	
	
	this.setTitle("GridLayout");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//������ �����츦 ������ ���α׷� ����
	
	Container container=this.getContentPane();
	container.setLayout(null);//�⺻���� X -> �������� ���ġ
	
	JLabel jLabel=new JLabel("Lable");
	JTextField jTextField= new JTextField("ID");
	JButton jButton1= new JButton("BUTTON1");
	JButton jButton2= new JButton("BUTTON2");
	
	jLabel.setOpaque(true); //���� ���� �⺻ üũ
	jLabel.setBackground(Color.CYAN);
	jLabel.setBounds(0,0,100,100);
	
	jTextField.setBounds(0, 0, 120, 80);
	
	jButton1.setBounds(0, 0, 150, 60);
	jButton2.setBounds(100, 100, 200, 40);
	
	container.add(jLabel);
	container.add(jTextField);
	container.add(jButton1);
	container.add(jButton2);
	
	
//	this.add(container);

	this.setSize(500,300);
	this.setVisible(true);
	
	
}
	











public static void main(String[] args) {
	System.out.println("GreidLayout");
	new AbsoluteLayoutEx();
}
}













