package org.java.ioEx;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx2 {
	public static void main(String[] args) {

		System.out.println("IO");
		FileReader fReader=null;
		String fileName = "C:\\test3.txt";
		
		try {
			fReader=new FileReader(fileName);
			
			int inData=0;
			while((inData=fReader.read()) !=-1) {
				System.out.println((char)inData);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일 No");
			e.printStackTrace();
		}catch(IOException e) {
			System.out.println("입출력 Fail!");
			e.printStackTrace();
		}finally {
			if(fReader!=null)
				try {
					fReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
	}

}
