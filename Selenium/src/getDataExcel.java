import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class getDataExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file= new FileInputStream("D:\\Study\\prac.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
		int lastrowindex = sh.getLastRowNum();
		
		for(int i=0; i<=lastrowindex ;i++) {
			int lastCellindex = sh.getRow(i).getLastCellNum()-1;
			
			for(int j=0;j<=lastCellindex; j++) {
				
				java.lang.String value = sh.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(value+" ");
				
			}
			System.out.println();
			
			
		}
		
		
		
		
		
	}

}
