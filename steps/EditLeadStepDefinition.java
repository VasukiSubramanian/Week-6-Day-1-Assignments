package steps1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class EditLeadStepDefinition extends BaseClass{

	
	@Given("Click on Find Leads link")
	public void clickFindLeadsLink() {
		System.out.println("*******************************EDIT LEAD********************************");
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@Given("Click on Phone link")
	public void clickPhoneLink() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	
	@Given("Search for phonenumber {string}")
	public void searchPhoneNumber(String phone) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phone);
	}
	@Given("Click on Find Leads button")
	public void clickFindLeadsButon() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	@Given("Click on First LeadID")
	public void clickFirstLeadID() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	
	@Given("Click on Edit link")
	public void clickEditLink() {
		driver.findElement(By.linkText("Edit")).click();
	}
	
	@Given("Rename companyname as {string}")
	public void renameCompanyName(String company) {
		WebElement companyElement = driver.findElement(By.id("updateLeadForm_companyName"));
		companyElement.clear();
		companyElement.sendKeys(company);
	}
	
	@When("Click on Update button")
	public void clickUpdateButton() {
		driver.findElement(By.name("submitButton")).click();
	}
}
