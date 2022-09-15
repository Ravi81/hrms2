package Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TC11Dropdown {
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver", "\\WEB DRIVERS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		System.out.println("login");
		//enter to frame
		driver.switchTo().frame("rightMenu");
		Select st =new Select(driver.findElement(By.name("loc_code")));
		//st.selectByVisibleText("Emp.ID");
		//st.selectByIndex(1);
		st.selectByVisibleText("Emp. ID");
		Thread.sleep(4000);
		driver.findElement(By.name("loc_name")).sendKeys("4325");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("chkLocID[]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		//exit frame
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}

}
