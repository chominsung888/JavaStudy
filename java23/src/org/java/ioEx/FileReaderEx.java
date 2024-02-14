package org.java.ioEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		System.out.println("IO");

		// 파일(텍스트파일만) 읽어드린다.

		String fileName = "E:\\test3.txt";
		// 1.파일을 불러 와야한다.
		File file = new File(fileName);// File -> 생성-> 초기화
		// 2.파일 내용을 읽어드린다.
		FileReader fReader = null;

		try {
			fReader = new FileReader(fileName);

			// 하나씩 파일 내용을 읽어 드린다.
			int inData = 0;
			try {
				while ((inData = fReader.read()) != -1) {
					System.out.println((char) inData);
				}
			} catch (FileNotFoundException e) {
				System.out.println("파일 No");
				e.printStackTrace();
			}
		} catch (IOException e) {
			System.out.println("파일 입출력 Fail");
			e.printStackTrace();
		}finally {
			try {
				if(fReader!=null)fReader.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
