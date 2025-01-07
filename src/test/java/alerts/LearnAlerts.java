package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumLearn.UserDefined;


public class LearnAlerts {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, Exception {
	
		
		UserDefined d=new UserDefined();
		
		driver=d.browserChoice();
		
		driver.findElement(By.xpath("(//button)[1]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button)[3]")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().sendKeys("hello");
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		
		d.quitDriver(driver);

	}

}
