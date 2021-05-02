package stepdefinitionapi;

import cucumber.api.java.en.Given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import main.CucumberAPIRunner;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class GoogleAPI extends CucumberAPIRunner {

	RequestSpecBuilder reqSpecBuilder;
	RequestSpecification reqSpec;

	@Given("^I am on \"([^\"]*)\" search api page$")
	public void getSearchPage(String text) throws Throwable {
		reqSpecBuilder= new RequestSpecBuilder();
		reqSpecBuilder.setBaseUri("http://"+text+".com/");
		reqSpecBuilder.setBasePath("/");
		//reqSpecBuilder.addQueryParam("grp", "Cook");
		reqSpec = reqSpecBuilder.build();
		int statuscode = given()
				.spec(reqSpec)
				.when()
				.get("/search")
				.then()
				.extract().statusCode();

		assertThat("Status Code Should be 200", statuscode, equalTo(200));
	}
}
