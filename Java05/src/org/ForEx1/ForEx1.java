package org.ForEx1;

import java.util.Scanner;

public class ForEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("for��");
				
		// i++; // i=i+1;
		
		// 0~9 ������ ���
		for(int i=0;i<10;i++) {
			//0,1,2,3,4,5,6,7,8,9
/*			if(i==9)
			if(i>8) {
				// i�� 8���� Ŭ���� ����
				System.out.println(i);
			}else {
				
			}
*/			
/*			if(i>9) {
				System.out.println(i);
			}else {
				System.out.print(i+",");
*/			// break���� ��ɹ� ����X
			
			if(i>8) {
				System.out.println(i);
				break;
			}
			System.out.print(i+",");
			

			
		}// break
		System.out.println("9~0");
		// 9~0 1���� �ݺ���
		for(int i=9;i>=0;i--) {
			//break ��� i==0�� ��� -> for�� ���� 
			if(i==0) {
			System.out.println(i);
			break;
		}
			System.out.print(i+",");
		} //break
		
		System.out.println();
		
		/*Scanner�̿�, ����2��
		 * ù���� ����, �ι�° ���ڸ� �Է� �޾Ƽ�9������)
		 * ù��° ���ں��� �ι�° ���ڱ��� �ֿܼ� ���
		 * ����), 1,5 ->1,2,3,4,5 //for��
		 * for(int i=ù��°; ù��° < �ι�°; i++)
		 * ������ ù��° ����<�ι��� ���� //if��
		 * �� ������ false�� "ù��° ���ڴ� �ݵ�� �ι�° ���ں��� �۾ƾߵȴ�" �ֿܼ� ���
		 * if��,for���� �̿��ؼ� ����
		*/
		Scanner scn= new Scanner(System.in);
		System.out.print("ù��° ����:");
		int firstNum= scn.nextInt();
		
		System.out.println("�ι�° ����:");
		int secondNum= scn.nextInt();
		
		if(firstNum<secondNum) {
			// 1 < 5 ->1234
			// 1 <= 5 -> 12345
			for(int i=firstNum;i<secondNum;i++) {
				// i ->1,2,3,4,5 <->5
				if(i==secondNum) {
					System.out.println(i); //5 ==5
					break; //�������� ��츸 �����ϰ�
					
				}
				//break�� ���Ŀ�  ��ɹ��� ���� ���� �ʴ´�.
				System.out.print(i+",");
			}//break;
		}else{
			
		}
			System.out.println("ù��° ���ڴ� �ݵ�� �ι�° ���ں��� �۾ƾߵȴ�.");
		}
		
	}

