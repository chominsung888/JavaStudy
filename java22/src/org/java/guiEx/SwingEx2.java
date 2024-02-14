package org.java.guiEx;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingEx2 extends JFrame {
	
	JLabel idLabel,pwLabel,titleLabel,logoLabel;
	JTextField id;// �Է�-> �Է°��� ���δ�.
	JPasswordField password;// �Է�-> *****
	JButton loginBtn,joinBtn;// ��ư���� 
	JTextArea memo; //tetxarea -> �۳����� ���� �� (�ڱ�Ұ�) 
	JPanel idPanel,pwPanel,memberPanel; // Panel  
	
	
	public SwingEx2() {
		super("Swing Commponents");
		this.setTitle("Swing Commponets");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container=	this.getContentPane();
		container.setLayout(new FlowLayout());
		//Label
		titleLabel=new JLabel("ID&PW�� �Է��ϼ���");
		
		idLabel=new JLabel("ID:");
		pwLabel=new JLabel("PW:");
		//input
		id=new JTextField(10);
		password=new JPasswordField(10);
		//Button
		loginBtn=new JButton("LOGIN");
		joinBtn=new JButton("JOIN");
		//textarea
		memo=new JTextArea(5,10); // 5�� 30��
		//��ũ��  -> ���� ������Ʈ ��ũ�ѹٰ� ����.
		JScrollPane scrollPane=new JScrollPane(memo);
		
		idPanel=new JPanel();
		pwPanel=new JPanel();
		memberPanel=new JPanel();
		
		// ���� panel�� �߰�
		
		//titleLabel
		container.add(titleLabel);
		
		//���� panel�� �߰�
		idPanel.add(idLabel);
		idPanel.add(id);
		
		pwPanel.add(pwLabel);
		pwPanel.add(password);

		memberPanel.add(loginBtn);
		memberPanel.add(joinBtn);
		
		container.add(idPanel);
		container.add(pwPanel);
		container.add(memberPanel);
		
		container.add(scrollPane);
		
		
		
		
		this.setLocation(600,300);
		this.setSize(200,300);
		this.setVisible(true);
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Swing");
		new SwingEx2();
		
	}
}
