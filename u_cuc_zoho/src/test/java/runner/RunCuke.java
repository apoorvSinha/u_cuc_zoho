package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"json:target/RunCuke/cucumber.json", 
				"pretty", 
				"html:target/RunCuke/cucumber.html"},
        features = "src/test/resources/features",
        glue = "stepdefs",
        tags = "@search_cars",
        dryRun = false,
        monochrome = true
		)
public class RunCuke extends AbstractTestNGCucumberTests{
	
}
