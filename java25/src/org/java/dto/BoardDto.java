package org.java.dto;

public class BoardDto {

	private int no;
	private String title;
	private String content;
	private String write;
	private String NickName;
	/**
	 * @param no
	 * @param title
	 * @param content
	 * @param write
	 * @param nickName
	 */
	public BoardDto(int no, String title, String content, String write, String nickName) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.write = write;
		NickName = nickName;
	}
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
	public String getWrite() {
		return write;
	}
	public void setWrite(String write) {
		this.write = write;
	}
	public String getNickName() {
		return NickName;
	}
	public void setNickName(String nickName) {
		NickName = nickName;
	}
	@Override
	public String toString() {
		return "BoardDto [no=" + no + ", title=" + title + ", content=" + content + ", write=" + write + ", NickName="
				+ NickName + "]";
	}
	

}
