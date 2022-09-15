package Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import static org.testng.Assert.assertEquals;
public class Tc20DragAndDrop {
	public static void main(String args[])throws Exception{
		System.setProperty("webdriver.chrome.driver","\\WEB DRIVERS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		//verify titlke
		assertEquals(driver.getTitle(),"Droppable | jQuery UI");
		System.out.println("title matched");
		//enter to frame
		driver.switchTo().frame(0);
		Actions ac=new Actions(driver);
		ac.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).perform();
		
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.close();
		
	}

}
