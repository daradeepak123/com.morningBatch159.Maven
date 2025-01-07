package windowLEarn;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumLearn.UserDefined;

public class WindowHandle {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, Exception {
	
		
		UserDefined d=new UserDefined();
		
		driver=d.browserChoice();
		
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		
		Set<String> win=driver.getWindowHandles();
		
		for(String s:win)
		{
			if(!s.equals(parentWindow))
			{
				driver.switchTo().window(s);
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
			}
		}
		
		System.out.println(driver.getTitle());
		
		d.quitDriver(driver);

	}

}
