package com.said.app.ws.services.imp;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.said.app.ws.entitys.UserEntity;
import com.said.app.ws.repositories.UserRepository;
import com.said.app.ws.services.UserService;
import com.said.app.ws.shared.dto.UserDto;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDto createUser(UserDto user) {
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		userEntity.setEncryptedPassword("test passwoord");
		userEntity.setUserId("test id");

		UserEntity newUser = userRepository.save(userEntity);
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(newUser, userDto);

		return userDto;
	}

}
