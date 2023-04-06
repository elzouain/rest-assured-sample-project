package testprojects.restassured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class BaseTestClass {

	protected Response response;

	public Response sendRequest(String requestType, String path) 
	{
		switch (requestType.toUpperCase()) {
		case "GET":
			response = RestAssured.given().get(path);
			break;
		default:
			throw new IllegalArgumentException();
		}

		return response;
	}

	public JsonPath getBodyAsJsonPath() 
	{
		return new JsonPath(response.getBody().asString());
	}
}
