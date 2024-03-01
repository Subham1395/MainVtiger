package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * This class contains generic method for read the data from properties file
 * @author HP
 */
public class PropertiesUtility {

	/**
	 * this method will use to read the data from properties file
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String readDataFromPrpertiesFile(String key) throws Throwable
	{
    FileInputStream fis = new FileInputStream("src/test/resources/commondata.properties");
    Properties poj= new Properties();
    poj.load(fis);
   String value = poj.getProperty(key);
   return value;
	}
	
	

}
