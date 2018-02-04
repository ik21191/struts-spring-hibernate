package com.mypack.dao;

import com.mypack.beans.User;

public interface UserDao {
	boolean insertUser(User user);
	User getUser(String userId);
}
