package org.qbrainx.test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.base.BaseInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample extends BaseInfo {
	static WebDriver driver;
	/*@BeforeMethod
	private void startTime() {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Date starttime = new Date();
		System.out.println(starttime);
	}*/

	@Test
	private void login() {
		System.setProperty("webdriver.chrome.driver", "F:\\Gowtham\\Oxygen workspaces\\TestNGDemo\\Drivers\\chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		ChromeOptions d = c.addArguments("--disable-notifications");
		driver = new ChromeDriver(d);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("www.google.com");		
		
		System.out.println("test case 1");
	}

	@AfterMethod
	private void endTime() {
		Date endTime = new Date();
		System.out.println(endTime);
	}

}
