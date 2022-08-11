package Parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class QueryParameter {
	
	@Test
	public void queryParameterTest()
	{
		baseURI = "https://reqres.in";
		
		//Step 1: create pre requistites
		given()
		  .queryParam("page", 2)
		  .queryParam("page", 3)
		
		//Step2: send request and validate response
		.when()
		   .get("/api/users")
		.then().log().all();
	}

}
