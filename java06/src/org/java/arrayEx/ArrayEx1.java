package org.java.arrayEx;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�迭->[]");
		
		//1.�迭 ���� ��� -> new
		// int�� �����͸� ������ �� �ִ� �迭 arrInt�� ���� �ߴ�.
		// int�� ������ 5���� ������ �� �ִ� �迭�� ����
		// �迭�� �̸� -> arrInt -> �迭�� �ּҰ��� ����
		int[] arrInt= new int[5]; 
		
		// �ʱ�ȭ, 0~4���� -> push
		/*arrInt[0]=10;
		arrInt[1]=20;
		arrInt[2]=30;
		arrInt[3]=40;
		arrInt[4]=50; */
		// �迭�� ��� ��ȸ -> pop
		//for
		for(int i=0; i<5;i++) {
			//0,1,2,3,4
			// 10,20,30,40,50
			
			arrInt[1]=i*10+10;
		}
		
		System.out.println("arrInt[0]="+arrInt[0]); // �迭�� 0����(index) ���(element)
		System.out.println("arrInt[1]="+arrInt[1]); // �迭�� 1����(index) ���(element)
		System.out.println("arrInt[2]="+arrInt[2]); // �迭�� 2����(index) ���(element)
		System.out.println("arrInt[3]="+arrInt[3]); // �迭�� 3����(index) ���(element)
		System.out.println("arrInt[4]="+arrInt[4]); // �迭�� 4����(index) ���(element)

		
		
		//2. �迭 ����
		
		int[] arrInt2=new int[] {10,20,30,40,50};
		arrInt[0]=100;
		
		arrInt2[0]=100;
		System.out.println("�迭�� �̸�:"+arrInt2);
//		System.out.println("arrInt2" + "[0]="+arrInt2[0]); // �迭�� 0����(index) ���(element)
//		System.out.println("arrInt2[1]="+arrInt2[1]); // �迭�� 1����(index) ���(element)
//		System.out.println("arrInt2[2]="+arrInt2[2]); // �迭�� 2����(index) ���(element)
//		System.out.println("arrInt2[3]="+arrInt2[3]); // �迭�� 3����(index) ���(element)
//		System.out.println("arrInt2[4]="+arrInt2[4]); // �迭�� 4����(index) ���(element)
		
		for(int i=0;i<5;i++) {
			System.out.println("arrInt2["+i+"]="+arrInt);
		}
		
		//3. �迭����
		int[] arrInt3 = {10,20,30,40,50};
//		System.out.println(arrInt3);
//		System.out.println("�迭�� �̸�:"+arrInt3);
//		System.out.println("arrInt3[0]="+arrInt3[0]); // �迭�� 0����(index) ���(element)
//		System.out.println("arrInt3[1]="+arrInt3[1]); // �迭�� 1����(index) ���(element)
//		System.out.println("arrInt3[2]="+arrInt3[2]); // �迭�� 2����(index) ���(element)
//		System.out.println("arrInt3[3]="+arrInt3[3]); // �迭�� 3����(index) ���(element)
//		System.out.println("arrInt3[4]="+arrInt3[4]); // �迭�� 4����(index) ���(element)
		for(int i=0;i<5;i++) {
			System.out.println("arrInt3["+i+"]="+arrInt);
		}
				}

}
