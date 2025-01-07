package webElementLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumLearn.UserDefined;

public class FileUpload {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, Exception {
	
		
		UserDefined d=new UserDefined();
		
		driver=d.browserChoice();
		
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys(System.getProperty("user.dir")+"/dataFiles/employee.xlsx");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='file-submit']")).click();
		Thread.sleep(5000);
		d.quitDriver(driver);

	}

}
