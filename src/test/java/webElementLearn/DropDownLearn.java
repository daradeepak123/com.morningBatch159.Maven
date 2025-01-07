package webElementLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import seleniumLearn.UserDefined;

public class DropDownLearn {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, Exception {
	
		
		UserDefined d=new UserDefined();
		
		driver=d.browserChoice();
		
		WebElement dw=driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select sel=new Select(dw);
		
		sel.selectByVisibleText("Option 1");
		Thread.sleep(2000);
		sel.selectByIndex(2);

		Thread.sleep(2000);
		sel.selectByValue("1");
		Thread.sleep(2000);
		d.quitDriver(driver);

	}

}
