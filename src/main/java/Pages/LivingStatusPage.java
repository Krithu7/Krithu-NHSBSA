package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Common.DriverHandling;

public class LivingStatusPage extends DriverHandling{
	
	public void chooseLivingStatusYes() throws Exception
	{
		WebElement livingStatusYes = driver.findElement(By.id("radio-yes"));
		JavascriptExecutor radio = (JavascriptExecutor) driver;
		radio.executeScript("arguments[0].click();", livingStatusYes);
		radio.executeScript("arguments[0].checked=true",livingStatusYes);
	}
	
	public void chooseLivingStatusNo() throws Exception
	{
		WebElement livingStatusNo = driver.findElement(By.id("radio-no"));
		JavascriptExecutor radio = (JavascriptExecutor) driver;
		radio.executeScript("arguments[0].click();", livingStatusNo);
		radio.executeScript("arguments[0].checked=true",livingStatusNo);
	}
	
	public void clickNextButton() throws Exception
	{
		WebElement nextButton = driver.findElement(By.id("next-button"));
		nextButton.click();
	}

}
