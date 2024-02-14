package org.java.dto;

import java.time.LocalDateTime;

public class BoardDto {
	
	// �ʵ�� private
	private int no; // �Խñ� ��ȣ
	private String title;//������
	private String content; //�۳���
	private String writer; //���ۼ�
	private String nickName; //���ۼ�
	private int hit; //��ȸ��
	private  LocalDateTime createTime= LocalDateTime.now();
	private  LocalDateTime updateTime= LocalDateTime.now();
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	 
	@Override //����� ���ؼ� �������̵� �ż��� ����
	public String toString() {
		
		if(title==null) {
			return "��ȸ �� �����Ͱ� ����.";
		}
		
		return "BoardDto [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + ", nickName="
				+ nickName + ", hit=" + hit + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	} 
	
	

	
	

}
