package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Common.DriverHandling;

public class ArmedForcesInjuryQnPage extends DriverHandling {
	
	public void chooseInjuryYes() throws Exception
	{
		WebElement injuryYes = driver.findElement(By.id("radio-yes"));
		JavascriptExecutor radio = (JavascriptExecutor) driver;
		radio.executeScript("arguments[0].click();", injuryYes);
		radio.executeScript("arguments[0].checked=true",injuryYes);
	}
	
	public void chooseInjuryNo() throws Exception
	{
		WebElement injuryNo = driver.findElement(By.id("radio-no"));
		JavascriptExecutor radio = (JavascriptExecutor) driver;
		radio.executeScript("arguments[0].click();", injuryNo);
		radio.executeScript("arguments[0].checked=true",injuryNo);
	}
	
	public void clickNextButton() throws Exception
	{
		WebElement nextButton = driver.findElement(By.id("next-button"));
		nextButton.click();
	}

}
