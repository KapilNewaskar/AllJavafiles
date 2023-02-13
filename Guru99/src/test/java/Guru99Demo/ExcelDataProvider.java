package Guru99Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider {

	@DataProvider(name = "LoginData")
	public Object[][] DataInfo() throws Exception {
		File excel = new File("C:\\Users\\newas\\eclipse-workspace\\Guru99\\Resources\\Data.xlsx");
		FileInputStream fis = new FileInputStream(excel);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet2");
		
		int noOfRows = sheet.getPhysicalNumberOfRows();
		int noOfColumns = sheet.getRow(0).getLastCellNum();
		

		Object[][] data = new Object[noOfRows - 1][noOfColumns];
		for (int i = 0; i < noOfColumns - 1; i++) {
			for (int j = 0; j < noOfColumns; j++) {
				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));
			}
		}
		workbook.close();
		fis.close();
		return data;
		
	}
	
}
