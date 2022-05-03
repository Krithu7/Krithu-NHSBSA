package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Common.DriverHandling;

public class BenefitsPage extends DriverHandling{
	
	public void chooseBenefitsYes() throws Exception
	{
		WebElement benefitsYes = driver.findElement(By.id("radio-yes"));
		JavascriptExecutor radio = (JavascriptExecutor) driver;
		radio.executeScript("arguments[0].click();", benefitsYes);
		radio.executeScript("arguments[0].checked=true",benefitsYes);
	}
	
	public void chooseBenefitsNo() throws Exception
	{
		WebElement benefitsNo = driver.findElement(By.id("radio-no"));
		JavascriptExecutor radio = (JavascriptExecutor) driver;
		radio.executeScript("arguments[0].click();", benefitsNo);
		radio.executeScript("arguments[0].checked=true",benefitsNo);
	}
	
	public void clickNextButton() throws Exception
	{
		WebElement nextButton = driver.findElement(By.id("next-button"));
		nextButton.click();
	}

}
