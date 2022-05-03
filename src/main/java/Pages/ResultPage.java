package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Common.DriverHandling;

public class ResultPage extends DriverHandling{
	
	public void captureResult1() throws Exception
	{ 
		WebElement nhsResult = driver.findElement(By.id("result-explanation"));
		System.out.println(nhsResult.getText());
		
	}
	
	public void captureResult2() throws Exception
	{ 
		WebElement nhsResult = driver.findElement(By.id("result-heading"));
		System.out.println(nhsResult.getText());
		
	}

}
