package org.java.guiEx;
import java.awt.GridLayout;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame{
public GridLayoutEx() {
	
	
	
	this.setTitle("GridLayout");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//������ �����츦 ������ ���α׷� ����
	
	
	GridLayout grid =new GridLayout(4,2);
	//4x2 ������ GridLayout ��ġ ������ ����
	grid.setVgap(5); //���� ������ ���� ������ 5�ȼ��� ����
	grid.setHgap(10);// ���� ������ ���� ������ 10�ȼ��� ����
	this.setLayout(grid); //grid�� ����Ʈ���� ��ġ�����ڷ� ����
	
	this.setLayout(new GridLayout(4,2,5,10));
	
	add(new JLabel("�̸�"));
	add(new JTextField(""));
	add(new JLabel("�й�"));
	add(new JTextField(""));
	add(new JLabel("�а�"));
	add(new JTextField(""));
	add(new JLabel("����"));
	add(new JTextField(""));
	
	this.setSize(400,300);
	this.setVisible(true);
}
	

















public static void main(String[] args) {
	System.out.println("GreidLayout");
	new GridLayoutEx();
}
}













