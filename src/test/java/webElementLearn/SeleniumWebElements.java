package webElementLearn;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumLearn.UserDefined;

	public class SeleniumWebElements {
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {

		UserDefined ud=new UserDefined();
		
		driver=ud.browserChoice();
		
		Thread.sleep(2000);
		
		WebElement unameTB=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pwdTB=driver.findElement(By.xpath("//input[@type='password']"));
		WebElement loginBTN=driver.findElement(By.xpath("//button[@type='submit']"));
		
		unameTB.clear();
		unameTB.sendKeys("Admin");

		pwdTB.clear();
		pwdTB.sendKeys("admin123");
		
		loginBTN.click();
		
		
		Thread.sleep(2000);
		
		ud.quitDriver(driver);
		
		
		

	}

}
