package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ActionClass {
public static WebDriver driver;

//TO PERFORM MOUSE OVER ACTION
public void mouseOverAction(WebElement loc) {
	Actions act = new Actions(driver);
	act.moveToElement(loc).perform();
}

//TO PERFORM DOUBLE CLICK 

public void doubleClick(WebElement loc) {
	Actions act = new Actions(driver);
	act.doubleClick(loc).perform();
}

//TO PERFORM RIGHT CLICK 

public void rightClick(WebElement loc) {
	Actions act = new Actions(driver);
	act.contextClick(loc).perform();
}

//TO PERFORM DOUBLE CLICK AND RGHT CLICK IN A SINGLE COMMAND LINE

public void doubleAndRightClick(WebElement loc) {
	Actions act = new Actions(driver);
	act.doubleClick().contextClick().build().perform();
}

//TO PERFORM DRAG AND DROP

public void dragAndDrop(WebElement source, WebElement destination) {
	Actions act = new Actions(driver);
	act.dragAndDrop(source, destination);
}
}
