package webElementLearn;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import seleniumLearn.UserDefined;

public class AllWebELementMethods {
	public static WebDriver driver;
	
	
	@Test
	public void main() throws Exception {
		UserDefined ud=new UserDefined();
		
		driver=ud.browserChoice();
		
		Thread.sleep(2000);
		
		WebElement forPassword=driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
		WebElement email=driver.findElement(By.xpath("//label[text()='E-mail']"));
		WebElement passTextBox=driver.findElement(By.id("email"));
		WebElement retButton=driver.findElement(By.id("form_submit"));
		
		String headingText=forPassword.getText();
		
		Assert.assertEquals(headingText, "Forgot Password");
		
			System.out.println(email.getText()+" this is lable text");
			boolean b=passTextBox.isDisplayed();
			b&=passTextBox.isEnabled();
			if(b)
			{
				passTextBox.clear();
				passTextBox.sendKeys("hello@abc.com");
			}
			else
			{
				System.out.println("email textbox is not displayed/enagled");
			}
			
			
			Dimension d=passTextBox.getSize();
			System.out.println(d.height+"\t"+d.width);
			
			
			Point p=retButton.getLocation();
			System.out.println(p.x+"\t"+p.y);
			
			retButton.click();
			WebElement errorMessage=driver.findElement(By.xpath("//h1[text()='Internal Server Error']"));
			String dataMessage=errorMessage.getText();
			
			
			SoftAssert sa=new SoftAssert();
			
			sa.assertEquals(dataMessage, "Internal Server Error");
			
			
				System.out.println("Testcase pass");
		
				sa.assertAll();
		
		
		Thread.sleep(2000);
		
		ud.quitDriver(driver);

	}

}
