package DifferentWaysToPOST;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectWithJSONObject {
	
	@Test
	public void createPTest()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		Random r = new Random();
		int ran = r.nextInt(200);
				
		
		//STep 1: create data
		JSONObject obj = new JSONObject();
		obj.put("createdBy", "Chaitra");
		obj.put("projectName", "TYSS-RMG"+ran);
		obj.put("status", "created");
		obj.put("teamSize", 12);
		
		//Step 2: send request and validate the response
		given()
		 .body(obj)
		 .contentType(ContentType.JSON)
		.when()
		 .post("/addProject")
		.then()
		 .assertThat().statusCode(201).log().all();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
