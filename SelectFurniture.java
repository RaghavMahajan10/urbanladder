package com.urbanladder.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.urbanladder.config.Variable;
import com.urbanladder.utils.Screenshot;

public class SelectFurniture extends Variable {
	WebDriver driver;
	public SelectFurniture(WebDriver driver)
	{
		this.driver=driver;
	}
	public void selectIt() throws Exception
	{
		WebElement element=driver.findElement(search);
		element.sendKeys(sofa);
		element.submit();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.findElement(checkbox).click();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.findElement(material).click();
		driver.findElement(leather).click();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.findElement(dropdown).click();
		driver.findElement(lowToHigh).click();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.findElement(add).click();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		Screenshot.takeScreenshot(driver);
	}
}
