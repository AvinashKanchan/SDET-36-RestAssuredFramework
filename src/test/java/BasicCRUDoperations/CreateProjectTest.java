package BasicCRUDoperations;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest {
	
	@Test
	public void createProjectTest()
	{
		//Create random number
		Random r = new Random();
		int random = r.nextInt(500);
		
		//Step 1: create the necessary data
		JSONObject jObj = new JSONObject();
		jObj.put("createdBy", "Chaitra");
		jObj.put("projectName", "TYSS"+random);
		jObj.put("status", "Created");
		jObj.put("teamSize", 20);
		
		//Step 2: Send the request
		RequestSpecification request = RestAssured.given();
		request.body(jObj);
		request.contentType(ContentType.JSON);
		
		Response resp = request.post("http://localhost:8084/addProject");
		
		//Step 3: Validate the response
		//System.out.println(resp.prettyPeek());
		ValidatableResponse validate = resp.then();
		validate.log().all();
	}

}
