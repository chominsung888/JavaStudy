package org.java.basicApi;

public class StringEx2 {

	public static void main(String[] args) {
		
		System.out.println("String");
		System.out.println("String �ֿ� �ż���");
		
		String s1="java";
		String s2="oracle";
		String s3="java 2024 Project";
		//���ڿ� ���� -> length() ��������
		System.out.println("���ڿ� ����-> length()���� ����");
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		
		String userId="m111";
		int size=userId.length();
		System.out.println(size<4);
		if(size<5) {
			System.out.println("5���� �̻� �Է��ϼ���!!");
		}
		System.out.println("charAt(�ε���)");
		System.out.println(s3);
		System.out.println(s3.charAt(5));
		System.out.println(s3.codePointAt(5));
		
		System.out.println("compareTo(���ڿ�)-> ����(���ڿ���)");
		System.out.println(s1.compareTo(s2)); // -1(����������)
		System.out.println("az".compareTo("za"));
		
		System.out.println("concat(String str),���ڿ����ļ� -> ���ο�ڿ�");
		
		String addr1="�����";
		String addr2="�����";
		System.out.println(addr1.concat(addr2));
		String addr3=addr1.concat(addr2);
		System.out.println(addr3);
		System.out.println(addr1);
		System.out.println(addr2);
		
		String s31="java 2024 project";
		System.out.println("contains()-> ���ԵǾ� �ִ���?....�˻�");
		System.out.println(s31.contains("j"));
		
		String s32="java 2023 project";
		System.out.println("replace(���ڿ�1,���ڿ�2)->���ڿ�1 -> ���ڿ�2 �ٲ��.");
		// "2023"->"2024"
		String s32_R=s32.replace("2023","2024");
		System.out.println(s32_R);
		System.out.println(s32);// ���� ���ڿ��� ������ ����.
		
		System.out.println("split ->Ư����ȣ�� �и��ؼ� String�迭�� ����");
		String phone="010-1234-5678";
		
		// -���� �����Ͽ� String �迭 ����
		String[] phoneArr=phone.split("-"); // "-"�����Ͽ� String�迭�� ����
		// {"010","1234","5678"} 
		
		System.out.println(phoneArr[0]+","+phoneArr[1]+","+phoneArr[2]);
		//1.for�� �̿��ؼ� ���
		for(int i=0; i<phoneArr.length;i++) {
			System.out.println(phoneArr[i]);
		}
		System.out.println();
		//2.foreach���� �̿��ؼ� ��� 
		for(String element: phoneArr) {
			System.out.println(element);;//�迭 ��� ��� ��ȸ
	}
		System.out.println("�ҹ��� ��ȯ-> toLowerCase(), �빮�ں�ȯ-> toUpperCase()");
		String apha1="JAVA";
		System.out.println(apha1.toLowerCase());
		String apha2="java";
		System.out.println(apha2.toUpperCase());
		
		System.out.println("trim() -> ���� ����(��/��)");
		
		String password="1234";
		System.out.println(password.length());
		System.out.println(password.length()>5);
		
		String pw2=password.trim();
		System.out.println(pw2.length());
		
}
}