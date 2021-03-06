package com.appdeveloperblog.photoapp.api.users.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.appdeveloperblog.photoapp.api.users.sahred.UserDto;

public interface UsersService extends UserDetailsService {
//public interface UsersService {

	UserDto createUser(UserDto userDetails);

	UserDto getUserDetailsByEmail(String email);

	UserDto getUserByUserId(String UserId);

}
