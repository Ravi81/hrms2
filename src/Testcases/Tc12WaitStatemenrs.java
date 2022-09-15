package Testcases;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Tc12WaitStatemenrs {

	public static void main(String args[])throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "\\WEB DRIVERS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		//wait until login btn available
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(4));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
		driver.findElement(By.name("Submit")).click();
		//wait for empinfo page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		System.out.println("login cmpltd");
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(4000);
		driver.close();
		
		
	}
        	
	
}

