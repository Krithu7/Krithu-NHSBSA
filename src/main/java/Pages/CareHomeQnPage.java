package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Common.DriverHandling;

public class CareHomeQnPage extends DriverHandling {
	
	public void chooseCareHomeYes() throws Exception
	{
		WebElement careHomeYes = driver.findElement(By.id("radio-yes"));
		JavascriptExecutor radio = (JavascriptExecutor) driver;
		radio.executeScript("arguments[0].click();", careHomeYes);
		radio.executeScript("arguments[0].checked=true",careHomeYes);
	}
	
	public void chooseCareHomeNo() throws Exception
	{
		WebElement careHomeNo = driver.findElement(By.id("radio-no"));
		JavascriptExecutor radio = (JavascriptExecutor) driver;
		radio.executeScript("arguments[0].click();", careHomeNo);
		radio.executeScript("arguments[0].checked=true",careHomeNo);
	}
	
	public void clickNextButton() throws Exception
	{
		WebElement nextButton = driver.findElement(By.id("next-button"));
		nextButton.click();
	}

}
