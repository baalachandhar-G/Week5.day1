package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DeleteLead extends BaseClass{
	
	@Test

	public void rundeleteLead() throws InterruptedException {
		
		        //click submit button
		
				Driver.findElement(By.linkText("CRM/SFA")).click();
				
				// click lead button
				
				Driver.findElement(By.linkText("Leads")).click();
				
				//Click Find Lead
				
				Driver.findElement(By.linkText("Find Leads")).click();
				
				//Click on Phone
				
				Driver.findElement(By.linkText("Phone")).click();
				
				//Enter the Phone Number Country code
				
				
				// Click the Find Lead Button
				
				Driver.findElement(By.linkText("Find Leads")).click();
				
				Thread.sleep(3000);
				
				//Capture the first lead id and of first resulting lead
				
			   String Leadid = Driver.findElement(By.xpath("(//button[@class='x-btn-text x-tbar-page-first']/preceding::div[@class='x-grid3-scroller']//a)[1]")).getText();
			   
			   System.out.println("Lead Id"+ Leadid);
			   
			   Driver.findElement(By.xpath("(//button[@class='x-btn-text x-tbar-page-first']/preceding::div[@class='x-grid3-scroller']//a)[1]")).click();
			   
			   Thread.sleep(3000);
			   
			   // click on delete
			   
			   Driver.findElement(By.xpath("//a[text()='Delete']")).click();
			   
			   //click on Find lead
			   
			   Driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
			   
			   
			   //enter the Capture Lead id
			   
			   Driver.findElement(By.xpath("//input[@name='id']")).sendKeys(Leadid);
			   
			   //click the Find lead button
			   
			   Driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			   
			   //Verify the message no record to display
			   
			   if(Driver.getTitle().contains("TestLeaf")) {
				   
				   System.out.println("The title is verified");
				   
			    }else {
			    	
			    	System.out.println("NO record to display");
			    }
			   
			   //close the browser
			   
			   Driver.close();
			   
				
				

	}

}
