package com.mypack.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mypack.beans.User;

@Repository("UserDao")
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	private static final Logger log = Logger.getLogger(UserDaoImpl.class);
	
	public UserDaoImpl() {
		log.info("UserDaoImpl is called. ");
	}

	@Override
	@Transactional
	public boolean insertUser(User user) {
		Integer primaryKey = (Integer) getHibernateTemplate().save(user);
		if(primaryKey.intValue() != 0) {
			return true;
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public User getUser(String userId) {
		List<User> userList = null;
		userList = (List<User>)getHibernateTemplate().find("from User where userid in (?)", userId);
		if(userList != null && !userList.isEmpty()) {
			return userList.get(0);
		}
		return null;
	}
}
