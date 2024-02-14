package org.java.ioEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {

	public static void main(String[] args) {
		System.out.println("FileReader");
		
		String fileName="C:\\Users\\Administrator\\Desktop\\saveFiles\\test1.txt";
		
		File file=	new File(fileName);
		
		FileReader fileReader =null;
		
		try {
			fileReader =new FileReader(file);
			
			int inData=0;
			while((inData=fileReader.read())!=-1) {
				System.out.println(inData);
			}
			
		}catch (FileNotFoundException e) {
			System.out.println("파일 NO");
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println("입출력 Faile!");
			e.printStackTrace();
		}finally {
			try {
				fileReader.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
