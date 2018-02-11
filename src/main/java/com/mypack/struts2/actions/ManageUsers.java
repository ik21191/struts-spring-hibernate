package com.mypack.struts2.actions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mypack.beans.User;
import com.mypack.service.UserService;

public class ManageUsers {
	
	private List<User> users;
	
	@Autowired
	UserService userService;
	
	public String displayAllUsers() {
		users = userService.getAllUsers();
		if(users != null && !users.isEmpty()) {
			return "success";
		}
		return "error";
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
}
