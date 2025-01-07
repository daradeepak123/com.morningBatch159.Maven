package webElementLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumLearn.UserDefined;

public class WebTableLearn {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, Exception {
	
		
		UserDefined d=new UserDefined();
		
		driver=d.browserChoice();
		
		int row=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr")).size();
		int col=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[1]/td")).size();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				String data=driver.findElement(By.xpath("//table[@id='table1']//tbody//tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data+"\t");
			}
			System.out.println();
		}
		
		
		Thread.sleep(3000);
		d.quitDriver(driver);

	}

}
