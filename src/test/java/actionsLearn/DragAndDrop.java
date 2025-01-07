package actionsLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import seleniumLearn.UserDefined;

public class DragAndDrop {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, Exception {
	
		
		
		UserDefined d=new UserDefined();
		
		driver=d.browserChoice();
		
		Actions act=new Actions(driver);
		
		
//		WebElement drag=driver.findElement(By.xpath("//div[@id='column-a']"));
//		WebElement drop=driver.findElement(By.xpath("//div[@id='column-b']"));
//		
//		
//		act.dragAndDrop(drag, drop).build().perform();
//		
//		act.contextClick();
//		act.scrollToElement(drop).build().perform();
		
		
		
		WebElement link=driver.findElement(By.xpath("//a[text()='Elemental Selenium']"));
		act.moveToElement(link).build().perform();
		Thread.sleep(3000);
		d.quitDriver(driver);

	}

}
