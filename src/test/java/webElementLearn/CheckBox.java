package webElementLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumLearn.UserDefined;

public class CheckBox {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, Exception {
	
		
		UserDefined d=new UserDefined();
		
		driver=d.browserChoice();
		
		WebElement chkBox1=driver.findElement(By.xpath("(//input)[1]"));
		WebElement chkBox2=driver.findElement(By.xpath("(//input)[2]"));
		
		if(!chkBox1.isSelected())
		{
			chkBox1.click();
		}
		
		if(!chkBox2.isSelected())
		{
			chkBox2.click();
		}
		
		Thread.sleep(3000);
		
		d.quitDriver(driver);

	}

}
