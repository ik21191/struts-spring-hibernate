package com.mypack.beans;

import java.io.Serializable;
import java.util.Set;

public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String userid;
	private String password;
	
	private UserDetails userDetails;
	private Set<String> hobbies;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public UserDetails getUserDetails() {
		return userDetails;
	}


	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public Set<String> getHobbies() {
		return hobbies;
	}


	public void setHobbies(Set<String> hobbies) {
		this.hobbies = hobbies;
	}
	
	
}
