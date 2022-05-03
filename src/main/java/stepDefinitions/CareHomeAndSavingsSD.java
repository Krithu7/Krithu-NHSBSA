package stepDefinitions;

import Pages.CareHomeQnPage;
import Pages.SavingsQnPage;
import io.cucumber.java.en.And;

public class CareHomeAndSavingsSD {
	
	CareHomeQnPage obj1 = new CareHomeQnPage();
	SavingsQnPage obj2 = new SavingsQnPage();
	
	@And("answers about care home \"([^\"]*)\" and savings \"([^\"]*)\" for the test case \"([^\"]*)\"$")
	public void careHomeSavingsOptions(String careHomeStatus, String savingsStatus, String TCID) throws Exception
	{
		if(careHomeStatus.equals("Yes"))
			obj1.chooseCareHomeYes();
		else
			obj1.chooseCareHomeNo();
		
		obj1.clickNextButton();
		
		if(savingsStatus.equals("Yes"))
			obj2.chooseSavingsYes();
		else
			obj2.chooseSavingsNo();
		
		obj2.clickNextButton();
	}

}
