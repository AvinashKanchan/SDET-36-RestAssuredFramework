package GenericLibrary;

import java.util.Random;

/**
 * This class contains all java specific generaic methods
 * @author Chaitra M
 *
 */
public class JavaLibrary {

	/**
	 * This method will generate random number for every execution
	 * @return
	 */
	public int getRandomNum()
	{
		Random r = new Random();
		return r.nextInt(1000);
	}
}
