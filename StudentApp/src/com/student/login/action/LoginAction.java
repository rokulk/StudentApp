package com.student.login.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.student.login.model.UserDao;
import com.student.login.service.User;

public class LoginAction extends ActionSupport{

	private UserDao userDao;
	private User user;
	//static Logger log = Logger.getLogger(LoginAction.class.getName());
	
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public String checkLogin()
	{
		//log.info("Start Validate Login");
		if(userDao.validateUser(user))
		{
			//log.info("Login Validation Ok");
			return SUCCESS;
		}
		else
		{
			//log.error("Login Validation Failed");
			return ERROR;
		}
	}
}
