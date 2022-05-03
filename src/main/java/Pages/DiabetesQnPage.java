package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Common.DriverHandling;

public class DiabetesQnPage extends DriverHandling {
	
	public void chooseDiabetesYes() throws Exception
	{
		WebElement diabetesYes = driver.findElement(By.id("radio-yes"));
		JavascriptExecutor radio = (JavascriptExecutor) driver;
		radio.executeScript("arguments[0].click();", diabetesYes);
		radio.executeScript("arguments[0].checked=true",diabetesYes);
	}
	
	public void chooseDiabetesNo() throws Exception
	{
		WebElement diabetesNo = driver.findElement(By.id("radio-no"));
		JavascriptExecutor radio = (JavascriptExecutor) driver;
		radio.executeScript("arguments[0].click();", diabetesNo);
		radio.executeScript("arguments[0].checked=true",diabetesNo);
	}
	
	public void clickNextButton() throws Exception
	{
		WebElement nextButton = driver.findElement(By.id("next-button"));
		nextButton.click();
	}

}
