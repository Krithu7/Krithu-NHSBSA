package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Common.DriverHandling;

public class EnterDOBPage extends DriverHandling{
	
	public void enterDate(String value) throws Exception
	{
		WebElement dateField = driver.findElement(By.id("dob-day"));
		dateField.sendKeys(value);
	}
	
	public void enterMonth(String value) throws Exception
	{
		WebElement monthField = driver.findElement(By.id("dob-month"));
		monthField.sendKeys(value);
	}
	
	public void enterYear(String value) throws Exception
	{
		WebElement yearField = driver.findElement(By.id("dob-year"));
		yearField.sendKeys(value);
	}
	
	public void clickNextButton() throws Exception
	{
		WebElement nextButton = driver.findElement(By.id("next-button"));
		nextButton.click();
	}

}
