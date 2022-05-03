package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Common.DriverHandling;

public class SavingsQnPage extends DriverHandling {
	
	public void chooseSavingsYes() throws Exception
	{
		WebElement savingsYes = driver.findElement(By.id("radio-yes"));
		JavascriptExecutor radio = (JavascriptExecutor) driver;
		radio.executeScript("arguments[0].click();", savingsYes);
		radio.executeScript("arguments[0].checked=true",savingsYes);
	}
	
	public void chooseSavingsNo() throws Exception
	{
		WebElement savingsNo = driver.findElement(By.id("radio-no"));
		JavascriptExecutor radio = (JavascriptExecutor) driver;
		radio.executeScript("arguments[0].click();", savingsNo);
		radio.executeScript("arguments[0].checked=true",savingsNo);
	}
	
	public void clickNextButton() throws Exception
	{
		WebElement nextButton = driver.findElement(By.id("next-button"));
		nextButton.click();
	}

}
