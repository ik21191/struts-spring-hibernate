package com.mypack.service;

import com.mypack.beans.User;

public interface UserService {
	boolean insertUser(User user);
	User getUser(String userId);
}
