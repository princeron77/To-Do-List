package com.ron.login;

public class LoginService {
	public boolean isUserValid(String user,String password) {
		if(user.equals("Prince")&&password.equals("aman"))
			return true;
		return false;
	}
}
