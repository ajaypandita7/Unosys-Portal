package utilClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelClass {
	
	public String InputData(String sheet, int row,int cell ) throws Exception {
		
		FileInputStream file = new FileInputStream("./src/test/resources/UnosysData.xlsx");
		Workbook workBook = WorkbookFactory.create(file);
		String exceldata = workBook.getSheet(sheet).getRow(row).getCell(cell).toString();
		return exceldata;
	}

}
