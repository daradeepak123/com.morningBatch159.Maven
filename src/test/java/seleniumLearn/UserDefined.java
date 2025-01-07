package seleniumLearn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserDefined {
	public static WebDriver driver;
	
	public WebDriver browserChoice() throws IOException
	{
		File file=new File(System.getProperty("user.dir")+"/dataFiles/config.properties");
		FileInputStream fis=new FileInputStream(file);
		Properties config=new Properties();
		config.load(fis);
		
		
		
		String browser=config.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("ff"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		driver.get(config.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		return driver;
	}
	
	public void quitDriver(WebDriver driver)
	{
		driver.quit();
	}
	

}
