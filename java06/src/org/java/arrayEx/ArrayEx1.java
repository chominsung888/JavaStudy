package org.java.arrayEx;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("배열->[]");
		
		//1.배열 생성 방법 -> new
		// int형 데이터를 저장할 수 있는 배열 arrInt를 선언 했다.
		// int형 데이터 5개를 저장할 수 있는 배열을 생성
		// 배열의 이름 -> arrInt -> 배열의 주소값이 저장
		int[] arrInt= new int[5]; 
		
		// 초기화, 0~4번지 -> push
		/*arrInt[0]=10;
		arrInt[1]=20;
		arrInt[2]=30;
		arrInt[3]=40;
		arrInt[4]=50; */
		// 배열의 요소 조회 -> pop
		//for
		for(int i=0; i<5;i++) {
			//0,1,2,3,4
			// 10,20,30,40,50
			
			arrInt[1]=i*10+10;
		}
		
		System.out.println("arrInt[0]="+arrInt[0]); // 배열의 0번지(index) 요소(element)
		System.out.println("arrInt[1]="+arrInt[1]); // 배열의 1번지(index) 요소(element)
		System.out.println("arrInt[2]="+arrInt[2]); // 배열의 2번지(index) 요소(element)
		System.out.println("arrInt[3]="+arrInt[3]); // 배열의 3번지(index) 요소(element)
		System.out.println("arrInt[4]="+arrInt[4]); // 배열의 4번지(index) 요소(element)

		
		
		//2. 배열 생성
		
		int[] arrInt2=new int[] {10,20,30,40,50};
		arrInt[0]=100;
		
		arrInt2[0]=100;
		System.out.println("배열의 이름:"+arrInt2);
//		System.out.println("arrInt2" + "[0]="+arrInt2[0]); // 배열의 0번지(index) 요소(element)
//		System.out.println("arrInt2[1]="+arrInt2[1]); // 배열의 1번지(index) 요소(element)
//		System.out.println("arrInt2[2]="+arrInt2[2]); // 배열의 2번지(index) 요소(element)
//		System.out.println("arrInt2[3]="+arrInt2[3]); // 배열의 3번지(index) 요소(element)
//		System.out.println("arrInt2[4]="+arrInt2[4]); // 배열의 4번지(index) 요소(element)
		
		for(int i=0;i<5;i++) {
			System.out.println("arrInt2["+i+"]="+arrInt);
		}
		
		//3. 배열생성
		int[] arrInt3 = {10,20,30,40,50};
//		System.out.println(arrInt3);
//		System.out.println("배열의 이름:"+arrInt3);
//		System.out.println("arrInt3[0]="+arrInt3[0]); // 배열의 0번지(index) 요소(element)
//		System.out.println("arrInt3[1]="+arrInt3[1]); // 배열의 1번지(index) 요소(element)
//		System.out.println("arrInt3[2]="+arrInt3[2]); // 배열의 2번지(index) 요소(element)
//		System.out.println("arrInt3[3]="+arrInt3[3]); // 배열의 3번지(index) 요소(element)
//		System.out.println("arrInt3[4]="+arrInt3[4]); // 배열의 4번지(index) 요소(element)
		for(int i=0;i<5;i++) {
			System.out.println("arrInt3["+i+"]="+arrInt);
		}
				}

}
