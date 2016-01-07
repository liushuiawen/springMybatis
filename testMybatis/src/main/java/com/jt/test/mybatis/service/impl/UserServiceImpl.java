package com.jt.test.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jt.test.mybatis.dao.UserDao;
import com.jt.test.mybatis.entity.User;
import com.jt.test.mybatis.service.UserService;
@Service(value="userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.insert(user);
	}

	public User getUserById(String id) {
		// TODO Auto-generated method stub
		return userDao.select(id);
	}

}
