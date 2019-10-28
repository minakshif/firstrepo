package property_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class properties_file {

	WebDriver driver=null;
	@Test
	public void getdata() throws IOException
	{
		Properties pop=new Properties();
		FileInputStream fin=new FileInputStream("C:\\Users\\Minakshi\\eclipse-workspace\\testNG_udemy\\src\\property_file\\data.properties");
		pop.load(fin);
		System.out.println(pop.getProperty("username"));
		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Minakshi\\Desktop\\JBK\\Selenium Software\\geckodriver.exe");
		
		driver.get(pop.getProperty("url"));
	}
	
	
	
}
