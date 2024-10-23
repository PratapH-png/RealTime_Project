package com.digisoft.actitime.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtils extends GlobalVaribles {

	/***
	 * @author Admin
	 * @param type-pass 0 or 1 argument, and the 1 argument is either ff,chrome,
	 *                  edge only
	 * @return
	 * 
	 * @loginpage
	 */

	public WebDriver getDriver(String... type) {

		System.out.println("creaing a driver...");
		if (type.length == 0) {
			System.out.println("since no option is given, creating chrome by default");
			  System.setProperty("webdriver.gecko.driver", "E:\\Jars New\\geckodriver-v0.35.0-win-aarch64");
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
		return driver;

	}

	// return void --- getElement(String type, String value)

	public WebElement getElement(String type, String value){
		WebElement ele=null;
		switch (type.toLowerCase()) {
		case "id":
			ele = driver.findElement(By.id(value));
			break;
		case "name":
			ele= driver.findElement(By.name(value));
			break;
		case "class":
			ele= driver.findElement(By.className(value));
			break;
		case "tagName":
			ele= driver.findElement(By.tagName(value));
			break;
		case "linkText":
			ele= driver.findElement(By.linkText(value));
			break;
		case "partialLinkText":
			ele= driver.findElement(By.partialLinkText(value));
			break;
		case "xpath":
			ele= driver.findElement(By.xpath(value));
			break;
		case "css":
			ele= driver.findElement(By.cssSelector(value));
			break;
		default:
			System.out.println("finding the username elemnts will be locator type and value");
		}
		return ele;
	}

	// void --- type(String type, String value, String text)

	public void type(String type, String value, String text) {
		WebElement element = getElement(type, value);
		element.clear();
		element.sendKeys(text);
	}

	// void --- click(String type, String value)

	public void click(String type, String value) {
		WebElement element = getElement(type, value);
		element.click();
	}

	// String --- getElementText(String type, String value)

	public String getElementText(String type, String value) {
		WebElement element = getElement(type, value);
		System.out.println("Login Button Text: " + element);
		return element.getText();
	}

	// String --- getElementAttribute(String type, String value, String attribute)

	public String getElementAttribute(String type, String value, String attribute) {
		WebElement element = getElement(type, value);
		return element.getAttribute(attribute);
	}

}
