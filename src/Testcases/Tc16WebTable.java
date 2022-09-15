package Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Tc16WebTable {
	public static void main(String args[])throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\WEB DRIVERS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/HRMS/WebTable.html");
		//count
		int row=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
		int col=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();
		int row_col=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();
		System.out.println(row);
		System.out.println(col);
		System.out.println(row_col);
		//data cell
		String celldata=driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[4]/td[2]")).getText();
		System.out.println(celldata);
		//data table
		//dt var vv
		for (int i=1;i<=row;i++) {
			String datatable=driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
			System.out.println(datatable);
			Thread.sleep(4000);
				
		}
		driver.close();
	}

}
