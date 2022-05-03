package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Common.DriverHandling;

public class UniversalCreditPage extends DriverHandling{
	
	public void chooseUniversalCreditYes() throws Exception
	{
		WebElement universalCreditYes = driver.findElement(By.id("yes-universal"));
		JavascriptExecutor radio = (JavascriptExecutor) driver;
		radio.executeScript("arguments[0].click();", universalCreditYes);
		radio.executeScript("arguments[0].checked=true",universalCreditYes);
	}
	
	public void chooseUniversalCreditNotYet() throws Exception
	{
		WebElement universalCreditNotYet = driver.findElement(By.id("not-yet"));
		JavascriptExecutor radio = (JavascriptExecutor) driver;
		radio.executeScript("arguments[0].click();", universalCreditNotYet);
		radio.executeScript("arguments[0].checked=true",universalCreditNotYet);
	}
	
	public void chooseUniversalCreditDifferent() throws Exception
	{
		WebElement universalCreditDifferent = driver.findElement(By.id("different-benefit"));
		JavascriptExecutor radio = (JavascriptExecutor) driver;
		radio.executeScript("arguments[0].click();", universalCreditDifferent);
		radio.executeScript("arguments[0].checked=true",universalCreditDifferent);
	}
	
	public void chooseJointUniversalCreditOptionYes() throws Exception
	{
		WebElement jointUniversalCreditOptionYes = driver.findElement(By.id("radio-yes"));
		JavascriptExecutor radio = (JavascriptExecutor) driver;
		radio.executeScript("arguments[0].click();", jointUniversalCreditOptionYes);
		radio.executeScript("arguments[0].checked=true",jointUniversalCreditOptionYes);
	}
	
	public void chooseJointUniversalCreditOptionNo() throws Exception
	{
		WebElement jointUniversalCreditOptionNo = driver.findElement(By.id("radio-yes"));
		JavascriptExecutor radio = (JavascriptExecutor) driver;
		radio.executeScript("arguments[0].click();", jointUniversalCreditOptionNo);
		radio.executeScript("arguments[0].checked=true",jointUniversalCreditOptionNo);
	}
	
	public void chooseTakeHomeRangeLessYes() throws Exception
	{
		WebElement takeHomeLessYes = driver.findElement(By.id("radio-yes"));
		JavascriptExecutor radio = (JavascriptExecutor) driver;
		radio.executeScript("arguments[0].click();", takeHomeLessYes);
		radio.executeScript("arguments[0].checked=true",takeHomeLessYes);
	}
	
	public void chooseTakeHomeRangeLessNo() throws Exception
	{
		WebElement takeHomeLessNo = driver.findElement(By.id("radio-yes"));
		JavascriptExecutor radio = (JavascriptExecutor) driver;
		radio.executeScript("arguments[0].click();", takeHomeLessNo);
		radio.executeScript("arguments[0].checked=true",takeHomeLessNo);
	}
	
	public void clickNextButton() throws Exception
	{
		WebElement nextButton = driver.findElement(By.id("next-button"));
		nextButton.click();
	}

}
