package com.mypack.struts2.actions;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.mypack.beans.User;
import com.mypack.service.UserService;
import com.opensymphony.xwork2.ModelDriven;

public class RegisterAction implements ModelDriven<User>{

	private static final Logger log = Logger.getLogger(RegisterAction.class);
	private User user;
	
	@Autowired
	UserService userService;
	
	public RegisterAction() {
		log.info("RegisterAction() is called.");
	}
	
	public String execute() throws Exception {
		if(userService.insertUser(user)) {
			return "details";
		}
		return "error";
	}
	
	@Override
	public User getModel() {
		user = new User();
		return user;
	}
}
