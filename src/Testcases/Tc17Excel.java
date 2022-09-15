package Testcases;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Tc17Excel {
	public static void main(String args[]) throws Exception{
		FileInputStream file=new FileInputStream("E:\\karteek.xls");
		Workbook wb=Workbook.getWorkbook(file);
		Sheet st=wb.getSheet(0);
		int rowcount=st.getRows();
		System.out.println(rowcount);
		for(int i=1;i<rowcount;i++) {
			
		String sno=st.getCell(0,i).getContents();
		String name=st.getCell(1,i).getContents();
		String id=st.getCell(2,i).getContents();
		String job=st.getCell(3,i).getContents();
		String slry=st.getCell(4,i).getContents();
		
		System.out.println(sno);
		System.out.println(name);
		System.out.println(id);
		System.out.println(job);
		System.out.println(slry);
		}
	}

}
