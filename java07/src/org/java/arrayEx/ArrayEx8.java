package org.java.arrayEx;

public class ArrayEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("다차원 배열");
		
		int[][] arr1=new int[5][3]; //5행 3열
		System.out.println("행수: "+arr1.length);
		System.out.println("열수: "+arr1[0].length);
		System.out.println("총요수: "+(arr1[0].length));
		System.out.println("총바이트수: "+(arr1[0].length*arr1.length*4));
		int startNum=0;
		//행
		for(int i=0; i<arr1.length;i++) {
			//열
			for(int j=0; j<arr1[i].length;j++) {
				startNum++;
				arr1[i][j]=startNum;
				System.out.println(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=========성적표 출력================");
		//국어,영어,수학,총점,평균
		//
		int[][] score = {
				//국어 영어 수학
				{100,55,87},
				{98,44,78},
				{96,87,94},
				{85,78,66},
				{90,86,60}
				
		};
		System.out.println("=====기말고사성적표=========");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		
		int kor=0;  //국어 [행][0]
		int math=0; //수학 [행][1]
		int eng=0;  //영어 [행][2]
		
/*		System.out.println(score[0][0]);
		System.out.println(score[1][0]);
		System.out.println(score[0][1]);
		System.out.println(score[1][1]);
		System.out.println(score[0][2]);
*/
		int num=0; //번호
		for(int i=0;i<score.length;i++) {
			num++;
			System.out.print(num+"\t"); //번호
			
			int sum=0; //총점
			double avg=0.0; //평균
			
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			//총점
	//		System.out.println(sum+"\t");
			
			//평균
		//	System.out.println(avg);
			
			String avgStr=String.format("%.2f", args);
			System.out.println(avgStr);
			
			System.out.println();
		}
		
		System.out.println("부문별"\t);

		
		
		
		
		 
	}

}
