package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EditLead extends BaseClass{
	
	@Test

	public void runEditLead() {
	
		        //click submit button
		
				Driver.findElement(By.linkText("CRM/SFA")).click();
				
				// click lead link
				
				Driver.findElement(By.linkText("Leads")).click();
				
				//click on create Lead
				
				Driver.findElement(By.linkText("Create Lead")).click();
				
				//Enter the company Name fiedl using id locator
				
				Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
				
				//Enter the First Name using id locator
				
				Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Baala");
				
				//Enter the Last Name using ID
				
				Driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chandhar");
				
				//Enter the Department Name
				
				Driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT Technology");
				
				// Enter the Description Using any Locator
				
				Driver.findElement(By.id("createLeadForm_description")).sendKeys("This is Qeagle Test case for Execution");
				
				//Enter the email Address using any locator
				
				Driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Qeagle@gmail.com");
				
				//Select the state of province as Norway using visible text
				
				WebElement findElement = Driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
				
				Select dropdown= new Select(findElement);
				
				dropdown.selectByVisibleText("Norway");
				
				
				// click on submit button
				
				Driver.findElement(By.name("submitButton")).click();
				
				//click Edit Button
				
				Driver.findElement(By.linkText("Edit")).click();
				
				//clear description field using clear
				
				Driver.findElement(By.id("updateLeadForm_description")).clear();
				
				//fill the important note with any text
				
				Driver.findElement(By.id("updateLeadForm_description")).sendKeys("This is the Test Leaf test data for the  Important notes");
				
				//click on update button
				
				Driver.findElement(By.className("smallSubmit")).click();
				
				//get the title of resulting
				
				String title = Driver.getTitle();
				
				System.out.println("Title"+title);
				
				//close
				
				
				
	}

}
