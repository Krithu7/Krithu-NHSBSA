package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Common.DriverHandling;

public class PregnanyQnPage extends DriverHandling {
	
	public void choosePregnancyYes() throws Exception
	{
		WebElement pregnancyYes = driver.findElement(By.id("radio-yes"));
		JavascriptExecutor radio = (JavascriptExecutor) driver;
		radio.executeScript("arguments[0].click();", pregnancyYes);
		radio.executeScript("arguments[0].checked=true",pregnancyYes);
	}
	
	public void choosePregnancyNo() throws Exception
	{
		WebElement pregnancyNo = driver.findElement(By.id("radio-no"));
		JavascriptExecutor radio = (JavascriptExecutor) driver;
		radio.executeScript("arguments[0].click();", pregnancyNo);
		radio.executeScript("arguments[0].checked=true",pregnancyNo);
	}
	
	public void clickNextButton() throws Exception
	{
		WebElement nextButton = driver.findElement(By.id("next-button"));
		nextButton.click();
	}
	

}
