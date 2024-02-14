package org.java.guiEx;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MouseEventSub1 implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseClicked-> -> click:\"마우스를 눌렀다 뗐을 때\"");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mousePressed-> -> mousedown:\"마우스를 누르고 있을때\"");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseReleased-> ->  mouseup:\"마우스를 눌렀다 뗐을 때\"");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseEntered-> -> mouseenter:\"위치에 포함 되었을 때\"");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseExited-> -> click:\"위치를 벗어 났을 때\"");

	}
	
}


public class MouseEventEx1 extends JFrame {

	public MouseEventEx1() {
		this.setTitle("MouseEvent");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		
		
		
		
		
		
//		JPanel jpanel=new JPanel();
		
		JButton btn=new JButton("MouseEvent");
		btn.setSize(100,50);
		
	//	MouseE위치를 벗어 났을 때ventSub1 mouseevent=new MouseEventSub1();
		//다형성
		MouseListener mouseevent=new MouseEventSub1();
		//이벤트 바인딩
		btn.addMouseListener(mouseevent);
		
		
		
		this.add(btn);
		this.setLocation(500, 300);
		this.setSize(300, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		System.out.println("MouseEvent");

		new MouseEventEx1();
	}
}
