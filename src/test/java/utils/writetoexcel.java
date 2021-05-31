package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writetoexcel {
		
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub

			String path = "C:\\Users\\SravaniJagarlamudi\\SDET\\Assignment3_RestAssured\\Rest Assured.xlsx";

			FileInputStream fis = new FileInputStream(path);

			XSSFWorkbook workbook = new XSSFWorkbook(fis);

			XSSFSheet sheet = workbook.getSheetAt(0);
			sheet.getRow(2).getCell(1).setCellValue("ibm sdet");

			FileOutputStream obj = new FileOutputStream(path);
			workbook.write(obj);
			obj.close();

			workbook.close();
			System.out.println("Value has been written successfully ");

		}
}
