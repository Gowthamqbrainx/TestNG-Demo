package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseInfo {
public static WebDriver driver;
public static String value = null;
/*Created by Gowtham K on 06.02.2020
 * to configure the browser and implicitwait to all the locators
 */
public void launchBrowser(String url) {
	System.setProperty("webdriver.chrome.driver", "F:\\Gowtham\\Oxygen workspaces\\TestNGDemo\\Drivers\\chromedriver.exe");
	ChromeOptions c = new ChromeOptions();
	ChromeOptions d = c.addArguments("--disable-notification");
	driver = new ChromeDriver(d);
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
}

public void fill(WebElement location, String text) {
	System.out.println("Yes the field is enabled "+location.isEnabled());
	location.sendKeys(text);
}

public void btnclk(WebElement location) {
	System.out.println("Yes the button is enebled "+location.isEnabled());
	location.click();
}

public void currentUrl() {
System.out.println(driver.getCurrentUrl());
}

public void executiontime() {
	Date time = new Date();
	System.out.println(time);
}

public void fieldEnabled(WebElement field) {
	boolean enabled = field.isEnabled();
	System.out.println(enabled);
}

public void fieldDisplayed(WebElement field) {
	boolean displayed = field.isDisplayed();
	System.out.println(displayed);
	}

public void fieldSelected(WebElement field) {
	boolean selected = field.isSelected();
	System.out.println(selected);
}

}
