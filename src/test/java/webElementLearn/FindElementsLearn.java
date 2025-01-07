package webElementLearn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumLearn.UserDefined;

public class FindElementsLearn {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, Exception {
	
		
		UserDefined d=new UserDefined();
		
		driver=d.browserChoice();
		
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		
		
		for(WebElement ele:links)
		{
			System.out.println(ele.getText());
		}
		
		
		
		d.quitDriver(driver);

	}

}
