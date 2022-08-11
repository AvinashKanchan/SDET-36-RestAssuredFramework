package GenericLibrary;

import io.restassured.response.Response;

/**
 * this class contains rest assured specific re usable methods
 * @author Chaitra M
 *
 */
public class RestAssuredLibrary {
	
	/**
	 * this method will get the json data through json path from response body
	 * @param resp
	 * @param path
	 * @return
	 */
	public String getJsonData(Response response,String path)
	{
		String jsonData = response.jsonPath().get(path);
		return jsonData;
	}

}
