package DifferentWaysToPOST;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class CreateProjectWithJSONFile {
	
	@Test
	public void createPTest()
	{
		baseURI = "http://localhost:8084";
		
		//Step 1: create data
		File file = new File(".\\src\\test\\resources\\RequestData.json");
		
		//Step 2: send the request and validate the response
		given()
		  .body(file)
		  .contentType(ContentType.JSON)
		.when()
		  .post("/addProject")
		.then()
		  .assertThat().statusCode(201).log().all();
	}

}
