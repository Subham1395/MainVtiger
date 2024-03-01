package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class consists of generic method for read the data form excel sheet
 * @author HP
 * 
 */
public class ExcelUtility {
	
	/**
	 * this method will used for read the data from excel sheet
	 * @param Sheet
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws Throwable
	 */
	public String readDataFromExcel(String Sheet, int rownum, int cellnum) throws Throwable
	{
		FileInputStream fis = new FileInputStream("src/test/resources/Exceldata2.xlsx");
		Workbook book =  WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(Sheet);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String value = cell.getStringCellValue();
		return value;
	}
	
	/**
	 * this method will use the read the data from excel sheet 
	 * @param Sheet
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws Throwable
	 */
	public String readDatafromDataFormatter(String Sheet, int rownum, int cellnum) throws Throwable
	{
		FileInputStream fis2 = new FileInputStream("src/test/resources/Exceldata2.xlsx");
		Workbook book = WorkbookFactory.create(fis2);
		 Sheet sheet = book.getSheet(Sheet);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		DataFormatter format = new DataFormatter();
		String value = format.formatCellValue(cell);
		return value;
	}

}
