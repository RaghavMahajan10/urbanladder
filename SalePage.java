package com.urbanladder.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.urbanladder.config.Variable;
import com.urbanladder.utils.Screenshot;

public class SalePage extends Variable {
WebDriver driver;
public SalePage(WebDriver driver)
{
	this.driver=driver;
}
	public void product() throws Exception 
	{	driver.findElement(saleButton).click();
	    driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.findElement(productButton).click();
		String actualTitle = driver.getTitle();
	   System.out.println(actualTitle);
	   Screenshot.takeScreenshot(driver);
	}
}
