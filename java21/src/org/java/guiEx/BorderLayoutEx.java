package org.java.guiEx;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class BorderLayoutEx extends JFrame {

	public BorderLayoutEx() {

		this.setTitle("BorderLayout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// TODO Auto-generated constructor stub

		this.setLayout(new BorderLayout());

		this.add(new JButton("EAST"), BorderLayout.EAST);
		this.add(new JButton("WEST"), BorderLayout.WEST);
		this.add(new JButton("SOUTH"), BorderLayout.SOUTH);
		this.add(new JButton("NORTH"), BorderLayout.NORTH);
		this.add(new JButton("CENTER"), BorderLayout.CENTER);

		this.setSize(500, 300);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		System.out.println("BoarderLayout");

		new BorderLayoutEx();

	}
}
