
package org.java.dto;

public class BoardEntity {

	private Long no;// �۹�ȣ-> �ڵ� 1,2,3,4,5
	private String tilte; //������
	private String cotent; //������
	private String writer;//�ۼ���
	private String nickName; //�г���
	// �����ð�, �ۼ��ð�, �����ð� -> �ʼ�-> �ڵ����� ���� ����

	public BoardEntity() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * @param no
	 * @param tilte
	 * @param cotent
	 * @param writer
	 * @param nickName
	 */
	public BoardEntity(Long no, String tilte, String cotent, String writer, String nickName) {
		super();
		this.no = no;
		this.tilte = tilte;
		this.cotent = cotent;
		this.writer = writer;
		this.nickName = nickName;
	}



	@Override
	public String toString() {
		return "BoardEntity [no=" + no + ", tilte=" + tilte + ", cotent=" + cotent + ", writer=" + writer
				+ ", nickName=" + nickName + "]";
	}



	public Long getNo() {
		return no;
	}



	public void setNo(Long no) {
		this.no = no;
	}



	public String getTilte() {
		return tilte;
	}



	public void setTilte(String tilte) {
		this.tilte = tilte;
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



	// BoardDto -> BoardEntity ��ȯ
	public static BoardEntity toBoardEntity(BoardDto boardDto) {
	
		BoardEntity boardEntity=new BoardEntity();
		
		boardEntity.setNo(boardDto.getNo());
		boardEntity.setTilte(boardDto.getTitle());
		boardEntity.setCotent(boardDto.getCotent());
		boardEntity.setNickName(boardDto.getNickName());
	
		return boardEntity;
		
	}
	
	
}
