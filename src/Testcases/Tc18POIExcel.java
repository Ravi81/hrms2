package Testcases;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Tc18POIExcel {
	public static void main(String args[])throws Exception {
		FileInputStream fileinput=new FileInputStream("E:\\abc.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fileinput);
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getLastRowNum());
		System.out.println("Before updating cell data"+sheet.getRow(3).getCell(2));
		//write data in xl
		XSSFCell cell=sheet.getRow(3).getCell(2);
		cell.setCellValue("RAvIteja");
		fileinput.close();
		FileOutputStream fileOut=new FileOutputStream("E:\\abc.xlsx");
		workbook.write(fileOut);
		System.out.println("Update data after write is done"+cell.getStringCellValue());
		fileOut.close();
			
	}

}
