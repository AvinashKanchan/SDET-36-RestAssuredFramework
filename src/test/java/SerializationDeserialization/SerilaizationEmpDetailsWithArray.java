package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeserialization.EmployeeDetailsWithArray;

public class SerilaizationEmpDetailsWithArray {
	
	@Test
	public void serEmpDetailsWithArray() throws JsonGenerationException, JsonMappingException, IOException
	{
		//Create Object of POJO Class
		int[] phone = {234234,9876};
		String[] mail = {"chaitra@gmail.com","chaitra@ty.com"};
		
		EmployeeDetailsWithArray emp = new EmployeeDetailsWithArray("Chaitra", "TY1234", phone, mail, "Banglore");
		
		//Create Object of object mapper
		ObjectMapper map = new ObjectMapper();
		
		//Use write value method write pojo object into json file
		map.writeValue(new File("./EmpDetailsWithArray.json"), emp);
	}

}
