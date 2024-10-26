package com.digisoft.actitime.page;

import com.digisoft.actitime.utils.DriverUtils;

public class LoginPage extends DriverUtils{
 
	public String username_byname = "username";
	public String Password_byname = "pwd";
	public String Login_byid = "loginButton";
	
	public void enterusername (String username) {
		System.out.println("entering the username" + username);
		type("name", username_byname, username );
	}
	
	public void enterpassword (String password) {
		System.out.println("entering the password" + password);
		type("name", Password_byname, password);
	}
	
	public void clicklogin () {
		System.out.println("click on login");
		click("id", Login_byid);
	}
	//method to perform login action
	public void login(String username, String passowrd, String password) {
		System.out.println("Login using " + username + " and " + password);
		enterusername(username);
		enterpassword(passowrd);
		clicklogin();
	}
	
}
