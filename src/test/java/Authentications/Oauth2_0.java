package Authentications;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Oauth2_0 {
	
	@Test
	public void oauth2Test()
	{
		baseURI = "http://coop.apps.symfonycasts.com";
		
		//Step 1: generate the access token
		Response resp = given()
						.formParam("client_id", "SDET-36-REST")
						.formParam("client_secret", "aed0c748117c713fe5a02442cc08e156")
						.formParam("grant_type", "client_credentials")
						.formParam("redirect_uri", "http://example.com")
						.formParam("code", "authorization_code")
		   
						.when()
						.post("/token");
		
		//Step 2: capture the access token using json path
		String token = resp.jsonPath().get("access_token");
		System.out.println(token);
		
		//Step 3: utilise the access Token
		given()
		  .auth()
		  .oauth2(token)
		  .pathParam("USER_ID", 1914)
		.when()
		  .post("/api/{USER_ID}/eggs-collect")
		.then().log().all();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
