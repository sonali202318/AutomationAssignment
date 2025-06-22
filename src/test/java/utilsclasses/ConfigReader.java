package utilsclasses;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//Use config file
public class ConfigReader {
	private static Properties properties;

	
	static {
		try {
			FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\File\\config.properties");
			properties = new Properties();
			properties.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Failed to load config.properties file.");
		}
	}


	public static String get(String key) {
		String value = properties.getProperty(key);
		if (value == null) {
			throw new RuntimeException(" Key not found in config file: " + key);
		}
		return value;
	}
}