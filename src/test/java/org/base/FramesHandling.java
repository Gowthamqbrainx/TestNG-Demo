package org.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesHandling {
public WebDriver driver;
//TO HANDLE FRAMES BY USING WEBELEMENT ELEMENT

public void framesHandling(WebElement frame) {
	driver.switchTo().frame(frame);
}

//TO HANDLE THE MULTIPLE FRAMES

public void multiFramesHandling(String iframe) {
	List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
	int framesize = allFrames.size();
	System.out.println(framesize);
	for (int i = 0; i < framesize; i++) {
		driver.switchTo().frame(i);
	}

}
}
