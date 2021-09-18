package com.iacollege1.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
	
	@Id
	private long userid;
	private String email;
	private String password;
	private String name;
	private String usertype;
	
	public Users() {
		
	}
	
	public Users(long userid, String email, String password, String name, String usertype) {
		super();
		this.userid = userid;
		this.email = email;
		this.password = password;
		this.name = name;
		this.usertype = usertype;
	}
	
	
	
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	

}
