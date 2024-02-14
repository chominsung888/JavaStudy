package org.java.ioEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStteamEx {

	public static void main(String[] args) {
		System.out.println("IO");
		// 파일 (텍스트이진)을 읽어드린다.

		FileInputStream fStream = null;
		String fileName = "C:\\windows\\system.ini";

		try {
			fStream = new FileInputStream(fileName);

			int inData = 0;

			// 파일의 데이터를 하나씩 -> 파일의 마지막 -1
			while ((inData = fStream.read()) != -1) {
				// 하나씩 출력 -> 공백, 엔터
				System.out.print((char) inData);
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일 NO");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일 입출력 Fail!!");
			e.printStackTrace();
		}

	}
}
