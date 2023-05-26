package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getRowSizeInASheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("D:\\Study\\velocity class\\Automation\\Topics\\Selenium\\ImportExcel\\ex1.xlsx");
		int lastrow=  WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum()+1;
		System.out.println(lastrow);
		int lastcol=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum()+1;
		System.out.println(lastcol);
		
		
	}

}
