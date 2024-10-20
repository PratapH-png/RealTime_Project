package com.digisoft.actitime.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtils extends GlobalVetiables {

	/***
	 * @author Admin
	 * @param type-pass 0 or 1 argument, and the 1 argument is either ff,chrome,
	 *                  edge only
	 * @return
	 * 
	 * @loginpage
	 * @return--getelement--string type, string value by using (type is "id", value
	 *                             is "username")
	 * @void--type--String type, String value, String text by using(type is "id",
	 *                     value is "username", text is "admin") (type is "name",
	 *                     value is "pwd", text is "manager")
	 * @void--click--String type, String value by using (type is "xpath" value is
	 *                      "path of login")
	 * @String--getElementText--String type, String value by using (type is "xpath",
	 *                                 value is "path of login")
	 * @String--getElementAttribute--String type, String value, String attribute by
	 *                                      using (type is "id", value is
	 *                                      "username", attribute is "placeholder")
	 */

	public WebDriver getDriver(String... type) {

		System.out.println("creaing a driver...");
		if (type.length == 0) {
			System.out.println("since no option is given, creating chrome by default");
			driver = new ChromeDriver();
		} else {
			switch (type[0]) {
			case "ff":
				driver = new FirefoxDriver();
				break;

			case "chrome":
				driver = new ChromeDriver();
				break;

			case "edge":
				driver = new EdgeDriver();
				break;

			default:
				System.out.println("Please check the driver type");
				break;
			}
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		System.out.println("Driver object is created successfully!!!");
		// loginpage home
		driver.get("https://example.actitime.com/login.do");
		return driver;

	}

	// return void --- getElement(String type, String value)

	public WebElement getElement(String type, String value) {
		switch (type.toLowerCase()) {
		case "id":
			// return driver.findElement(By.id(value));
			return driver.findElement(By.id("username"));
		case "name":
			// return driver.findElement(By.name(value));
			return driver.findElement(By.name("username"));
		case "xpath":
			// return driver.findElement(By.xpath(value));
			return driver.findElement(By.xpath("//*[@id=\"username\"]"));
		case "css":
			// return driver.findElement(By.cssSelector(value));
			return driver.findElement(By.cssSelector("#username"));
		default:
			throw new IllegalArgumentException("Invalid locator type: " + type);
		}
	}

	// void --- type(String type, String value, String text)

	public void type(String type, String value, String text) {
		// WebElement element = getElement(type, value);
		WebElement element = getElement("id", "username");
		element.clear();
		// element.sendKeys(text);
		element.sendKeys("admin");

		WebElement e2 = getElement("name", "pwd");
		e2.clear();
		e2.sendKeys("manager");
	}

	// void --- click(String type, String value)

	public void click(String type, String value) {
		// WebElement element = getElement(type, value);
		WebElement e1 = getElement("xpath", "//div[@id='loginButton']");
		e1.click();
	}

	// String --- getElementText(String type, String value)

	public String getElementText(String type, String value) {
		// WebElement element = getElement(type, value);
		WebElement login = getElement("xpath", "//div[@id='loginButton']");
		String s = getElementText("xpath", "//div[@id='loginButton']");
		System.out.println("Login Button Text: " + login);
		return login.getText();
	}

	// String --- getElementAttribute(String type, String value, String attribute)

	public String getElementAttribute(String type, String value, String attribute) {
		// WebElement element = getElement(type, value);
		WebElement e3 = getElement("id", "username");
		WebElement e4 = getElement("name", "pwd");
		String s1 = getElementAttribute("id", "username", "placeholder");
		String s2 = getElementAttribute("name", "pwd", "placeholder");
		System.out.println("Username Field Placeholder: " + s1);
		System.out.println("Password Field Placeholder: " + s2);
		return e3.getAttribute(attribute);
	}

}
