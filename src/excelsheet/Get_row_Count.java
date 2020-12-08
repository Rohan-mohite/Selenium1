package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Get_row_Count {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Selenium\\Excel sheet\\New Microsoft Excel Worksheet.xlsx\\");

		                 int lastrowindex = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		                 
		                 System.out.println(lastrowindex);
		                 
		                 System.out.println("total no of rows in sheet :"+(lastrowindex +1));
	}

}
