package org.java.ioEx;

import java.io.IOException;
import java.io.InputStreamReader;

public class IoEx4 {

	public static void main(String[] args) {
		System.out.println("IO");
		
		InputStreamReader iReader=new InputStreamReader(System.in);
		
		while(true) {
			System.out.println("�Է�:");
			
		try {
			int inData=	iReader.read();
			// -1(ctr+z) ������ ���� 
			if(inData==-1) {
				System.out.println("����");
				break;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
			
		}
		
	}
}
