package testNGbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Admin extends OrangeHRMLogin{
	
	@Test(invocationCount = 5)
	public void headingTest() throws Exception
	{
		WebElement ele=driver.findElement(By.xpath("//h6"));
		System.out.println(hp.getTextElement(ele));
		
	}
	
	@Test (dependsOnMethods = "headingTest")
	public void getData() throws Exception
	{
		List<WebElement> list=driver.findElements(By.xpath("//p[text()='Apply Leave']/../../..//p"));
		hp.getTextFromElements(list);
	}
	
	
	
	
	

}
