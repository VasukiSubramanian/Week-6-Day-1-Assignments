package steps1;

import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadStepDefinitions extends BaseClass {
	
	@Given("Click on Create Lead link")
	public void clickCreateLead() {
		System.out.println("*******************************CREATE LEAD********************************");
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@Given("Enter the companyname as {string}")
	public void enterCompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}
	
	@Given("Enter the firstname as {string}")
	public void enterFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}
	
	@Given("Enter the lastname as {string}")
	public void enterLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}
	
	@Given("Enter the phonenumber as {string}")
	public void enterPhoneNumber(String phoneNumber) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoneNumber);
	}

	@When("Click on Create Lead button")
	public void clickOnCreateLead() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("View Leads page should be displayed")
	public void verifyViewLeadsPage() {
		String title = driver.getTitle();
		if (title.equals("View Lead | opentaps CRM"))
			System.out.println("View Leads Page is displayed");
		else
			System.out.println("View Leads Page is not displayed");
	}
}
