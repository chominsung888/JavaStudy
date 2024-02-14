package org.java.collcetionEx;

public class AjaxMemberDto {

	private Long id;
	private String userName;
	private String uesrPw;
	
	
	
	



	public AjaxMemberDto(long l, String string, String string2) {
		// TODO Auto-generated constructor stub
		super();
		this.id=id;
		this.userName=userName;
		this.uesrPw=uesrPw;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getUesrPw() {
		return uesrPw;
	}



	public void setUesrPw(String uesrPw) {
		this.uesrPw = uesrPw;
	}



	@Override
	public String toString() {
		return "AjaxMemberDto [id=" + id + ", userName=" + userName + ", uesrPw=" + uesrPw + "]";
	}
	
	
	
	
	
}
