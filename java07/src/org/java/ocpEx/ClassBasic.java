package org.java.ocpEx;
// ��Ű�� -> ����� ����� Ŭ������ ��Ƶ� ���丮


//���� ������(������)  class Ŭ������
//����� 
public class ClassBasic  {
	// ������
          //���
		
		//�ʵ�,������Ƽ(�Ӽ�)
	    //���������� Ÿ�� �ʵ��;
		public int num1; //�ν��Ͻ� ���, new
		public int num2; // �ν��Ͻ� ���, new
		//Ŭ������� -> new �������� �ʰ�, Ŭ����.���
		public static int num3; // static(Ŭ����)��� ->����
		
//		public ClassBasic() {
//			System.out.println("�⺻������(�ڵ����λ���");
//		}
		
		//�ż��� �� ���,���ϴ� ,����
        //���������� ��ȯŸ�� �ż����(�Է�����) {  return          }
		public void instanceMethod() {
			System.out.println("�ν��Ͻ� �ż���");
		}
		public static void staticMethod() {
			System.out.println("static(Ŭ����) �ż���");
		}
	}


