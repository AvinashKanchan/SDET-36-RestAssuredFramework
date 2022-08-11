package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeserialization.EmployeeDetailsWithObject;

public class DeserializationEmpDetailsWithObject {
	
	@Test
	public void deserEmpObjectTest() throws JsonParseException, JsonMappingException, IOException
	{
		//Object mapper
		ObjectMapper map = new ObjectMapper();
		
		//use read value method to read data from json data
		EmployeeDetailsWithObject e2 = map.readValue(new File(".\\EmpDetailsWithObject.json"), EmployeeDetailsWithObject.class);
		
		//use getters and setters to access
		System.out.println(e2.getSpouse());
	}

}
