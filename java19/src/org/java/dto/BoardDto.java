
package org.java.dto;

public class BoardDto {

	private Long no;// �۹�ȣ-> �ڵ� 1,2,3,4,5
	private String title; // ������
	private String cotent; // ������
	private String writer;// �ۼ���
	private String nickName; // �г���
	// �����ð�, �ۼ��ð�, �����ð� -> �ʼ�-> �ڵ����� ���� ����

	public BoardDto() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param no
	 * @param title
	 * @param cotent
	 * @param writer
	 * @param nickName
	 */
	public BoardDto(Long no, String title, String cotent, String writer, String nickName) {
		super();
		this.no = no;
		this.title = title;
		this.cotent = cotent;
		this.writer = writer;
		this.nickName = nickName;
	}
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCotent() {
		return cotent;
	}
	public void setCotent(String cotent) {
		this.cotent = cotent;
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
	@Override
	public String toString() {
		return "BoardDto [no=" + no + ", title=" + title + ", cotent=" + cotent + ", writer=" + writer + ", nickName="
				+ nickName + "]";
	}

	
}
