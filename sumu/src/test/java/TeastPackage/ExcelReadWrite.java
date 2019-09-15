package TeastPackage;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelReadWrite {

	public static void main (String args[])
	{
		//XSSFWorkSheet
		String filePath = System.getProperty("user.dir") + "\\src\\main\\java\\Data\\DataSheet.xls";
		
		Map<Integer, Object[]> data = new HashMap<Integer, Object[]>();
		data.put(0, new Object[] {"Name", "EmpID"});
		data.put(1, new Object[] {"A", "12234"});
		data.put(2, new Object[] {"B", "12345"});
		data.put(3, new Object[] {"C", "32564"});
		
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sht = wb.createSheet("MySheet");
		
	
		
		for(int key : data.keySet()) {
			HSSFRow row = sht.createRow(key);
			for(int i = 0 ; i < data.get(key).length; i++) {
				HSSFCell cell = row.createCell(i);
				cell.setCellValue(data.get(key)[i].toString());
			}
		}
		
		
		try {
			wb.write(new File(filePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
