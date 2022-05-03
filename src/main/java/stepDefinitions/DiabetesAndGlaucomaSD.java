package stepDefinitions;

import Pages.DiabetesQnPage;
import Pages.GlaucomaQnPage;
import io.cucumber.java.en.And;

public class DiabetesAndGlaucomaSD {
	
	DiabetesQnPage obj1 = new DiabetesQnPage();
	GlaucomaQnPage obj2 = new GlaucomaQnPage();
	
	@And("answers about diabetes \"([^\"]*)\" and glaucoma \"([^\"]*)\" for the test case \"([^\"]*)\"$")
	public void diabetesGlaucomaOptions(String diabetesStatus, String glaucomaStatus, String TCID) throws Exception
	{
		if(diabetesStatus.equals("Yes"))
			obj1.chooseDiabetesYes();
		else
			obj1.chooseDiabetesNo();
		
		obj1.clickNextButton();
		
		if(glaucomaStatus.equals("Yes"))
			obj2.chooseGlaucomaYes();
		else
			obj2.chooseGlaucomaNo();
		
		obj2.clickNextButton();
	}


}
