package ResponseValidation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class StaticResponseValidation {
	
	@Test
	public void staticResponseV()
	{
		baseURI = "http://localhost:8084";
		
		//Step 2: send request and validate the response
		when()
		 .get("/projects")
		.then()
		 .log().all();
	}

}
