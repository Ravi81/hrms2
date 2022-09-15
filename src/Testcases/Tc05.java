package Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Tc05 {
	static String url="http://183.82.103.245/nareshit/login.php";
	static String username="nareshit";
	static String password="nareshit";
	static String title1="OrangeHRM - New Level of HR Management";
	static String title2="OrangeHRM";
	
	public static void main(String args[])throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\WEB DRIVERS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(url);
		if((driver.getTitle().equals(title1))) {
			System.out.println("Title matched");
}
		else {
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
}
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(username);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3500);
		if((driver.getTitle().equals(title2))) {
			System.out.println("Title matched");
}
		else {
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
}
		//Mouse over function
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		Thread.sleep(4000);
		System.out.println("mouseover cmpld");
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(4000);
		System.out.println("click on submenu");
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		
		
		
		
		
}

}
