package org.java.dao;

import java.lang.reflect.Member;

import org.java.dto.MemberDto;

public class MemberDao {
	////////////////////////////////////////////////////////////
	// �̱��� -> "��ü�� �ѹ��� ����"
	//1. ������ private 
	//2. INSTANCE �ѹ��� �ʱ� -> �ѹ��� ��ü�� ���� 
	//3. �ܺ� static MemberDao getInstance() -> �ѹ��� ����
	private static final MemberDao INSTANCE = new MemberDao();

	private MemberDao() {
		System.out.println("Dao");
	}

	public static MemberDao getInstance() {
		return MemberDao.INSTANCE;
	}
////////////////////////////////////////////////////////////////////////	
	
	// Create ȸ������
	public int insert() {
		return 0;
	}
	
	
	// Read ȸ����ȸ
	public MemberDto select() {
		MemberDto dto=null;
		return dto;
	}
	
	
	
	// Update ȸ������
	public int update() {
		return 0;
	}
	
	// Delete ȸ������
	public int delete() {
		return 0;
	}
	
	
	
	
	
	
	
}
