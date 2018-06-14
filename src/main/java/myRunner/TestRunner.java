package myRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/saikiran/eclipse-workspace/cucumber_selenium/src/main/java/Features/DealMap.feature", //the path of the feature files
		glue= {"stepDefinitions"}, //the path of the step definition files
		format= {"pretty","html:test-outout", "json:json-output/cucumber.json"}, //to generate different types of reporting
		monochrome= true, //display the console output in a proper readable format
		dryRun= false, //to check the mapping is proper between feature file and step def file 
		strict= true //will fail execution if there are undefined or pending steps
		)

public class TestRunner {

	
}
