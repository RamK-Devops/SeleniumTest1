package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MSExcelTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Use File API to save the filepath
		File filepath = new File("..\\SeleniumTest1\\File1\\TestExcel.xlsx");
			
		//File open in readable format
		FileInputStream Fread = new FileInputStream(filepath);
		
		//get the control of workbook
		XSSFWorkbook workbook = new XSSFWorkbook(Fread);
		
		//get the control of the sheet
		XSSFSheet sheet = workbook.getSheet("TSheet");
		
		//get the control of the row
		XSSFRow row = sheet.getRow(1);
		
		//get the data from desired cell of the row
		String uname = row.getCell(1).getStringCellValue();
		String Password = row.getCell(2).getStringCellValue();
		
		System.out.println("Username :"+uname);
		System.out.println("Password :"+Password);
		
		
	
		
	}

}
