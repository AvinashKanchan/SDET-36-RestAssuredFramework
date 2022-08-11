package DifferentWaysToPOST;

import org.testng.annotations.Test;

import POJOClasses.ProjectLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectWithPOJO {
	
	@Test
	public void createP()
	{
		Random r = new Random();
		int ran = r.nextInt(1000);
		
		baseURI = "http://localhost";
		port = 8084;
		
		//Step 1: create data
		ProjectLibrary pLib = new ProjectLibrary("Chaitra", "tyss"+ran, "created", 12);
		
		//Step 2: send the request
		given()
		  .body(pLib)
		  .contentType(ContentType.JSON)
		.when()
		  .post("/addProject")
		.then()
		  .assertThat().statusCode(201).log().all();
	}

}
