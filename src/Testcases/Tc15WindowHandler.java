package Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

import org.openqa.selenium.By;

public class Tc15WindowHandler{
public static void main(String args[]) throws Exception {
	System.setProperty("webdriver.chrome.driver", "E:\\WEB DRIVERS\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///E:/HRMS/multiplewindows.html");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.id("btn2")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("btn3")).click();
	Thread.sleep(3000);
	ArrayList<String>windowinfo=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(windowinfo.get(0));
	Thread.sleep(4000);
	driver.quit();
	
	
}
}
