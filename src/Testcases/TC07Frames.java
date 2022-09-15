package Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class TC07Frames {
	public static void main(String args[])throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\WEB DRIVERS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("login cmplt");
		//enter to Frame
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
		System.out.println("click on add button");
		Thread.sleep(3000);
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Ravi");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Teja");
		driver.findElement(By.id("btnEdit")).click();
		Thread.sleep(3000);
		System.out.println("new emp added");
		//end frame
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		
		
	}

}
