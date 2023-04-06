package testprojects.restassured;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
	
	private static Properties properties;
	private static ConfigLoader INSTANCE;
	
	private ConfigLoader() throws FileNotFoundException, IOException 
	{
		properties = new Properties();
		properties.load(new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/config.properties"));
	}
	
	public static String getProperty(String propertyName)
	{
		try {
			if(INSTANCE == null)
				INSTANCE = new ConfigLoader();			
		}catch(Exception e) {
			return null;
		}		
		return (String) properties.get(propertyName);
		
	}

}
