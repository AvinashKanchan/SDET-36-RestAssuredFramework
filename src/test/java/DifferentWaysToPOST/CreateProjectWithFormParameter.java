package DifferentWaysToPOST;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectWithFormParameter {
	
	@Test
	public void createP()
	{
		baseURI = "http://localhost:8084";
		
		//Step 1: craete data
		given()
		  .formParam("createdBy", "Chaitra")
		  .formParam("projectName", "tyss")
		  .formParam("status", "created")
		  .formParam("teamSize", 12)
		  .contentType(ContentType.JSON)
		.when()
		  .post("/addProject")
		.then()
		  .assertThat().statusCode(201).log().all();
		
		//Step 2: send request and validate response
	}

}
