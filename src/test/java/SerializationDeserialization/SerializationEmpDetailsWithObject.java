package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeserialization.EmployeeDetailsWithObject;
import POJOforSerializationAndDeserialization.Spouse;

public class SerializationEmpDetailsWithObject {
	
	@Test
	public void serEmpWithObjectTest() throws JsonGenerationException, JsonMappingException, IOException
	{
		//create Object with pojo Class
		int[] phone = {1234,8765};
	    String[] mail = {"guru@gmail.com","guru@ty.com"};
		Spouse sp = new Spouse("Rani", 1234, "Accenture");
		EmployeeDetailsWithObject emp = new EmployeeDetailsWithObject("guru", "ty345", phone, mail, sp);
		
		//Create Object of object Mapper
		ObjectMapper map = new ObjectMapper();
		
		//use write value method
		map.writeValue(new File("./EmpDetailsWithObject.json"), emp);
	}

}
