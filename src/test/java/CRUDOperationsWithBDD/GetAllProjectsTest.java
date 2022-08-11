package CRUDOperationsWithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetAllProjectsTest {
	
	@Test
	public void getAllP() {
		
		baseURI = "http://localhost";
		port = 8084;
		
		//Step 1: create data
		
		//Step 2: send teh request and validate response
		when()
		  .get("/projects")
		.then()
		  .assertThat().statusCode(200).log().all();
		
		
	}

}
