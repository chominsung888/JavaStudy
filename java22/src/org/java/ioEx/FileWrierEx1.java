package org.java.ioEx;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWrierEx1 {

	public static void main(String[] args) {
		System.out.println("FileWriter");
		
		
		
		//1.�Է�
	InputStreamReader iReader	=new InputStreamReader(System.in);
		//2.���Ϸ� ���
	FileWriter fwriter=null;// �ؽ�Ʈ ���Ϸ� ����
	String fileName="C\\saveFiles\\test1.txt";
//	String fileName="C:\\Users\\Administrator\\Desktop\\saveFiles\\test1.txt";
	
	try {
		// �ؽ�Ʈ ���Ϸ� ���� 
		fwriter=new FileWriter(fileName);
		
		int inData=0;
		//�Է½� -1 -> ctr+z, ������ �о�帱 �� -1 -> ������ ��
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
