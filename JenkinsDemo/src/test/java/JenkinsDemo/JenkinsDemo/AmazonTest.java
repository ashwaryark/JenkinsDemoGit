package JenkinsDemo.JenkinsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {
	
	@Test
	public void amazonTest() throws InterruptedException
	{
	//System.setProperty("webdriver.chrome.driver", "C:\\UsersSARAVANAN R\\Desktop\\ArisGlobalB2\hromedriver.exe");
	WebDriverManager.chromedriver().setup();
	//driver = new ChromeDriver();
	  WebDriver myD=new ChromeDriver();
	  myD.get("https://www.amazon.in/");
	  Thread.sleep(4000);
	  System.out.println(myD.getTitle());
	  myD.close();
	}
}
