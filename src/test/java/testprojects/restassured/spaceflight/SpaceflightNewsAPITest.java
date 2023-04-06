package testprojects.restassured.spaceflight;

import org.junit.runner.RunWith;

import io.cucumber.java.en.*;
import io.cucumber.junit.Cucumber;
import io.restassured.RestAssured;
import testprojects.restassured.BaseTestClass;
import testprojects.restassured.ConfigLoader;
import testprojects.restassured.spaceflight.POJO.Articles;

import org.testng.Assert;

@RunWith(Cucumber.class)
public class SpaceflightNewsAPITest extends BaseTestClass{


	@When("user sends a {string} request to the articles endpoint")
    public void userSendsGetRequestToTheArticlesEndpoint(String requestType)
    {
		RestAssured.baseURI = ConfigLoader.getProperty("spaceflightnews_base_url");
		this.sendRequest(requestType, "/articles");
    }
	
	
	@And("user gets a status code of {int}")
	public void userGetsAStatusCodeOf(int expectedStatusCode)
	{
		Assert.assertTrue(this.response.statusCode() == expectedStatusCode, "Wrong status code " + this.response.statusCode());
	}

	
	@Then("user confirms the results count is higher than zero")
	public void userConfirmsResultsCountIsHigherThanZero()
	{
		Articles articles = this.response.as(Articles.class);
		Assert.assertTrue(articles.getCount() > 0);
	}
	
	
	@Then("user confirms the results array is not empty")
	public void userConfirmsAnArrayOfResultsIsReturned() 
	{
		Articles articles = this.response.as(Articles.class);
		Assert.assertFalse(articles.getResults().isEmpty());
	}
}
