package org.java.ioEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamEx {

	public static void main(String[] args) {
		System.out.println("IO");
		//����(�ؽ�Ʈ+����)�� �����Ѵ�.(���ϸ����)
		
		FileOutputStream outputStream=null;
		String fileName="C:\\test1.out";
			FileInputStream fiStream=null;
		
		try {
			//��������////
			//�Է��� �޾Ƽ� ������ ��Ų��. -> write()-> 
		outputStream=new FileOutputStream(fileName);
		
		//�Է��� �޾Ƽ� ������ ��Ų��. -> write() ->
		FileInputStream filStream=null;
		
		//10~1���ڸ� ���� -> fiStream
		for(int i=0; i<10;i++) {
			int num=10-i;/// 10 9 8 7 ,,,1
			System.out.println(num+"<<-");
			outputStream.write(num);
		}
			if(outputStream!=null);
			//������ �о�帰��.

		filStream=new FileInputStream(fileName);
		int inData=0;
		while((inData =fiStream.read()) !=-1){
			System.out.print((char)inData);
		}
		
		
		} catch (FileNotFoundException e) {
			System.out.println("����No");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("���� ����� Faill!");
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
