package com.appsdeveloperblog.app.ws.userservice.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsdeveloperblog.app.ws.shared.Utils;
import com.appsdeveloperblog.app.ws.ui.model.request.UserDetailsRequestModel;
import com.appsdeveloperblog.app.ws.ui.model.response.UserRest;
import com.appsdeveloperblog.app.ws.userservice.UserService;

@Service
public class UserServiceImpl implements UserService {
	//Map<String, UserRest> users;
	public Map<String, UserRest> allUsers = new HashMap<String, UserRest>();
	
	Utils utils;

	public UserServiceImpl() {
	}

	@Autowired
	public UserServiceImpl(Utils utils) {
		this.utils = utils;
	} 

	@Override
	public UserRest createUser(UserDetailsRequestModel userDetails) {
		UserRest returnValue = new UserRest();
		returnValue.setEmail(userDetails.getEmail());
		returnValue.setFirstName(userDetails.getFirstName());
		returnValue.setLastName(userDetails.getLastName());

		String userId = utils.generateUserId();
		returnValue.setUserId(userId);

		if (allUsers == null)
			allUsers = new HashMap<>();
		allUsers.put(userId, returnValue);

		return returnValue;
	}

} 
