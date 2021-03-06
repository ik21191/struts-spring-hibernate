package com.mypack.service;

import java.util.List;

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
	
	@Override
	public User getUser(int identifier) {
		return userDao.getUser(identifier);
	}
	
	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}
	
	@Override
	public boolean deleteUser(int id) {
		return userDao.deleteUser(id);
	}
	
	@Override
	public boolean updateUser(User user) {
		return userDao.updateUser(user);
	}
	
	
}
