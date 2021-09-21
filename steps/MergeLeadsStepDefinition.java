package steps1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MergeLeadsStepDefinition extends BaseClass{
	
	public static List<String> allhandles;
	
	@Given("Click on Merge Leads link")
	public void clickMergeLeadsLink() {
		System.out.println("*******************************MERGE LEAD********************************");
		driver.findElement(By.linkText("Merge Leads")).click();
	}
	
	@Given("Click on From Lead widget")
	public void clickFromLead() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	}
	
	@Given("Enter {string} in firstname field")
	public void enterFirstName(String firstName) {
		Set<String> allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstName);
	}
	
	@Given("Click on To Lead widget")
	public void clickToLead() {
		driver.switchTo().window(allhandles.get(0));
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	}
	
	@When("Click Merge Button")
	public void clickUpdateButton() {
		driver.switchTo().window(allhandles.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
	}

}
