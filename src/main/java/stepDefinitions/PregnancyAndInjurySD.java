package stepDefinitions;


import Pages.PregnanyQnPage;
import Pages.ArmedForcesInjuryQnPage;
import io.cucumber.java.en.Then;

public class PregnancyAndInjurySD {
	
	PregnanyQnPage obj1 = new PregnanyQnPage();
	ArmedForcesInjuryQnPage obj2 = new ArmedForcesInjuryQnPage();
	
	@Then("chooses suitable answer for pregnancy question \"([^\"]*)\" and armed forces illness \"([^\"]*)\" for the test case \"([^\"]*)\"$")
	public void pregnancyInjuryOptions(String pregnancyStatus, String illnessStatus, String TCID) throws Exception
	{
		if(pregnancyStatus.equals("Yes"))
			obj1.choosePregnancyYes();
		else
			obj1.choosePregnancyNo();
		
		obj1.clickNextButton();
		
		if(illnessStatus.equals("Yes"))
			obj2.chooseInjuryYes();
		else
			obj2.chooseInjuryNo();
		
		obj2.clickNextButton();
	}

}
