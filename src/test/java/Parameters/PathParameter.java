package Parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PathParameter {
	
	@Test
	public void pathParameterTest()
	{
		baseURI = "http://localhost:8084";
		
		//Step 1: Create data
		given()
		  .pathParam("pid", "TY_PROJ_1204")
		
		//Step 2: send the request and validate response
		.when()
		  .get("/projects/{pid}")
		  
		.then()
		  .assertThat().statusCode(200).log().all();
	}

}
