package com.digisoft.actitime.test;

import com.digisoft.actitime.page.LoginPage;
import com.digisoft.actitime.utils.DriverUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login extends DriverUtils{
	
	LoginPage lp= null;
	
	@Given("user is launch the browser")
	public void user_is_launch_the_browser() {
	   System.out.println("*******hey im inside the browser*******");
	   initDriver();
	   lp=new LoginPage();
	   driver.get("http://localhost/login.do");
	}

	@When("^user enter(.*) and (.*)$")
	public void user_enter_username_and_password(String name, String password) throws InterruptedException {
	   Thread.sleep(2000);
	   lp.enterusername(name);
	   lp.enterpassword(password);
	   
	}

	@When("click on the Login button")
	public void click_on_the_login_button() {
	    lp.clicklogin();
	}

	@Then("user should be navigate to homepage")
	public void user_should_be_navigate_to_homepage() {
	   System.out.println("#### Hey im inside the homepage ####");
	}
}
