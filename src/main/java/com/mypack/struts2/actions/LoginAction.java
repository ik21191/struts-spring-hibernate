package com.mypack.struts2.actions;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.mypack.beans.User;
import com.mypack.service.UserService;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
public class LoginAction implements ModelDriven<User>, Preparable {

	private static Logger log = Logger.getLogger(LoginAction.class); 

	private User user;
	
	@Autowired
	UserService userService;
	
	public LoginAction(){
		log.info("LoginAction is called.");
	}
    
    public String execute() {
    	log.info("execute() is called.");
    	String view = "error";
    	try {
    		user = userService.getUser(user.getUserid());
        	if(user != null) {
        		view = "success";
        	}
    	} catch(Exception e) {
    		log.error(e);
    	}
    	return view;
   }

	@Override
    public User getModel() {
		log.info("getModel() is called");
		user = new User();
    	return user;
    }
	
	@Override
	public void prepare() throws Exception {
		log.info("prepare() method is called.");
	}
 }