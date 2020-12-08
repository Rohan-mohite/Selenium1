package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Getstring_value {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
	FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Selenium\\Excel sheet\\New Microsoft Excel Worksheet.xlsx\\");
	
	String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
	
	System.out.println(value);

	}

}
