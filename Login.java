package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Login extends BaseClass{
	
	@Test

	public void runlogin() throws InterruptedException {
		// TODO Auto-generated method stub

        Driver.findElement(By.linkText("CRM/SFA")).click();
		
		Driver.findElement(By.linkText("Leads")).click();
		
		Driver.findElement(By.linkText("Create Lead")).click();
		
		Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
       
		Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("baala");
		
		Driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
		
		WebElement findElement = Driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select dd= new Select(findElement);
		
		dd.deselectByVisibleText("Conference");
		
		Driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(3000);
		
		String text = Driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		System.out.println(text);
		
		if(text.equals("Baalachandhar")) {
			
			System.out.println("Success");
			
		}else {
			
		    System.out.println("Failure");
			}

		
	}

}
