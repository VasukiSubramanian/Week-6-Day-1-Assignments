package steps1;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLeadStepDefinition extends BaseClass{
	
	@When("Click on Delete button")
	public void clickDeleteButton() {
		driver.findElement(By.linkText("Delete")).click();
	}
	
	@Then("My Leads page should be displayed")
	public void verifyMyLeads() {
		String title = driver.getTitle();
		if(title.contains("My Leads"))
			System.out.println("My Leads page is displayed");
		else
			System.out.println("My Leads page is not displayed");
	}
}
