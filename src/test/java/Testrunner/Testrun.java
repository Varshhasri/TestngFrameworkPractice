package Testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = ".//Features/loginpage.feature",
glue = "stepdefinition",
dryRun = false,
monochrome = false,
plugin = {
		"pretty","html:target/Cucumber-report/report.html" })


public class Testrun {

}
