package org.java.arrayEx;

public class ArrayEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("char�� �迭-> String���� ����");
		// 'C','A','F','E'�� String��ȯ -> ��ȯ�ڵ带 �̿��ؼ� ���
		
		
		char[] arrCh=new char[] {'C','A','F','E'};
		String[] binnery= {
				"0000","0001","0010","0011",
				"0100","0101","0110","0111",
				"1000","1001","1010","1011",
				"1100","1101","1110","1111",
		};
		String result=" ";
		
	
		for(int i=0; i<arrCh.length;i++) {
			//4�� ���� C,A,F,E
			if(arrCh[i]>='0' && arrCh[i]<='9') {
				//���� ���� ���� �ʴ´�.
				result+=binnery[arrCh[i]-'0'];
			}else {
				//���� ���� �Ǵ� ��ɹ�
				result+=binnery[arrCh[i]-'A'+10];
				
			
			}
		}
		// ��ȯ�� ���ڿ� �迭
		System.out.println(new String(arrCh));
		
		// ��ȯ �� String�� �迭
		System.out.println(result);
	}

}
