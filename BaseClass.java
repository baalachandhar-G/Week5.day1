package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public ChromeDriver Driver;
	
	@BeforeMethod
	
	public void precondition() {
		
		WebDriverManager.chromedriver().setup();
		
		Driver= new ChromeDriver();
		
		Driver.get("http://leaftaps.com/opentaps/control/login");
		
		Driver.manage().window().maximize();
		
		WebElement Username = Driver.findElement(By.id("username"));
		
		Username.sendKeys("DemoSalesManager");
		
		Driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		Driver.findElement(By.className("decorativeSubmit")).click();
		
	}
	
	@AfterMethod
	
	public void postcondition() {
		
		Driver.close();
		
	}
	
	
	
	
	
	
	
	
	
}
