package org.qbrainx.test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.base.BaseInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG extends BaseInfo {
	static WebDriver driver;
@BeforeClass
private void beforeLaunch() {
	System.setProperty("webdriver.chrome.driver", "F:\\Gowtham\\Oxygen workspaces\\TestNGDemo\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

@BeforeMethod
private void startTime() {
	Date starttime = new Date();
	System.out.println(starttime);
}

@Test
private void login() throws InterruptedException {
	driver.get("https://www.gmail.com/");
	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("gowthamengineer2015");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(20000);
	driver.findElement(By.name("password")).sendKeys("MyvizhiGowtham");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//span[text()='Next']")).click();
}


@AfterMethod
private void endTime() {
	Date endTime = new Date();
	System.out.println(endTime);
}

@AfterClass
private void closeBrowser() throws InterruptedException {
	Thread.sleep(5000);
	String title = driver.getTitle();
	System.out.println(title);
//	driver.close();
}

}
