package org.java.arrayEx;

public class ArrayEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ �迭");
		
		int[][] arr1=new int[5][3]; //5�� 3��
		System.out.println("���: "+arr1.length);
		System.out.println("����: "+arr1[0].length);
		System.out.println("�ѿ��: "+(arr1[0].length));
		System.out.println("�ѹ���Ʈ��: "+(arr1[0].length*arr1.length*4));
		int startNum=0;
		//��
		for(int i=0; i<arr1.length;i++) {
			//��
			for(int j=0; j<arr1[i].length;j++) {
				startNum++;
				arr1[i][j]=startNum;
				System.out.println(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=========����ǥ ���================");
		//����,����,����,����,���
		//
		int[][] score = {
				//���� ���� ����
				{100,55,87},
				{98,44,78},
				{96,87,94},
				{85,78,66},
				{90,86,60}
				
		};
		System.out.println("=====�⸻��缺��ǥ=========");
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		
		int kor=0;  //���� [��][0]
		int math=0; //���� [��][1]
		int eng=0;  //���� [��][2]
		
/*		System.out.println(score[0][0]);
		System.out.println(score[1][0]);
		System.out.println(score[0][1]);
		System.out.println(score[1][1]);
		System.out.println(score[0][2]);
*/
		int num=0; //��ȣ
		for(int i=0;i<score.length;i++) {
			num++;
			System.out.print(num+"\t"); //��ȣ
			
			int sum=0; //����
			double avg=0.0; //���
			
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			//����
	//		System.out.println(sum+"\t");
			
			//���
		//	System.out.println(avg);
			
			String avgStr=String.format("%.2f", args);
			System.out.println(avgStr);
			
			System.out.println();
		}
		
		System.out.println("�ι���"\t);

		
		
		
		
		 
	}

}
