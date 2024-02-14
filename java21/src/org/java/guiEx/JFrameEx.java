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
		// 1. Jframe생성
		JFrame jframe = new JFrame();
		// title 생성
		jframe.setTitle("JFrame test");
		// 기본적으로 x 클릭후 JFrmae을 제거
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);// 3

		jframe.setLayout(new FlowLayout());

		// 2.Container 생성, 선택
		Container container = jframe.getContentPane(); // 생략 가능
		container.setLayout(new FlowLayout(FlowLayout.CENTER)); // 컴포넌트 기본정리

		// 3.JButton생성
		JButton jButton1 = new JButton();
		jButton1.setText("BUTTON1");
		jButton1.setSize(50, 50);
		// 컨테이너에 추가
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
		jLabel1.setText("라벨");
		jLabel1.setSize(50, 50);

		container.add(jLabel1);

		// JmenuBar -> 메뉴 구성 바
		JMenuBar jMenuBar = new JMenuBar();
		// JMenu -> JMenuBar

		JMenu jMenu1 = new JMenu("MENU1");
		// JMenuItem -> JMenu
		JMenu JMenu1 = new JMenu("언어");
		// 3. JMenuItem -> JMenu
		JMenuItem jMenuItem1 = new JMenuItem();
		// 4. JMenuItem -> JMenu 추가
		jMenuItem1.setText("java");

		JMenuItem jMenuItem2 = new JMenuItem("SQL");
		JMenuItem jMenuItem3 = new JMenuItem("Servlet");

		JMenu1.add(jMenuItem1);
		JMenu1.add(jMenuItem2);
		JMenu1.add(jMenuItem3);

		JMenu jMenu2 = new JMenu("MENU2");
		JMenu jMenu3 = new JMenu("MENU3");

		// JMenuBar에 메뉴를 추가
		jMenuBar.add(jMenu1);
		jMenuBar.add(jMenu2);
		jMenuBar.add(jMenu3);

		// JMenuBar -> Container(JFrame)에 추가

		jframe.add(jMenuBar);
		container.add(jMenuBar);

		// JFrame 크기
		jframe.setSize(500, 300);
		// 보여라~
		jframe.setVisible(true);

	}
}
