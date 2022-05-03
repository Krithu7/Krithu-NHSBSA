package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Common.DriverHandling;

public class StartPage extends DriverHandling{
	
	public void clickCookiesAccept() throws Exception
	{
		WebElement cookiesAccept = driver.findElement(By.id("nhsuk-cookie-banner__link_accept_analytics"));
		cookiesAccept.click();
	}
	
	public void clickStartButton() throws Exception
	{
		WebElement nextButton = driver.findElement(By.id("next-button"));
		nextButton.click();
	}

}
