package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetching_Data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Selenium\\Excel sheet\\New Microsoft Excel Worksheet.xlsx\\");
		
		           String value = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
		           
		           System.out.println(value);

	}

}
