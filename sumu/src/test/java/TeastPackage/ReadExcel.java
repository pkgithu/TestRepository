package TeastPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {
	public static void main(String args[]) throws IOException
	{
		File file =new File("C:\\Users\\q\\eclipse-workspace\\sumu\\src\\main\\java\\Data\\DataSheet.xls");
		FileInputStream fis=new FileInputStream(file);
		
		HSSFWorkbook bk=new HSSFWorkbook(fis);
		HSSFSheet sheet= bk.getSheet("MySheet");
		HSSFRow row= sheet.getRow(1);
		HSSFCell cell=row.getCell(1);
		System.out.println(cell.getStringCellValue());
				
	}
	
}
