package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ImportInt {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file =  new FileInputStream("D:\\Study\\velocity class\\Automation\\Topics\\Selenium\\ImprtExcel\\ex1.xlsx");
		
		double value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
		
		System.out.println(value);
		
		
	}

}
