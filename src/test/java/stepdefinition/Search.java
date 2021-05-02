package stepdefinition;

import cucumber.api.java.en.Given;
import main.CucumberRunner;
import org.testng.Assert;

public class Search extends CucumberRunner {

	@Given("^I am on \"([^\"]*)\" search page$")
	public void iAmOnSearchPage(String text) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();
		if(text == "google") {
			Assert.assertEquals(title, "Google");
		} else if(text == "cucumber") {
			Assert.assertEquals(title, "cucumber - Google Search");
		} else if(text == "junit") {
			Assert.assertEquals(title, "junit - Google Search");
		}
	}
}
