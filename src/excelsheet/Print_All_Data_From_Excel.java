package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Print_All_Data_From_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Selenium\\Excel sheet\\New Microsoft Excel Worksheet.xlsx\\");

		
		                Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		                
		                for(int i=0;i<=sh.getLastRowNum();i++)
		                {
		                	for(int j=0;j<=sh.getRow(i).getLastCellNum()-1;j++)
		                	{
		                		  Cell cellvalue = sh.getRow(i).getCell(j);
		                		  
		                		  if(cellvalue.getCellType()== CellType.STRING)
		                		  {
		                			  System.out.print(cellvalue.getStringCellValue()+" ");
		                		  }
		                		  else if(cellvalue.getCellType()== CellType.NUMERIC)
		                		  {
		                			  System.out.print(cellvalue.getNumericCellValue()+ " ");
		                		  }
		                		  else if (cellvalue.getCellType()==CellType.BOOLEAN)
		                		  {
		                			  System.out.print(cellvalue.getBooleanCellValue()+ " ");
		                		  }
		                	}
		                	System.out.println();
		                }
	}

}
