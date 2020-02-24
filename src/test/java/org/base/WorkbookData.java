package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;

public class WorkbookData extends BaseInfo {
public static WebDriver driver;
public static String value = null;

public static String dataFromWorkbook() throws IOException {
	File location = new File("F:\\Gowtham\\Oxygen workspaces\\TestNGDemo\\Workbook\\UserName&Password.xlsx");
	FileInputStream stream = new FileInputStream(location);
	Workbook book = new HSSFWorkbook(stream);
	Sheet sheet = book.getSheet("logindatas");
	for (int i = 1; i <11 && i>0; i++) {
		Row row = sheet.getRow(i);
		for (int j = 1; j <3 && j>0; j++) {
		Cell cell = row.getCell(j);
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
		}
	}
	return value;	
}
}
