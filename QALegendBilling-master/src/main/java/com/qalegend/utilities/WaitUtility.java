package com.qalegend.utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitUtility {
 
	public static final long EXPLICIT_WAIT=20000;
	public static final long IMPLICIT_WAIT=20;
	public static final long HARD_WAIT=20000;
	public static final long FLUENT_WAIT=20000;
	
	public void setHardWait()
	{
		try {
			Thread.sleep(HARD_WAIT);
		}
		catch (InterruptedException e)
		{
			throw new RuntimeException(e);
		}
	}
	
	public static void  SetImplicitWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
	}
	
public static void  SetExplicitWait(WebDriver driver)
{
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("username"))));
}
}
