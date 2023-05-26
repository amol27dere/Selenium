package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class importString {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file= new FileInputStream("D:\\Study\\velocity class\\Automation\\Topics\\Selenium\\ImprtExcel\\ex1.xlsx");
		
	String	value =WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	
	System.out.println(value);
		
		
		
	}
	
	

}
