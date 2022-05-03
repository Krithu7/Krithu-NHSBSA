package stepDefinitions;

import Pages.EnterDOBPage;
import io.cucumber.java.en.And;

public class EnterDOBSD {
	EnterDOBPage obj = new EnterDOBPage();
	
	@And("^enters the DOB fields - date \"([^\"]*)\" month \"([^\"]*)\" and year \"([^\"]*)\" for the test case \"([^\"]*)\"$")
	public void enterDOB(String date, String month, String year, String TCID) throws Exception
	{
		obj.enterDate(date);
		obj.enterMonth(month);
		obj.enterYear(year);
		obj.clickNextButton();
	}

}
