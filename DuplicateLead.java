package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DuplicateLead extends BaseClass{
	
	@Test

	public void runDuplicateLead() throws InterruptedException {
		
		//click submit button
		
		Driver.findElement(By.linkText("CRM/SFA")).click();
		
		// click lead link
		
		Driver.findElement(By.linkText("Leads")).click();
		
		// Click Find Leads
		
		Driver.findElement(By.linkText("Find Leads")).click();
		
		//click on Email
		
		Driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		//enter Email
		
		Driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("baalachadharg@gmail.com");
		
		//click find lead button
		
		Driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		
		//capture the first leading result
		
		String FirstLead = Driver.findElement(By.xpath("(//button[@class='x-btn-text x-tbar-page-first']/preceding::div[@class='x-grid3-scroller']//a)[1]")).getText();
		
		System.out.println("First Lead"+FirstLead);
		
		// click first resulting lead
		
		Driver.findElement(By.xpath("(//button[@class='x-btn-text x-tbar-page-first']/preceding::div[@class='x-grid3-scroller']//a)[1]")).click();
		
		//Duplicated Lead
		
		Driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		
		//Verify title of the page
		
		String title = Driver.getTitle();
		System.out.println("Title of the page"+title);
		
		
		if(Driver.getTitle().contains("Duplicate Lead")) {
			
			System.out.println("The title of the page is verified");
			
		}else {
			
			System.out.println("The title i Null");
			
		}
		
		//Click the Create lead
		
		Driver.findElement(By.xpath("//input[@class='smallSubmit' and @value='Create Lead']")).click();
		
		//close
		
		Driver.close();

	}

}
