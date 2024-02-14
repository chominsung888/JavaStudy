package org.java.ioEx;

import java.io.IOException;
import java.io.InputStreamReader;

public class IoEx4 {

	public static void main(String[] args) {
		System.out.println("IO");
		
		InputStreamReader iReader=new InputStreamReader(System.in);
		
		while(true) {
			System.out.println("입력:");
			
		try {
			int inData=	iReader.read();
			// -1(ctr+z) 누르면 종료 
			if(inData==-1) {
				System.out.println("종료");
				break;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
			
		}
		
	}
}
