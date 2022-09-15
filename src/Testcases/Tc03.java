package Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class Tc03 {
	public static void main(String args[])throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\WEB DRIVERS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		//Verify Page title
		//Actual Result    compare exp.result
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("Title matched");
		}
			else {
				System.out.println("Title not matched");    
				System.out.println(driver.getTitle());
			}
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("login cmopltd");
		Thread.sleep(4000);
		//Verify Title
		if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("Title Matched");
		}
		else {
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());		}
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		System.out.println("Logout cmpltd");
		driver.close();
					
	}
	
}
