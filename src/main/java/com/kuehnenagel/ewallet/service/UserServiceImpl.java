package com.kuehnenagel.ewallet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kuehnenagel.ewallet.dao.UserDao;
import com.kuehnenagel.ewallet.dto.UserDto;
import com.kuehnenagel.ewallet.model.User;
import com.kuehnenagel.ewallet.util.UserUtil;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public UserDto getUserById(long id) {
		User user = userDao.getUserById(id);
		return UserUtil.convertUserModelToDto(user);
	}

}
