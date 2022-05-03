package stepDefinitions;

import Pages.LivingStatusPage;
import io.cucumber.java.en.And;

public class LivingStatusSD {
	LivingStatusPage obj = new LivingStatusPage();
	
	@And("^answers living status with partner \"([^\"]*)\" for the test case \"([^\"]*)\"$")
	public void selectLivingStatus(String livingstatus, String TCID) throws Exception
	{
		if(livingstatus.equals("Yes"))
			obj.chooseLivingStatusYes();
		else
			obj.chooseLivingStatusNo();
		
		obj.clickNextButton();
	}

}
