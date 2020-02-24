package org.qbrainx.test;

import org.base.BaseInfo;
import org.base.WorkbookData;
import org.openqa.selenium.WebDriver;
import org.pojo.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgDemo extends BaseInfo {
	public static LoginPage pojo;
public static WebDriver driver;

	/*@BeforeClass
	private void launching() {
		launchBrowser("www.gmail.com");
	}*/
	
	@BeforeMethod
	private void timing() {
		executiontime();
	}
	
	@Test
	private void testCaseOne() {
		launchBrowser("www.gmail.com");
		currentUrl();
		pojo = new LoginPage();
		fill(pojo.getUser(), "gowthamengineer2015");
		btnclk(pojo.getNextClick());
		fill(pojo.getPassword(), "MyvizhiGowtham");
		btnclk(pojo.getEnter());
	}
	
	@AfterMethod
	private void timings() {
		executiontime();
	}	
	
}
