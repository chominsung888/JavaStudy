package org.java.ioEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IoEx2 {

	public static void main(String[] args) {
		System.out.println("IO");
		// ����
		InputStreamReader inputReader = null;

		try {
			System.out.println("�̸��� �Է� �ϼ���:");
			inputReader = new InputStreamReader(System.in);

			BufferedReader bReader = new BufferedReader(inputReader);

			String name = bReader.readLine();
			
			System.out.println("�̸�:"+name);
			
			//����, ����,���� ���� �Է�-> ����,����,���� ���� ���, ��հ�
			System.out.println("�������� �Է�:");
			String kor=bReader.readLine();
			System.out.println("�������� �Է�:");
			String eng=bReader.readLine();
			System.out.println("�������� �Է�:");
			String math=bReader.readLine();
			
			int sum=Integer.parseInt(kor)+Integer.parseInt(eng)+Integer.parseInt(math);//���� (String) -> int
			
			
			double avg=(double)sum/3;
			
			String.format("%.2f", avg);
			
			
			System.out.println("����:"+sum+",���:"+String.format("%.2f", avg));
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				inputReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
