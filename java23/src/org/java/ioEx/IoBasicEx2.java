package org.java.ioEx;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IoBasicEx2 {

	public static void main(String[] args) {
		System.out.println("IO");
		//�ֿܼ� �Է��� �ް� -1(ctrl+z)�� �Է��� �ϸ� ����
		
		InputStreamReader iReader=	new InputStreamReader(System.in);//
		
		try {
		while(true) {
			int inData=iReader.read(); //�Է°��� -> byte -> int
			System.out.println("��� ������:"+inData);
			// ctr+z -> -1
			System.out.println("While�� ����");
			if(inData==-1) break;// while�� ����
			
			System.out.println("���(����)������:"+(char) inData);
		}
		} catch (IOException e) {
			e.printStackTrace();
		
		}finally{
			try {
				iReader.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}	
	
}
