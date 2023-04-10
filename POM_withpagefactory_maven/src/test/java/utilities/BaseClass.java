package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
  @BeforeMethod
public void BeforeMethod() {
	  System.setProperty("webdriver.http.factory", "jdk-http-client");
	  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\chrome2\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.get("https://demosite.executeautomation.com/Login.html");
	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
  }

  @AfterMethod
public void AfterMethod() {
	driver.close();
  }
}

