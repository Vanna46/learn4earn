package automation_basics;

import java.io.FileInputStream;
import java.util.Properties;

public class Concept_PropertiesFile {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		//String path = System.getProperty("user.dir")+"\\src\\test\\java\\automation_basics\\config.properties";
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\automation_basics\\config.properties");
		prop.load(ip);
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
		System.out.println(System.getProperty("user.dir"));

	}

}
