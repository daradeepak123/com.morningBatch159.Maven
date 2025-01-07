package testNGbasics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import seleniumLearn.UserDefined;

public class TestNGLearn {
	WebDriver driver;
	UserDefined d=new UserDefined();
	
	@BeforeSuite
	public void suiteSetUP()
	{
		//logic related to excel file
	}
	
	@AfterSuite
	public void tearDown()
	{
		//logic related to close all excel file and all
	}
	
	@BeforeClass
	public void openBrowser() throws Exception
	{
		driver=d.browserChoice();
		System.out.println(driver.getCurrentUrl());
	}
	
	@BeforeMethod
	public void goToUploadPage()
	{
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//a[text()='File Upload']")).click();
	}
	@AfterMethod
	public void goToUploadPagePost()
	{
		driver.get("https://the-internet.herokuapp.com");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		d.quitDriver(driver);
	}
	
	@Test(enabled = true)
	public void testLearn()
	{
		System.out.println(driver.getTitle());
	}
	@Test
	public void testLearn2() throws Exception
	{
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys(System.getProperty("user.dir")+"/dataFiles/employee.xlsx");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='file-submit']")).click();
		Thread.sleep(5000);
	}
	
	@Test
	public void testLearn1()
	{
		System.out.println(driver.findElement(By.xpath("//h3")).getText());
	}

}
