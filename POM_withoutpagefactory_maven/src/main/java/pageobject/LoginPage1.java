package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage1 {
	WebDriver driver;
	public void LoginDetails()
	{
		WebElement user=driver.findElement(By.name("UserName"));
		user.sendKeys("tutorial");
		WebElement password=driver.findElement(By.name("Password"));
		password.sendKeys("tutorial");
		WebElement login=driver.findElement(By.name("Login"));
		login.click();
	}
	public LoginPage1(WebDriver driver)
	{
		this.driver=driver;
	}
	

}
