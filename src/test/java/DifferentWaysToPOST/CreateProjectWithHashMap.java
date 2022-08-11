package DifferentWaysToPOST;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class CreateProjectWithHashMap {
	
	@Test
	public void createPTest()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		//Step 1: craete data
		HashMap map = new HashMap();
		map.put("createdBy", "Chaitra");
		map.put("projectName", "tyss");
		map.put("status", "created");
		map.put("teamSize", 20);

		//step 2: send request and validate response
		given()
		 .body(map)
		 .contentType(ContentType.JSON)
		.when()
		 .post("/addProject")
		.then()
		 .assertThat().statusCode(201).log().all();
	}

}
