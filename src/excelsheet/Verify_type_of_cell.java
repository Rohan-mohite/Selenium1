package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Verify_type_of_cell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Selenium\\Excel sheet\\New Microsoft Excel Worksheet.xlsx\\");

		        Cell cellvalue = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(0);
		        
		        if(cellvalue.getCellType()==CellType.STRING)
		        {
		        	System.out.println(cellvalue.getStringCellValue());
		 
		        }
		        else if
		        
		        (cellvalue.getCellType()==CellType.NUMERIC)
		        {
		        	System.out.println(cellvalue.getNumericCellValue());
		        }
		        else if
		        (cellvalue.getCellType()==CellType.BOOLEAN)
		        {
		        	System.out.println(cellvalue.getBooleanCellValue());
		        	
		        }
		        
		           
		           
	}

}
