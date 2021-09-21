package runner1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features1/", 
				 glue = "steps1", 
				 monochrome = true, 
				 publish = true)
				 //tags="@functional or @smoke")
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
