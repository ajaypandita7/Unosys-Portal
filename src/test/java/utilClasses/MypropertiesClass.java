package utilClasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MypropertiesClass {
	public static String inputdata(String key) throws IOException {
		FileInputStream file = new FileInputStream("./src/test/resources/dataset.properties");
		Properties prop = new Properties();
		prop.load(file);
	
		return  prop.getProperty(key);

	}
}
