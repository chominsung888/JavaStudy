package org.java.guiEx;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame {

	public FlowLayoutEx() {

		this.setTitle("FlowLayout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// TODO Auto-generated constructor stub

		this.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 50));

		this.add(new JButton("add"));
		this.add(new JButton("sub"));
		this.add(new JButton("mul"));
		this.add(new JButton("div"));
		this.add(new JButton("Calulate"));

		this.setSize(500, 300);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		System.out.println("FlowLayout");

		new FlowLayoutEx();

	}
}
