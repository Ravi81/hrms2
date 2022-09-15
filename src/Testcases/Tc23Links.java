package Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;


public class Tc23Links {
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver", "\\WEB DRIVERS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		for(WebElement val:links) {
			System.out.println(val.getText());
			Thread.sleep(1000);
		}
		driver.close();
	}

}
