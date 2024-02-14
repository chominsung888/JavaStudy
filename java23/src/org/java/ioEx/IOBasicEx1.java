package org.java.ioEx;

import java.io.IOException;
import java.io.InputStream;



public class IOBasicEx1 {
	public static void main(String[] args) {
		System.out.println("IO");
		// �Է� -> ���
		
		
		InputStream inStream=System.in; // �ý��� �Է°�ü
	try {
		int inData= inStream.read(); //byte -> int
		System.out.println("�Է� ������:"+inData);
		System.out.println("���(����)������:"+(char)inData);
	}catch (IOException e) {
		e.printStackTrace();
	}finally {
		try {
			inStream.close(); //����� ���ܿ� ��� ���� ���
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
		
	}
}
