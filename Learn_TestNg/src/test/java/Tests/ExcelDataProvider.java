package Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider {

	@DataProvider(parallel = true)
	public Object[][] getdata() throws Exception {

		File excelfile = new File("C:\\Users\\newas\\eclipse-workspace\\Learn_TestNg\\src\\test\\resources\\Data.xlsx");
		// System.out.println(excelfile.exists());
		FileInputStream fis = new FileInputStream(excelfile);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		// System.out.println(sheet.getPhysicalNumberOfRows());

		int noOfRow = sheet.getPhysicalNumberOfRows();
		int noOfColumns = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[noOfRow - 1][noOfColumns];
		for (int i = 0; i < noOfRow - 1; i++) {
			for (int j = 0; j < noOfColumns; j++) {
				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));

			}

		}
		workbook.close();
		fis.close();

//		for (Object[] dataArr : data) {
//			System.out.println(Arrays.toString(dataArr));
//		}
		return data;
	}

}
