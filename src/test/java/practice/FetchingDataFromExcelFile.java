package practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

public class FetchingDataFromExcelFile {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("C:\\Users\\QSP\\Desktop\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
//		Cell cell= wb.getSheet("Animal").getRow(1).getCell(2);
		Sheet sh = wb.getSheet("Animal");
		Row r = sh.getRow(2);
		Cell cell = r.getCell(2);
//		String value = cell.getStringCellValue();
		double value = cell.getNumericCellValue();
//		DataFormatter df = new DataFormatter();
//		String value = df.formatCellValue(cell);
		System.out.println(value);
//		ExcelUtility eUtil = new ExcelUtility();
//		String value = eUtil.getSingleDataFromExcelFile("Animal", 1, 3);
//		System.out.println(value);
//		String value1 = eUtil.getSingleDataFromExcelFile("Fish", 1, 2);
//		System.out.println(value1);
	}

}
