package com.mypack.struts2.actions;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.mypack.beans.User;
import com.mypack.service.UserService;

public class EditUser {
	private static Logger log = Logger.getLogger(EditUser.class);
	
	private User user;
	private int identifier;
	@Autowired
	UserService userService;
	
	public EditUser() {
		log.info("EditUser is called.");
	}
	
	public String editUser() {
		user = userService.getUser(identifier);
		if(user != null) {
			return "success";	
		} else {
			return "error";
		}
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getIdentifier() {
		return identifier;
	}

	public void setIdentifier(int identifier) {
		this.identifier = identifier;
	}
	
	
	
}
