package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This is an utility class which works with Excel file
 * @author QSP
 * @version 25-08-15
 */
public class ExcelUtility {

	/**
	 * This is a generic method to fetch single cell data from excel file
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return
	 * @throws Exception
	 */
	public String getSingleDataFromExcelFile(String sheetName, int rowIndex, int cellIndex) throws Exception
	{
		FileInputStream fis = new FileInputStream(IPathUtility.vtigerExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Cell cell = wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex);
		DataFormatter df = new DataFormatter();
		String value = df.formatCellValue(cell);
		return value;	
	}

	/**
	 * This is a generic method to fetch multiple data from Excel file
	 * @param sheetName
	 * @param rowStartIndex
	 * @param cellStartIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public List<String> getMultipleDataFromExcelFile(String sheetName, int rowStartIndex, 
			int cellStartIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(IPathUtility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		DataFormatter df = new DataFormatter();
		List<String> a1 = new ArrayList<String>();
		for(int i=rowStartIndex;i<=sh.getLastRowNum();i++)
		{
			Row r = sh.getRow(i);
			for(int j=cellStartIndex;j<r.getLastCellNum();j++)
			{
				Cell cell = r.getCell(j);
				a1.add(df.formatCellValue(cell));
			}
		}
		return a1;
	}

	/**
	 * This is a generic method to write data in a cell to excel file for an existing sheet and existing row
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void writeDataToExcelFile(String sheetName, int rowIndex, int cellIndex, 
			String value) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(IPathUtility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh;
		try {
			sh = wb.getSheet(sheetName);
		}catch(NullPointerException e)
		{
			sh = wb.createSheet(sheetName);
		}
		Row r;
		try {
			r = sh.getRow(rowIndex);
		}catch(NullPointerException e)
		{
			r = sh.createRow(rowIndex);
		}
		
		Cell cell = r.createCell(cellIndex);
		cell.setCellValue(value);
		FileOutputStream fos=new FileOutputStream(IPathUtility.excelPath);
		wb.write(fos);
	}

}
