package BasicCRUDoperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllProjectsTest {
	
	@Test
	public void getAllProjectsTest()
	{
		//Step 1: create required data
		
		//Step 2: Send the request
		Response resp = RestAssured.get("http://localhost:8084/projects");
		
		//Step 3: Validate the response
		ValidatableResponse validate = resp.then();
		validate.log().all();
	}

}
