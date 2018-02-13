package com.mypack.struts2.actions;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.mypack.beans.User;
import com.mypack.service.UserService;
import com.opensymphony.xwork2.ModelDriven;

public class UpdateUser implements ModelDriven<User> {
	private static Logger log = Logger.getLogger(UpdateUser.class);
	
	private User user;
	
	@Autowired
	UserService userService;
	
	public UpdateUser() {
		log.info("UpdateUser is called. ");
	}

	public String updateUser() {
		if(userService.updateUser(user)) {
			return "success";	
		} else {
			return "error";
		}
		
	}

	@Override
	public User getModel() {
		user = new User();
		return user;
	}
	
	
}
