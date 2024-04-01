package com.security.securitylearning.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.security.securitylearning.dto.UserDto;

@Service
public class UserDataService {

	public List<UserDto> getAllUsers() {
		List<UserDto> userList = new ArrayList<>();
		userList.add(new UserDto(1, "Ram", 34));
		userList.add(new UserDto(2, "Laxman", 30));
		return userList;
	}

}
