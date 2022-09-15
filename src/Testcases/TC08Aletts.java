package Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
public class TC08Aletts {
	public static void main(String args[])throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\WEB DRIVERS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("logincmpltd");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
	    System.out.println("logout");
		driver.close();
		
		
		
	}

}
