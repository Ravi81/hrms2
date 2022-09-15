package Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class Tc04{
	static String url="http://183.82.103.245/nareshit/login.php";
	static String username="nareshit";
	static String password="nareshit";
	static String title1="OrangeHRM - New Level of HR Management";
	static String title2="OrangeHRM";
	public static void main(String args[])throws Exception {
	System.setProperty("webdriver.chrome.driver","E:\\WEB DRIVERS\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to(url);
	if(driver.getTitle().equals(title1)) {
	System.out.println("Title matched");
}
	else {
		System.out.println("Title not mmatched");
		System.out.println(driver.getTitle());
	}
	driver.findElement(By.name("txtUserName")).sendKeys(username);
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	if(driver.getTitle().equals(title2)) {
		System.out.println("Title Matrched");
}
	else {
		System.out.println("Title not Matched");
		System.out.println(driver.getTitle());
}
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("logout cmpltd");
	driver.close();
	
}

}
