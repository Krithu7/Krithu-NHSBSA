package stepDefinitions;

import Pages.BenefitsPage;
import io.cucumber.java.en.And;

public class BenefitsSD {
	BenefitsPage obj = new BenefitsPage();
	
	@And("^answers benefit or tax credit question \"([^\"]*)\" for the test case \"([^\"]*)\"$")
	public void answerBenefitQn(String benefitoption, String TCID) throws Exception
	{
		if(benefitoption.equals("Yes"))
			obj.chooseBenefitsYes();
		else
			obj.chooseBenefitsNo();
		
		obj.clickNextButton();
	}

}
