package org.java.arrayEx;

public class ArrayEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("다차원 배열");
		
		int[][] arrInt1=new int[2][5];
		
		
		int row_count=arrInt1.length;
		int col_count=arrInt1[0].length;
		int sum_count=row_count*col_count;
		
		System.out.println(row_count);// 행 갯수
		System.out.println(col_count);// 열 갯수
		System.out.println(sum_count); // 전체 요소 갯수
		
		System.out.println();
		
		int startNum=0;
		
		for(int i=0;i<row_count;i++) {
			System.out.println(i+"행입니다.");
			for(int j=0; j<col_count;j++) {
				
				startNum++;
				// 열
				
				arrInt1[i][j]=startNum;
				
				System.out.print(arrInt1[i][j]+" ");
			}
			System.out.println();
		}
		
		// 0행
/*		arrInt1[0][0]=1;
		arrInt1[0][1]=2;
		arrInt1[0][2]=3;
		arrInt1[0][3]=4;
		arrInt1[0][4]=5;
		// 1행
		arrInt1[0][0]=6;
		arrInt1[0][1]=7;
		arrInt1[0][2]=8;
		arrInt1[0][3]=9;
		arrInt1[0][4]=10;
	
		System.out.print(arrInt1[0][0]+" ");
		System.out.print(arrInt1[0][1]+" ");
		System.out.print(arrInt1[0][2]+" ");
		System.out.print(arrInt1[0][3]+" ");
		System.out.print(arrInt1[0][4]+" ");
		
		System.out.print(arrInt1[1][0]+" ");
		System.out.print(arrInt1[1][1]+" ");
		System.out.print(arrInt1[1][2]+" ");
		System.out.print(arrInt1[1][3]+" ");
		System.out.print(arrInt1[1][4]+" ");
*/		
		
}

}
