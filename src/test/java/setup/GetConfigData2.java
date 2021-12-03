package setup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
//REMEMBER ALWAYS TO LOCATE the properties file in the root path of the project for reading properties file content
public class GetConfigData2 {
	static String driverPath = null;
	static String url = null;
	static String browser = null;
	
	public static void main(String [] args) {
		// TODO Auto-generated method stub
		List<String> data = null;
		Properties prop = new Properties();
		InputStream input = null;
		try {
			input = new FileInputStream("config.properties");
			try {
				prop.load(input);
			} catch (IOException e) {
					// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driverPath = prop.getProperty("driverpath");
		url = prop.getProperty("url");
		browser = prop.getProperty("browser");
		data.add(url);
		data.add(browser);
			
		System.out.println("Url is: "+url +"and browser is: "+browser+ "and driver path is: "+driverPath);
	}
}
