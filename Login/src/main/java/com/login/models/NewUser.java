package com.login.models;

public class NewUser {
	
	private String first_name;
	private String last_name;
	private String email;
	private String username;
	private String password;
	
	
	@Override
	public String toString() {
		return "NewUser [first_name=" + first_name + ", last_name=" + last_name + ", email=" + email + ", username="
				+ username + ", password=" + password + "]";
	}

	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
