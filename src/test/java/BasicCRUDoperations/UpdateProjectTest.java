package BasicCRUDoperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectTest {
	
	@Test
	public void updateProjectTest()
	{
		//Step 1: create data
		JSONObject jObj = new JSONObject();
		jObj.put("createdBy", "Chaitra");
		jObj.put("projectName", "TYSS");
		jObj.put("status", "On Going");
		jObj.put("teamSize", 20);
		
		//Step 2: send the request
		RequestSpecification req = RestAssured.given();
		req.body(jObj);
		req.contentType(ContentType.JSON);
		
		Response resp = req.put("http://localhost:8084/projects/TY_PROJ_8006");
		
		//Step 3: validate response
		resp.then().log().all();
	}

}
