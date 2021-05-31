package Assessment_API;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Valuesfromexcel {

	public static Object[][] gettestdata() throws IOException {
		// public static void main(String str[]) throws IOException{

		String path = "C:\\Users\\SravaniJagarlamudi\\SDET\\Assignment3_RestAssured\\Rest Assured.xlsx";

		FileInputStream fis = new FileInputStream(path);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheetAt(0);

		int totalrows = sheet.getLastRowNum()+1;
		Row row = sheet.getRow(1);
		int totalcolumn = row.getLastCellNum();

		System.out.println("Total Rows:" + totalrows);

		System.out.println("Total Columns" + totalcolumn);

		Object[][] data = new Object[totalrows][totalcolumn];

		for (int i = 1; i < totalrows; i++) {

			for (int j = 0; j < totalcolumn; j++) {

				try {
					data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.println(data[i][j]);

				}

				catch (NullPointerException ex)

				{
					System.out.println(ex.getMessage());
				}
			}

		}
		workbook.close();
		return data;

	}

}

