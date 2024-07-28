package lamdaDemo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	RemoteWebDriver driver;
	
	public void setup() throws MalformedURLException {
		
		
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 10");
		browserOptions.setBrowserVersion("126");
		HashMap<String, Object> ltOptions = new HashMap<String, Object>();
		ltOptions.put("username", "mkgp0001");
		ltOptions.put("accessKey", "Shwg96WkxzYMJrfali2h49BpUcmI1IyAuQqnUXD9XHTTpJGzxw");
		ltOptions.put("project", "Untitled");
		ltOptions.put("w3c", true);
		ltOptions.put("plugin", "java-java");
		browserOptions.setCapability("LT:Options", ltOptions);	
		driver= new RemoteWebDriver(new URL("https://mkgp0001:Shwg96WkxzYMJrfali2h49BpUcmI1IyAuQqnUXD9XHTTpJGzxw@hub.lambdatest.com/wd/hub"), browserOptions);
		
	}
	@Test
	public void myTest() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
		String title = driver.getTitle();
		System.out.print(title);
		

	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
