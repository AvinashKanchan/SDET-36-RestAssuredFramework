package Authentications;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class BearerTokenTest {
	
	@Test
	public void bearerTokenTest()
	{	
		//Step 1: create pre requisites
		HashMap map = new HashMap();
		map.put("name", "sdet36-rest");
		map.put("description", "api framework");
		
		given()
		  .auth()
		  .oauth2("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")
		  .body(map)
		  .contentType(ContentType.JSON)
		
		//Step 2: send request and validate response
		.when()
		  .post("https://api.github.com/user/repos")
		.then().log().all();
	}

}
