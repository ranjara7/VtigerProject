package genericUtility;

//import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	/**
	 * This is a generic method to generate a random number
	 * @param bound
	 * @return
	 */
	public int generateRandomNumber(int bound)
	{
		Random r=new Random();
		int value=r.nextInt(bound);
		return value;
	}

	public String getCalendarDetails(String pattern)
	{
		Calendar cal=Calendar.getInstance();
		Date d=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		String value=sdf.format(d);
		return value;
	}

}