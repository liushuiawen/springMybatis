package com.jt.test.mybatis.service;

import com.jt.test.mybatis.entity.User;

public interface UserService {
	public int addUser(User user);
	public User getUserById(String id);
}
