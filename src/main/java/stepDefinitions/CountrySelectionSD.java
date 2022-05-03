package stepDefinitions;

import Pages.CountrySelectionPage;
import io.cucumber.java.en.Then;

public class CountrySelectionSD {
	CountrySelectionPage obj = new CountrySelectionPage();
	
	@Then("^the user selects the country Wales and answers about GP and Dental practice$")
	public void selectWales() throws Exception
	{
		obj.chooseCountry();
		obj.clickNextButton();
		obj.chooseWalesGP();
		obj.clickNextButton();
		obj.chooseCountry();
		obj.clickNextButton();
	}

}
