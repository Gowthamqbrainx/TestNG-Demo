package org.base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertHandle {
public static WebDriver driver;

//  SIMPLE ALERT
	public void simpleAlert(WebElement loc) {
		System.out.println(driver.switchTo().alert().getText());
	Alert alt = driver.switchTo().alert();
	alt.accept();
	}
	
//  CONFIRM ALERT
	public void confirmAlert() {
		System.out.println(driver.switchTo().alert().getText());
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}
	
// PROMPT ALERT
	public void promptAlert(String text) {
		System.out.println(driver.switchTo().alert().getText());
		Alert alt = driver.switchTo().alert();
		alt.sendKeys(text);
		alt.accept();
	}

	
}
