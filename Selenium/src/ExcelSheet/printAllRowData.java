package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class printAllRowData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("D:\\Study\\velocity class\\Automation\\Topics\\Selenium\\ImportExcel\\ex1.xlsx");
		org.apache.poi.ss.usermodel.Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		int lastrow= sh.getLastRowNum();
		
		for (int i=0;  i<=lastrow;i++) {
			
			String value =sh.getRow(0).getCell(i).getStringCellValue();
			System.out.print(value+" ");
		}
		
		
	}

}
