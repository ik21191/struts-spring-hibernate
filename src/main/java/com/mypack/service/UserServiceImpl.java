package com.mypack.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypack.beans.User;
import com.mypack.dao.UserDao;

@Service("UserService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;
	
	public static final Logger log = Logger.getLogger(UserServiceImpl.class);
	public UserServiceImpl() {
		log.info("UserServiceImpl is called.");
	}
	
	@Override
	public boolean insertUser(User user) {
		return userDao.insertUser(user);
	}
	
	@Override
	public User getUser(String userId) {
		return userDao.getUser(userId);
	}
}
