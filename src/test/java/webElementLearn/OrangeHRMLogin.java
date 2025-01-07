package webElementLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumLearn.UserDefined;

public class OrangeHRMLogin {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, Exception {
	
		
		UserDefined d=new UserDefined();
		
		driver=d.browserChoice();
		Thread.sleep(1000);
		WebElement unameTB=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pwdTB=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement loginBTN=driver.findElement(By.xpath("//button[text()=' Login ']"));
		
		
		unameTB.clear();
		unameTB.sendKeys("Admin");
		pwdTB.clear();
		pwdTB.sendKeys("admin123");
		loginBTN.click();
		Thread.sleep(3000);	

		WebElement dashBoard=driver.findElement(By.xpath("//h6"));
		String data=dashBoard.getText();
		System.out.println(data);
		
		
		if(data.contains("Dash"))
		{
			System.out.println("Testcase pass");
		}
		else
		{
			System.out.println("Testcase fail");
		}
		
		d.quitDriver(driver);

	}

}
