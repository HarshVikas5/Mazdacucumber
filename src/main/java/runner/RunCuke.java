package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = "src/main/resources/Features/mazda_filter.feature", glue = "steps", plugin = {
		"json:target/cucumber-reports/Cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },tags = "@UITEST")

public class RunCuke extends AbstractTestNGCucumberTests{
	 

}
