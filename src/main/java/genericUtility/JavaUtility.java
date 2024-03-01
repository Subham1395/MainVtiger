package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/** 
 * This class generic method to generate the random no to avoid the duplicates
 */
public class JavaUtility {
	
	/**
	 * this method will used to generate the random number for every run 
	 * @return
	 */
	public int getrandomnum() 
	{
		Random ran = new Random();
		int rannum = ran.nextInt();
		return rannum;
	}
	
	/**
	 * this method will use to capture the date in required format
	 * @return
	 */
	public String getSystemDate()
	{
		Date d = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		String date = formatter.format(d);
		return date;
	}

}
