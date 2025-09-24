package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

public class WritingDataToExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\QSP\\Desktop\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Bird");
		Row r = sh.getRow(2);
		Cell cell = r.createCell(4);
		cell.setCellValue("Crow");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\QSP\\Desktop\\TestData.xlsx");
		wb.write(fos);
//		ExcelUtility eUtil = new ExcelUtility();
//		eUtil.writeDataToExcelFile("Bird", 2, 0, "Peacock");
	}

}
