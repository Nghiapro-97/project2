package com.bean;

public class User {
	private String uname,upass,uemail;
	
	public User() {
		super();
		this.uname = "";
		this.upass = "";
		this.uemail = "";
	}

	public User(String uname, String upass, String uemail) {
		super();
		this.uname = uname;
		this.upass = upass;
		this.uemail = uemail;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	
	
}
