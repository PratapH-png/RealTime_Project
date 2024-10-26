package com.digisoft.actitime.test;

import com.digisoft.actitime.page.CustomerPage;
import com.digisoft.actitime.page.LoginPage;
import com.digisoft.actitime.utils.DriverUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerFunctionlity extends DriverUtils {

	CustomerPage CP = null;

	@Given("User is on Actitime Login Page")
	public void user_is_on_actitime_login_page() {
		initDriver();
		CP = new CustomerPage();
		driver.get("http://localhost/login.do");
	}

	@Given("user login to the application with valid credentials")
	public void user_login_to_the_application_with_valid_credentials() {
		

	}

	@When("user click on tasks followed by create customer button")
	public void user_click_on_tasks_followed_by_create_customer_button() {

	}

	@Then("user validates the Customer creation page")
	public void user_validates_the_customer_creation_page() {

	}

	@Then("Fill all the customer details and click on create customer button")
	public void fill_all_the_customer_details_and_click_on_create_customer_button() {

	}

	@Then("Customer will be created successfully")
	public void customer_will_be_created_successfully() {

	}

	@Then("user validate the succss message")
	public void user_validate_the_succss_message() {

	}

	@Then("Fill name1 and {int} and click on create customer")
	public void fill_name1_and_and_click_on_create_customer(Integer int1) {

	}

	@Then("Fill name2 and {int} and click on create customer")
	public void fill_name2_and_and_click_on_create_customer(Integer int1) {

	}

}
