package com.cg.cms.domain;

public class User extends Person {
	/*
	 * login name of user
	 */
	private String loginname;
	/*
	 * password of user
	 */
	private String pwd;
	/*
	 * status of user
	 * status 1: Active
	 * status 2: Inactive
	 */
	private int status;
	/*
	 * role of user
	 * role 1: GuestUser
	 * role 2: Admin user
	 */
	
	private int role;

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public void setRole(String string) {
		// TODO Auto-generated method stub
		
	}
	
  
}
