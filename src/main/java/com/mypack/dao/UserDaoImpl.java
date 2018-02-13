package com.mypack.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mypack.beans.User;

@Repository("UserDao")
@SuppressWarnings("unchecked")
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
	
	@Override
	@Transactional(readOnly=true)
	public User getUser(String userId) {
		List<User> userList = null;
		userList = (List<User>)getHibernateTemplate().find("from User where userid in (?)", userId);
		if(userList != null && !userList.isEmpty()) {
			return userList.get(0);
		}
		return null;
	}
	
	@Override
	@Transactional
	public User getUser(int identifier) {
		return getHibernateTemplate().get(User.class, identifier);
	}
	
	@Override
	@Transactional
	public List<User> getAllUsers() {
		return (List<User>)getHibernateTemplate().find("from User");
		
	}
	
	@Override
	@Transactional
	public boolean deleteUser(int id) {
		User user = getHibernateTemplate().get(User.class, id);
		if(user == null) {
			return false;
		}
		getHibernateTemplate().delete(user);
		return true;
	}
	
	@Override
	@Transactional
	public boolean updateUser(User user) {
		getHibernateTemplate().update(user);
		return true;
	}

}
