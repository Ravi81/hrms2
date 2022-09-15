package Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome. ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

public class Tc060 {
	public static void main(String args[])throws Exception{
		System.setProperty("webdriver.chrome.driver","E:\\WEB DRIVERS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("title mtchd");
		}
		else {
			System.out.println("Title not amtched");
			System.out.println(driver.getTitle());
		}
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("login cmpltd");
		Thread.sleep(3000);
		if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("title mtchd");
		}
		else {
			System.out.println("Title not amtched");
			System.out.println(driver.getTitle());
		}
		driver.switchTo().frame("rightMenu");
		
		//mouse over
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("3"))).perform();
		//Actions ac1=new Actions(driver);
		//ac1.moveToElement(driver.findElement(By.linkText("View Reports"))).perform();
		System.out.println("mouse over cmpltd");
		driver.findElement(By.linkText("3")).click();
		driver.findElement(By.linkText("asd ase")).click();
		Thread.sleep(3000);
		System.out.println("click on sub button");
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		
	}


}
