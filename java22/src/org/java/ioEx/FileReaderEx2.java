package org.java.ioEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderEx2 {

	public static void main(String[] args) {
		System.out.println("FileReader");
		
		String fileName="C:\\Users\\Administrator\\Desktop\\saveFiles\\test1.txt";
		
		File file=	new File(fileName);
		
		FileReader fileReader =null;
		
		try {
			fileReader =new FileReader(file);
			
			FileInputStream fileInputStream= new FileInputStream(fileName);
			new FileInputStream(fileName);
			new InputStreamReader(fileInputStream,"UTF-8"); //���ڿ� ó�� ��� ������Ʈ �⺻
			new InputStreamReader(fileInputStream,"MS949"); //���ڿ� ó�� ��� ������Ʈ �⺻
			
			
			int inData=0;
			while((inData=fileReader.read())!=-1) {
				System.out.println(inData);
			}
			
		}catch (FileNotFoundException e) {
			System.out.println("���� NO");
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println("����� Faile!");
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
