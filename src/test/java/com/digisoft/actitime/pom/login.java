package com.digisoft.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.digisoft.actitime.utils.DriverUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login extends DriverUtils{
	@Given("I am on the actiTime login page")
	public void i_am_on_the_acti_time_login_page() {
		driver.get("http://localhost/login.do");
	}

	@When("I enter valid username and password")
	public void i_enter_valid_username_and_password() throws Exception {
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
	}

	@When("I click on the Login button")
	public void i_click_on_the_login_button() {
		driver.findElement(By.id("loginButton")).click();
	}

	@Then("I should be redirected to the actiTime dashboard")
	public void i_should_be_redirected_to_the_acti_time_dashboard() {
		String expectedUrl = "http://localhost/user/submit_tt.do";
		String currentUrl = driver.getCurrentUrl();
	}

	@Then("I should see the Logout option")
	public void i_should_see_the_logout_option() {
		WebElement logout;
	}

	@When("I enter an invalid username and password")
	public void i_enter_an_invalid_username_and_password() throws Exception {
		driver.findElement(By.name("username")).sendKeys("Pattu");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("Pratap");
	}

	@When("I Click Login button")
	public void i_click_login_button() {
		driver.findElement(By.id("loginButton")).click();
	}

	@Then("I should see an error message saying Invalid username or password.")
	public void i_should_see_an_error_message_saying_invalid_username_or_password() {
		 WebElement errorMessage;
	}

}
