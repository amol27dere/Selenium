package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class printAllRowData1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file= new FileInputStream("D:\\Study\\velocity class\\Automation\\Topics\\Selenium\\ImportExcel\\ex1.xlsx");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		
		sh.getLastRowNum();
		
	}

}
