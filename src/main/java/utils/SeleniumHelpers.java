package utils;

import java.util.List;

import org.openqa.selenium.WebElement;

public class SeleniumHelpers {
	

	
	public void sendDataTB(WebElement ele,String data)
	{
		boolean check=ele.isDisplayed();
		check&=ele.isEnabled();
		if(check)
		{
			ele.clear();
			ele.sendKeys(data);
		}
	}
	
	
	public void clickElement(WebElement ele)
	{
		boolean check=ele.isDisplayed();
		check&=ele.isEnabled();
		if(check)
		{
			ele.click();
		}
	}

	public String getTextElement(WebElement ele)
	{
		boolean check=ele.isDisplayed();
		check&=ele.isEnabled();
		if(check)
		{
			return ele.getText();
		}
		else
		{
			System.out.println("no element displayed returning null");
			return "";
		}
	}
	
	
	public void getTextFromElements(List<WebElement> ele)
	{
		if(ele.size()!=0)
		{
		for(WebElement elee:ele)
		{
			System.out.println(elee.getText());
		}
		}
		else
		{
			System.out.println("size of list is 0 can't print data");
		}
	}
}
