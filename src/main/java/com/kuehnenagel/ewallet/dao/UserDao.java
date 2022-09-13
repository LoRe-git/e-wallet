package com.kuehnenagel.ewallet.dao;

import org.springframework.stereotype.Component;

import com.kuehnenagel.ewallet.model.User;

@Component
public interface UserDao {

	User getUserById(long id);
	User findByUsername(String username);
}
