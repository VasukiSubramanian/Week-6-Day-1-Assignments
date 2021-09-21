package steps1;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;

public class DuplicateLeadStepDefinition extends BaseClass{

	@Given("Click Duplicate Lead Link")
	public void clickDuplicateLink() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}
}
