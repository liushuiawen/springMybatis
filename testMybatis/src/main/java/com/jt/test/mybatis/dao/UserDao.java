package com.jt.test.mybatis.dao;

import com.jt.test.mybatis.entity.User;

public interface UserDao {
	public int delete(String id);
	public int insert(User user);
	public User select(String id);
	public int update(User user);
}
