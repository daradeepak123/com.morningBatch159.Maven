package testNGbasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import seleniumLearn.UserDefined;
import utils.SeleniumHelpers;

public class OrangeHRMLogin {
	public static File file;
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static WebDriver driver;
	public static String[] creds=new String[2];;
	public static UserDefined d=new UserDefined();
	SeleniumHelpers hp=new SeleniumHelpers();
	@BeforeSuite
	public void suitSetUP() throws Exception
	{
		file=new File("C:\\demo\\employee.xlsx");
		fis=new FileInputStream(file);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheetAt(1);
		
		creds[0]=sheet.getRow(0).getCell(0).toString();
		creds[1]=sheet.getRow(0).getCell(1).toString();
			
	}
	
	@BeforeClass
	public void openBrowser() throws Exception
	{
		driver=d.browserChoice();
		System.out.println(driver.getCurrentUrl());
		
		WebElement userNameTB=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pwdTB=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement loginBTN=driver.findElement(By.xpath("//button"));
		
		hp.sendDataTB(userNameTB,creds[0]);
		hp.sendDataTB(pwdTB,creds[1]);
		hp.clickElement(loginBTN);
			
	}
	

	
	@AfterClass
	public void closeBrowser() throws Exception
	{
		d.quitDriver(driver);
	}
	@AfterSuite
	public void tearDown() throws Exception
	{
		wb.close();
	}
	
	
	
	
	
	
	
}
