package org.java.ioEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamEx {

	public static void main(String[] args) {
		System.out.println("IO");
		//파일(텍스트+이진)을 저장한다.(파일만들기)
		
		FileOutputStream outputStream=null;
		String fileName="C:\\test1.out";
			FileInputStream fiStream=null;
		
		try {
			//파일저장////
			//입력을 받아서 저장을 시킨다. -> write()-> 
		outputStream=new FileOutputStream(fileName);
		
		//입력을 받아서 저장을 시킨다. -> write() ->
		FileInputStream filStream=null;
		
		//10~1숫자를 저장 -> fiStream
		for(int i=0; i<10;i++) {
			int num=10-i;/// 10 9 8 7 ,,,1
			System.out.println(num+"<<-");
			outputStream.write(num);
		}
			if(outputStream!=null);
			//파일을 읽어드린다.

		filStream=new FileInputStream(fileName);
		int inData=0;
		while((inData =fiStream.read()) !=-1){
			System.out.print((char)inData);
		}
		
		
		} catch (FileNotFoundException e) {
			System.out.println("파일No");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일 입출력 Faill!");
			e.printStackTrace();
		}finally {
			try {
				outputStream.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
