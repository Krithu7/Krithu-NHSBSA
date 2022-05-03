package stepDefinitions;

import Pages.ResultPage;
import io.cucumber.java.en.Then;

public class ResultSD {
	ResultPage obj = new ResultPage();
	
	@Then("^gets the result for the test case \"([^\"]*)\"$")
	public void getResult1(String TCID) throws Exception
	{
		obj.captureResult1();
	}
	
	@Then("^gets the final result for the test case \"([^\"]*)\"$")
	public void getResult2(String TCID) throws Exception
	{
		obj.captureResult2();
	}

}
