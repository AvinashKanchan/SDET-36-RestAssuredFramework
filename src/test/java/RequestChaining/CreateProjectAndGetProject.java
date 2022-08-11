package RequestChaining;

import org.testng.annotations.Test;

import POJOClasses.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class CreateProjectAndGetProject {
	
	@Test
	public void createPGetP()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		//Step 1: Create the data
		ProjectLibrary pLib = new ProjectLibrary("Chaitra", "tyss"
				, "Created", 12);
		
		//Step 1: send the post request
		Response resp = given()
							.body(pLib)
							.contentType(ContentType.JSON)
						.when()
							.post("/addProject");
		
		//Step 3: capture project ID from the response body using json path
		String proID = resp.jsonPath().get("projectId");
		System.out.println(proID);
		
		//Step 4: use the captured project id in GET request
//		when()
//		  .get("/projects/"+proID)
//        .then().log().all();	
		
		given()
		  .pathParam("pid", proID)
		.when()
		  .get("/projects/{pid}")
		.then()
		  .assertThat().statusCode(200).log().all();
		
		
		//Step 5: use the project ID in delete request
		given()
		  .pathParam("pid", proID)
		.when()
		  .delete("/projects/{pid}")
		.then()
		  .assertThat().statusCode(204).log().all();
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
