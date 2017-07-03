package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001 {
	@Test
    public void testcase1(){
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElementById("email").sendKeys("nitin");
		driver.findElementById("pass").sendKeys("nitin");
		driver.quit();
	}
}
