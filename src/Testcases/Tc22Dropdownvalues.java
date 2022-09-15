package Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;
public class Tc22Dropdownvalues {
public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver", "\\WEB DRIVERS\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.manage().window().maximize();
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	System.out.println("login cmpltd");
	driver.switchTo().frame("rightMenu");
	Select st=new Select(driver.findElement(By.name("loc_code")));
	List<WebElement>dropval=st.getOptions();
	for(WebElement val:dropval) {
		System.out.println(val.getText());
		
	}
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
	
}
}
