package org.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot extends BaseInfo {
public static String captureScreenshot(WebDriver driver, String ScreenshotName) {
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	String path = System.getProperty("user.dir") + "/Screenshots/" + System.currentTimeMillis();
	File destination = new File(path);
	try {
		FileUtils.copyFile(source, destination);
		System.out.println("Screenshot taken successfully");
	} catch (IOException e) {
		System.out.println("capture failed" + e.getMessage());
	}
	return path;	
}
}
