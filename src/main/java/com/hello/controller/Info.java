package com.hello.controller;

public class Info {
	private String user;
	private String password;
	public String getUsername() {
		return user;
	}
	public void setUsername(String username) {
		this.user = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
  public String method(String user) {
	  return user;
  }
  public String method1(String password) {
	  return password;
  }
}
