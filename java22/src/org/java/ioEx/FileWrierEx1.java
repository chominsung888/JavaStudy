package org.java.ioEx;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWrierEx1 {

	public static void main(String[] args) {
		System.out.println("FileWriter");
		
		
		
		//1.입력
	InputStreamReader iReader	=new InputStreamReader(System.in);
		//2.파일로 출력
	FileWriter fwriter=null;// 텍스트 파일로 저장
	String fileName="C\\saveFiles\\test1.txt";
//	String fileName="C:\\Users\\Administrator\\Desktop\\saveFiles\\test1.txt";
	
	try {
		// 텍스트 파일로 저장 
		fwriter=new FileWriter(fileName);
		
		int inData=0;
		//입력시 -1 -> ctr+z, 파일을 읽어드릴 때 -1 -> 파일의 끝
		while((inData=iReader.read()) !=-1) {
			fwriter.write(inData);
		}
		

		
		
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			iReader.close();
			fwriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	}
}
