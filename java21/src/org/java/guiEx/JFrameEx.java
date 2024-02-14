package org.java.guiEx;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JFrameEx {

	public static void main(String[] args) {
		System.out.println("JFrame");
		// 1. Jframe����
		JFrame jframe = new JFrame();
		// title ����
		jframe.setTitle("JFrame test");
		// �⺻������ x Ŭ���� JFrmae�� ����
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);// 3

		jframe.setLayout(new FlowLayout());

		// 2.Container ����, ����
		Container container = jframe.getContentPane(); // ���� ����
		container.setLayout(new FlowLayout(FlowLayout.CENTER)); // ������Ʈ �⺻����

		// 3.JButton����
		JButton jButton1 = new JButton();
		jButton1.setText("BUTTON1");
		jButton1.setSize(50, 50);
		// �����̳ʿ� �߰�
		container.add(jButton1);

		JButton jButton2 = new JButton();
		jButton2.setText("BUTTON2");
		jButton2.setSize(50, 50);
		container.add(jButton2);

		JButton jButton3 = new JButton();
		jButton3.setText("BUTTON3");
		jButton3.setSize(50, 50);
		container.add(jButton3);

		JButton jButton4 = new JButton();
		jButton4.setText("BUTTON4");
		jButton4.setSize(50, 50);
		container.add(jButton4);

		// JLabel
		JLabel jLabel1 = new JLabel();
		jLabel1.setText("��");
		jLabel1.setSize(50, 50);

		container.add(jLabel1);

		// JmenuBar -> �޴� ���� ��
		JMenuBar jMenuBar = new JMenuBar();
		// JMenu -> JMenuBar

		JMenu jMenu1 = new JMenu("MENU1");
		// JMenuItem -> JMenu
		JMenu JMenu1 = new JMenu("���");
		// 3. JMenuItem -> JMenu
		JMenuItem jMenuItem1 = new JMenuItem();
		// 4. JMenuItem -> JMenu �߰�
		jMenuItem1.setText("java");

		JMenuItem jMenuItem2 = new JMenuItem("SQL");
		JMenuItem jMenuItem3 = new JMenuItem("Servlet");

		JMenu1.add(jMenuItem1);
		JMenu1.add(jMenuItem2);
		JMenu1.add(jMenuItem3);

		JMenu jMenu2 = new JMenu("MENU2");
		JMenu jMenu3 = new JMenu("MENU3");

		// JMenuBar�� �޴��� �߰�
		jMenuBar.add(jMenu1);
		jMenuBar.add(jMenu2);
		jMenuBar.add(jMenu3);

		// JMenuBar -> Container(JFrame)�� �߰�

		jframe.add(jMenuBar);
		container.add(jMenuBar);

		// JFrame ũ��
		jframe.setSize(500, 300);
		// ������~
		jframe.setVisible(true);

	}
}
