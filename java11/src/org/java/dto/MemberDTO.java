package org.java.dto;

public class MemberDTO {
    private String userId;
    private String userPw;
    private int userAge;

    // Default constructor
    public MemberDTO() {
    }

    // Constructor with parameters
    public MemberDTO(String userId, String userPw, int userAge) {
        this.userId = userId;
        this.userPw = userPw;
        this.userAge = userAge;
    }

    // Getter and setter methods
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
}