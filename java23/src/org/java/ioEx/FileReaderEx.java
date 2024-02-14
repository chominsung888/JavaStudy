package org.java.ioEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		System.out.println("IO");

		// ����(�ؽ�Ʈ���ϸ�) �о�帰��.

		String fileName = "E:\\test3.txt";
		// 1.������ �ҷ� �;��Ѵ�.
		File file = new File(fileName);// File -> ����-> �ʱ�ȭ
		// 2.���� ������ �о�帰��.
		FileReader fReader = null;

		try {
			fReader = new FileReader(fileName);

			// �ϳ��� ���� ������ �о� �帰��.
			int inData = 0;
			try {
				while ((inData = fReader.read()) != -1) {
					System.out.println((char) inData);
				}
			} catch (FileNotFoundException e) {
				System.out.println("���� No");
				e.printStackTrace();
			}
		} catch (IOException e) {
			System.out.println("���� ����� Fail");
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
