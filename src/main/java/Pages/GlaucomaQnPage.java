package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Common.DriverHandling;

public class GlaucomaQnPage extends DriverHandling {
	
	public void chooseGlaucomaYes() throws Exception
	{
		WebElement glaucomaYes = driver.findElement(By.id("radio-yes"));
		JavascriptExecutor radio = (JavascriptExecutor) driver;
		radio.executeScript("arguments[0].click();", glaucomaYes);
		radio.executeScript("arguments[0].checked=true",glaucomaYes);
	}
	
	public void chooseGlaucomaNo() throws Exception
	{
		WebElement glaucomaNo = driver.findElement(By.id("radio-no"));
		JavascriptExecutor radio = (JavascriptExecutor) driver;
		radio.executeScript("arguments[0].click();", glaucomaNo);
		radio.executeScript("arguments[0].checked=true",glaucomaNo);
	}
	
	public void clickNextButton() throws Exception
	{
		WebElement nextButton = driver.findElement(By.id("next-button"));
		nextButton.click();
	}

}
