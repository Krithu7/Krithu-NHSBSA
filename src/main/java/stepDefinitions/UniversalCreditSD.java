package stepDefinitions;

import Pages.UniversalCreditPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class UniversalCreditSD {
	UniversalCreditPage obj = new UniversalCreditPage();
	
	@Then("^chooses suitable answer for Universal credit question \"([^\"]*)\" for the test case \"([^\"]*)\"$")
	public void universalCreditQn(String universalCredit, String TCID) throws Exception
	{
		if(universalCredit.equals("Yes"))
			obj.chooseUniversalCreditYes();
		else if(universalCredit.equals("Not-Yet"))
			obj.chooseUniversalCreditNotYet();
		else if(universalCredit.equals("Different"))
			obj.chooseUniversalCreditDifferent();
		
		obj.clickNextButton();
	}
	
	@And("^answers the Universal credit sub-question \"([^\"]*)\" for the test case \"([^\"]*)\"$")
	public void jointUniversalQn(String universalCreditSub, String TCID) throws Exception
	{
		if(universalCreditSub.equals("Yes"))
			obj.chooseJointUniversalCreditOptionYes();
		else
			obj.chooseJointUniversalCreditOptionNo();
		
		obj.clickNextButton();
	}
	
	@And("^answers Universal credit period take-home range related question \"([^\"]*)\" for the test case \"([^\"]*)\"$")
	public void takeHomeLessRange(String takeHomeLess, String TCID) throws Exception
	{
		if(takeHomeLess.equals("Yes"))
			obj.chooseTakeHomeRangeLessYes();
		else
			obj.chooseTakeHomeRangeLessNo();
		
		obj.clickNextButton();
	}

}
