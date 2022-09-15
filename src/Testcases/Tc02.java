package Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class Tc02 {
	public static void main(String args[]) throws Exception{
	    //Test Case Steps
	System.setProperty("webdriver.chrome.driver","E:\\WEB DRIVERS\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(3000);//wait for some time
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	System.out.println("Logout");
	Thread.sleep(4000);
	System.out.println(driver.getTitle());
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout");
	driver.close();
	}

}
