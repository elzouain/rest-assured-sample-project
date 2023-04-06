package testprojects.restassured;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/features"},
		glue={"testprojects"},
		plugin = {"pretty"}
		)
public class RunTest extends AbstractTestNGCucumberTests{

}