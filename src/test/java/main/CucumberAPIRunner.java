package main;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import helpers.ReportHelper;
import org.testng.annotations.AfterSuite;

@CucumberOptions(strict = true, monochrome = true, features = "src/test/resources/api_features", glue = "stepdefinitionapi", format = {"pretty","json:target/cucumber.json"}, tags = { "@Api" })

public class CucumberAPIRunner extends AbstractTestNGCucumberTests {

    @AfterSuite(alwaysRun=true)
    public void generateHTMLReports() {
        ReportHelper.generateCucumberReport();
    }

}
