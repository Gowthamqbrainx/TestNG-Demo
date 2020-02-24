package org.base;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static WebDriver driver;

public void dropDownText(WebElement list, String text) {
	Select 	source = new Select(list);
	source.selectByVisibleText(text);
}

public void dropDownIndex(WebElement list, int index) {
	Select source = new Select(list);
	source.selectByIndex(index);
}

public void dropDownValue(WebElement list, String value) {
	Select source = new Select(list);
	source.selectByValue(value);
}

// TO SELECT ALL THE OPTIONS AVAILABLE UNDER A DROPDOWN ONE BY ONE

public void dropDownAllSelect(WebElement list, int index) {
	Select source = new Select (list);
	boolean multiple = source.isMultiple();						
	System.out.println(multiple);
	if (multiple==true) {										 
	List<WebElement> options = source.getOptions();				
	System.out.println(options); 								
	for (int i = 0; i < options.size(); i++) {					
		source.selectByIndex(i);		
	}
  }
}


// TO PRINT ALL THE OPTIONS IN A DROPDOWN ONE BY ONE

public void dropDownPrintAllOptions(WebElement list) {
	Select source = new Select(list);
	List<WebElement> alloptions = source.getOptions();
	for (WebElement values : alloptions) {
		String text = values.getText();
		System.out.println(text);
	}

}
}
