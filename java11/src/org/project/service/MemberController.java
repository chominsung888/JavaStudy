package org.project.service;

import java.util.Scanner;

public class MemberController {

	public static void main(String[] args) {

	
	MemberService service=null;
	
	// Scanner�̿�// ������ �Է� �ϼ���
	// insert�Է� �ϸ�ActionInsert   excuteQuery()  ����   ->�ֿܼ� ��ȸ�����ԡ�
	// select�Է� �ϸ� ActionUpdate   excuteQuery()  ����>�ֿܼ� ��ȸ����ȸ��
	// update�Է� �ϸ� ActionDelete   excuteQuery()  ����->�ֿܼ� ��ȸ��������
	// delete�Է� �ϸ� ActionSelect   excuteQuery()  ���� ->�ֿܼ� ��ȸ��Ż��
	// exit�Է��ϸ� ����
	// �ٸ� ������ �Է��ϸ� �ٽ� �Է� �ϼ��� -> ó������ �ٽ� ����(while) 
	Scanner scanner = new Scanner(System.in);
	
	while (true) {
        System.out.println("Enter a query (insert/select/update/delete/exit): ");
        String query = scanner.nextLine().toLowerCase();
      switch(query) {
      case "insert":
    	  new ActionInsert().excuteQueryService();
    	  System.out.println("ȸ������");
    	  break;
    	  
      case "select":
    	  new ActionSelect().excuteQueryService();
    	  System.out.println("ȸ����ȸ");
    	  break;
    
      case "update":
    	  new ActionUpdate().excuteQueryService();
    	  System.out.println("ȸ������");
    	  break;
      case "delete":
    	  new ActionExit().excuteQuertService();
    	  break;
    	  
      case "exit":
    	  System.out.println("exit�� �Է��ϸ� ���α׷� ����");
    	  System.exit(0);
    	  break;
    	 
      }
	}
	
	
	
	}
}
