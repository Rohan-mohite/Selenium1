package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Get_Cell_Count_in_Row {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Selenium\\Excel sheet\\New Microsoft Excel Worksheet.xlsx\\");

		                          int cellcount = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
		                          
		                          System.out.println("total no of cells in row no: 0 is:"+ cellcount);
	}

}
