package org.java.guiEx;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class SwingEx3 extends JFrame {

	public SwingEx3() {

		this.setTitle("Swing Menu");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout(FlowLayout.LEFT));

		JMenuBar jMenuBar = new JMenuBar();

		JMenu jMenu1 = new JMenu("����(F)");
		JMenu jMenu2 = new JMenu("����(H)");

		JMenuItem newItem = new JMenuItem("������(N)");
		JMenuItem saveItem = new JMenuItem("����(S)");
		JMenuItem openItem = new JMenuItem("����(O)");
		JMenuItem closeItem = new JMenuItem("�ݱ�(C)");

		JMenuItem searchItem = new JMenuItem("ã��(H)");

		jMenu1.add(newItem);
		jMenu1.add(saveItem);
		jMenu1.add(openItem);
		jMenu1.add(closeItem);

		jMenu2.add(searchItem);

		jMenuBar.add(jMenu1);
		jMenuBar.add(jMenu2);
		jMenuBar.add(jMenu2);

		this.add(jMenuBar);
		this.setLocation(600, 300);
		this.setSize(400, 200);// ������ ������ ����
		this.setVisible(true);// ���̱�

		closeItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("����");
				System.out.println(this);
				closeFn();
			}
		});
	}

	public void closeFn() {
		System.out.println("����X");
		this.setVisible(false);		
	}

	public static void main(String[] args) {
		System.out.println("Swing");
		new SwingEx3();
	}
}
