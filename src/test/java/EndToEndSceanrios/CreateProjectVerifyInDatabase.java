package EndToEndSceanrios;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BaseAPIClass;
import GenericLibrary.EndPointsLibrary;
import POJOClasses.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

public class CreateProjectVerifyInDatabase extends BaseAPIClass {
	
	@Test
	public void createPVerifyInDB() throws SQLException
	{
	   //Step 1: create pre requisites
	   ProjectLibrary pLib = new ProjectLibrary("Chaitra", "RMG"+jLib.getRandomNum(), "Created", 12);
		
	   //Step 2: send the request
	  Response response = given()
			  				.body(pLib)
			  				.contentType(ContentType.JSON)
			  				.when()
			  				.post(EndPointsLibrary.createProject);
	
	   //Step 3: capture the project ID
	  String expData = rLib.getJsonData(response, "projectId");
	  Reporter.log(expData,true);
		
	   //Step 4: validate the id in database
	  String query = "select * from project;";
	  String actData=dLib.readDataFromDBAndValidate(query, 1, expData);
	  
	  Assert.assertEquals(expData, actData);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}

}
