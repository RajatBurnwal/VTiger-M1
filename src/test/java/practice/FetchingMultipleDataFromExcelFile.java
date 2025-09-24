package practice;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;

import genericUtility.ExcelUtility;

public class FetchingMultipleDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

//		FileInputStream fis = new FileInputStream("C:\\Users\\QSP\\Desktop\\TestData.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("Animal");
//		System.out.println(sh.getLastRowNum());
//		DataFormatter df = new DataFormatter();
//		for(int i=1;i<=sh.getLastRowNum();i++)
//		{
//			Row r = sh.getRow(i);
//			System.out.println(r.getLastCellNum());
//			for(int j=0;j<r.getLastCellNum();j++)
//			{
//				Cell cell = r.getCell(j);
//				String value = df.formatCellValue(cell);
//				System.out.print(value+" ");
//			}
//			System.out.println();
//		}
		ExcelUtility eUtil = new ExcelUtility();
		List<String> datas = eUtil.getMultipleDataFromExcelFile("Animal", 1, 0);
		System.out.println(datas);
	}

}
