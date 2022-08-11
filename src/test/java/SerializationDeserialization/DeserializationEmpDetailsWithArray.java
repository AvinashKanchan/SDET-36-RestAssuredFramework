package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeserialization.EmployeeDetailsWithArray;

public class DeserializationEmpDetailsWithArray {
	
	@Test
	public void deserEmpArrayTest() throws JsonParseException, JsonMappingException, IOException
	{
		//create object of object mapper
		ObjectMapper map = new ObjectMapper();
		
		//use read value method to read data from json file
		EmployeeDetailsWithArray e1 = map.readValue(new File(".\\EmpDetailsWithArray.json"), EmployeeDetailsWithArray.class);
		
		//use getters and setters
		System.out.println(e1.getAddress()); 
		System.out.println(e1.getEmail()[1]);
	}

}
