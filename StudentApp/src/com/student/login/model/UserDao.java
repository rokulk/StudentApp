package com.student.login.model;

import com.student.login.service.User;

public class UserDao {

	public boolean validateUser(User user)
	{
		if(user.getUser().equals("admin") && user.getPassword().equals("pass"))
		{
			return true;
		}
		return false;
	}
}
