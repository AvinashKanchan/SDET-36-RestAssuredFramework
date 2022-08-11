package CRUDOperationsWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import  static io.restassured.RestAssured.*;

public class CreateProjectTest {

	@Test
	public void createProjectTest()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		//Step 1: create data
		JSONObject obj = new JSONObject();
		obj.put("createdBy", "Chaitra");
		obj.put("projectName", "RMG");
		obj.put("status", "Created");
		obj.put("teamSize", 20);
		
		//Step 2: send the request
		given()
		  .body(obj)
		  .contentType(ContentType.JSON)
		.when()
		  .post("/addProject")
		.then()         //Step 3: Validate the response
		  .assertThat().statusCode(201).log().all();
		
		
		
	}
}
