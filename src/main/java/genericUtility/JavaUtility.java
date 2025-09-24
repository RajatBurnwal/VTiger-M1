package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 *	This is an utility class which has functionality from Java library
 */
public class JavaUtility {

	/**
	 * This is a generic method to fetch Calendar details for the given pattern
	 * @param pattern
	 * @return
	 */
	public String getCalendarDetails(String pattern)
	{
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String value = sdf.format(d);
		return value;
	}
	
	/**
	 * This is a generic method to generate random number for the given bound
	 * @param bound
	 * @return
	 */
	public int generateRandomNumbers(int bound)
	{
		Random r = new Random();
		int number = r.nextInt(bound);
		return number;
	}
}
