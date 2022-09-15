package Testcases;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class TC09KeybpordAction {
	public static void main(String args[])throws Exception {
		System.setProperty("webdriver.chrome.driver", "\\WEB DRIVERS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(3000);
		//click;keyboard;1.Tab,2.Enter
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		System.out.println("TAb");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		System.out.println("Enter");
		System.out.println("login");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("logout");
		driver.close();
			
	}

}
