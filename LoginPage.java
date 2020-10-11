package com.urbanladder.pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import com.urbanladder.config.Variable;
import com.urbanladder.utils.Screenshot;


public class LoginPage extends Variable {
	 WebDriver driver;
	 public LoginPage(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	public void login() throws Exception 
	{	driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(target1)).moveToElement(driver.findElement(target2)).click().build().perform();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.findElement(emailXpath).sendKeys(email);
		driver.findElement(passwordXpath).sendKeys(password);
		driver.findElement(clickLogin).click();
		Screenshot.takeScreenshot(driver);
	}

}
