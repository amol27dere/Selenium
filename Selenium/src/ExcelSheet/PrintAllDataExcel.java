package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllDataExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("D:\\Study\\velocity class\\Automation\\Topics\\Selenium\\ImportExcel\\ex1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		int rowlast = sh.getLastRowNum();
		
		for (int i = 0;i<=rowlast;i++) {
			
			int collast = sh.getRow(0).getLastCellNum()-1;
			for (int j=0 ;j<= collast; j++ ) {
				
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value +" ");
			}
			System.out.println();
			
			
			
			
		}
		
		
		
	}

}
