package org.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutor {
public static WebDriver driver;

public void textPassing(WebElement loc) {
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	jsExecutor.executeScript("arguments[0].setAttribute('value', 'text')", loc);
}

public void getText(WebElement loc) {
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	jsExecutor.executeScript("return arguments[0].getAttribute('value')", loc);
}

// scrolldown

public void scrollDown(WebElement loc) {
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	jsExecutor.executeScript("arguments[0].scrollIntoView(true)", loc);
}

//scrolldown

public void scrollUp(WebElement loc) {
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	jsExecutor.executeScript("arguments[0].scrollIntoView(false)", loc);
}

}
