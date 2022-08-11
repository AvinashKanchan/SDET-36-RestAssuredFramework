package Parameters;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class FormParameter {
	
	@Test
	public void formParameterTest()
	{
		//Step 1: create pre requisites
		given()
		  .formParam("createdBy", "Chaitra")
		  .formParam("projectName", "tyss")
		  .formParam("status", "Completed")
		  .formParam("teamSize", 12)
		  .contentType(ContentType.JSON)
		
		//Step 2: send the request and validate response
		.when()
		  .post("http://localhost:8084/addProject")
		.then().log().all();
	}

}
