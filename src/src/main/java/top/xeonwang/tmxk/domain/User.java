package top.xeonwang.tmxk.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

	private int UserId;
	
	@JsonProperty("username")
	private String UserName;
	@JsonProperty("password")
	private String UserPwd;
	@JsonProperty("phone")
	private String UserPhone;
	@JsonProperty("gender")
	private String userGender;
	@JsonProperty("email")
	private String UserEmail;
	@JsonProperty("birthday")
	private String UserBirthday;
	
	public int getUserId() {
		return this.UserId;
	}
	public void setUserId(int id) {
		this.UserId = id;
	}
	public String getUserName() {
		return this.UserName;
	}
	public void setUserName(String name) {
		this.UserName = name;
	}
	public String getUserPwd() {
		return this.UserPwd;
	}
	public void setUserPwd(String pwd) {
		this.UserPwd = pwd;
	}
	public String getUserPhone() {
		return this.UserPhone;
	}
	public void setUserPhone(String phone) {
		this.UserPhone = phone;
	}
	public String getUserGender() {
		return this.userGender;
	}
	public void setUserGender(String sex) {
		this.userGender = sex;
	}
	public String getUserEmail() {
		return this.UserEmail;
	}
	public void setUserEmail(String email) {
		this.UserEmail = email;
	}
	public String getUserBirthday() {
		return UserBirthday;
	}
	public void setUserBirthday(String userBirthday) {
		UserBirthday = userBirthday;
	}
	
}
