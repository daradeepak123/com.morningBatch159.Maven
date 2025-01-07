package seleniumLearn;
import org.openqa.selenium.WebDriver;

public class SeleniumBasics {

	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, Exception {
	
		
		UserDefined d=new UserDefined();
		
		driver=d.browserChoice();
		
		
		String cURL=driver.getCurrentUrl();
		System.out.println(cURL);
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		Thread.sleep(5000);
		driver.quit();
		

	}

}
