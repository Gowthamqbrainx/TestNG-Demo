package org.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;
public LoginPage() {
	PageFactory.initElements(driver, this);
}
	@FindBy (id = "identifierId")
	private WebElement user;
	
	@FindBy (className = "ZFr60d CeoRYc")
	private WebElement nextClick;
	
	@FindBy (className = "whsOnd zHQkBf")
	private WebElement password;
	
	@FindBy (xpath = "//*[@id=\"passwordNext\"]/div[2]")
	private WebElement enter;
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getNextClick() {
		return nextClick;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getEnter() {
		return enter;
	}
	
}
