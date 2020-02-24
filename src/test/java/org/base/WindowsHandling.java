package org.base;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowsHandling {
public static WebDriver driver;

//TO PASS CONTROL TO ALL THE SUB ID'S

private void windows() {
	String superId = driver.getWindowHandle();
	System.out.println(superId);
	Set<String> subIds = driver.getWindowHandles();
	System.out.println(subIds);
	if (!superId.equals(subIds)) {
		for (String id : subIds) {
			driver.switchTo().window(id);
		}
	}
}

}
