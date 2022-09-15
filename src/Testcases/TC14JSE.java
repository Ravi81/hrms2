package Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class TC14JSE {
	public static void main(String args[])throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\WEB DRIVERS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		//using jse click on login btn
		WebElement loginbtn=driver.findElement(By.name("Submit"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", loginbtn);
		Thread.sleep(4000);
		System.out.println("login cmpltd");
		WebElement logoutbtn=driver.findElement(By.linkText("Logout"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", logoutbtn);
		Thread.sleep(3000);
		System.out.println("logout cmpltd");
		driver.close();
		
	}

}
