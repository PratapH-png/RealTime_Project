package com.digisoft.actitime.page;

import com.digisoft.actitime.utils.DriverUtils;

public class LoginPage extends DriverUtils{
 
	public String username_byname = "username";
	public String Password_byname = "pwd";
	public String Login_byid = "loginButton";
	
	public void enterusername (String name) {
		System.out.println("entering the username" + name);
		type("name", username_byname, name );
	}
	
	public void enterpassword (String name) {
		System.out.println("entering the password" + name);
		type("name", Password_byname, name);
	}
	
	public void clicklogin (String login) {
		System.out.println("click on login");
		click("id", login);
	}
	
}
