package com.mypack.dao;

import java.util.List;

import com.mypack.beans.User;

public interface UserDao {
	boolean insertUser(User user);
	User getUser(String userId);
	User getUser(int identifier);
	List<User> getAllUsers();
	boolean deleteUser(int id);
	boolean updateUser(User user);
}
